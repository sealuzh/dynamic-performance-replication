/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:19:41 GMT 2019
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
      intArray0[0] = 112;
      intArray0[1] = 66640;
      intArray0[2] = 1;
      intArray0[3] = (-1538);
      intArray0[4] = 213;
      intArray0[5] = (-1);
      intArray0[6] = 1459;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray1, (-1538));
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
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 91;
      intArray0[1] = (-1753);
      intArray0[2] = 1849;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[6][3];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass1.appendTable(intArray1);
      CharClass charClass3 = charClass2.appendRange(286, 112);
      int[] intArray2 = charClass3.toArray();
      assertArrayEquals(new int[] {91, (-1753), 1114111}, intArray0);
      assertSame(intArray0, intArray2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      int int0 = 66639;
      intArray0[0] = 66639;
      int int1 = 69633;
      intArray0[1] = 69633;
      intArray0[2] = 69450;
      intArray0[3] = 3190;
      intArray0[4] = 2143;
      intArray0[5] = (-63829);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      CharClass charClass2 = charClass1.cleanClass();
      int[][] intArray1 = new int[5][1];
      intArray1[0] = intArray0;
      int[] intArray2 = new int[3];
      intArray2[0] = 2143;
      intArray2[1] = (-63829);
      intArray2[2] = (-63829);
      intArray1[1] = intArray2;
      int[] intArray3 = new int[2];
      intArray3[0] = 2143;
      intArray3[1] = 2143;
      intArray1[2] = intArray3;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      // Undeclared exception!
      try { 
        charClass2.appendNegatedTable(intArray1);
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
      int[] intArray0 = new int[6];
      intArray0[0] = 120171;
      intArray0[1] = 1114111;
      intArray0[2] = 1118;
      intArray0[3] = 1019;
      intArray0[4] = (-1054);
      intArray0[5] = 782;
      CharClass charClass0 = new CharClass(intArray0);
      int[] intArray1 = new int[6];
      intArray1[0] = 120171;
      intArray1[1] = 1114111;
      intArray1[2] = (-3952);
      intArray1[3] = 1114111;
      intArray1[4] = (-1054);
      intArray1[5] = (-1054);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray1);
      CharClass charClass2 = charClass1.negateClass();
      CharClass charClass3 = charClass2.appendClass(intArray1);
      String string0 = charClass3.toString();
      assertEquals("[0xfffff090-0x10ffff]", string0);
      assertArrayEquals(new int[] {120171, 1114111, 1118, 1019, (-1054), 782}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1417);
      intArray0[1] = 408;
      CharClass charClass0 = new CharClass(intArray0);
      int[] intArray1 = new int[6];
      charClass0.cleanClass();
      intArray1[0] = (-1417);
      intArray1[1] = (-1417);
      intArray1[2] = 408;
      intArray1[3] = (-1417);
      intArray1[4] = 408;
      intArray1[5] = 408;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray1, 1236);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedRange((-192), (-192));
      CharClass charClass2 = charClass1.appendLiteral((-4779), (-4779));
      CharClass charClass3 = charClass2.appendClass(intArray0);
      CharClass charClass4 = charClass3.appendClassWithSign(intArray0, (-16905));
      int[][] intArray1 = new int[4][1];
      intArray1[0] = intArray0;
      int[] intArray2 = new int[9];
      intArray2[0] = (-192);
      intArray2[1] = (-192);
      intArray2[2] = 1688;
      intArray2[3] = (-16895);
      intArray2[4] = (-16905);
      intArray2[5] = (-4779);
      intArray2[6] = (-192);
      intArray2[7] = (-192);
      intArray2[8] = (-192);
      intArray1[1] = intArray2;
      intArray1[2] = intArray0;
      int[] intArray3 = new int[9];
      intArray3[0] = 1688;
      intArray3[1] = (-16905);
      intArray3[2] = (-192);
      intArray3[3] = (-437);
      intArray3[4] = (-16905);
      intArray3[5] = (-16905);
      intArray3[6] = (-16905);
      intArray3[7] = 1688;
      intArray3[8] = (-192);
      intArray1[3] = intArray3;
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
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-3735);
      intArray0[1] = (-16922);
      intArray0[2] = (-16904);
      intArray0[3] = (-3276);
      intArray0[4] = 452;
      intArray0[5] = (-206);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-16892));
      CharClass charClass2 = charClass1.appendRange(452, 32);
      int[][] intArray1 = new int[0][0];
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, (-16904));
      charClass3.toString();
      charClass0.appendTable(intArray1);
      charClass0.appendFoldedClass(intArray0);
      charClass3.appendLiteral(2, (-16922));
      assertArrayEquals(new int[] {(-3735), (-16922), (-16921), (-3276), (-16921), 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 66640;
      int int0 = (-1);
      intArray0[1] = (-1);
      int int1 = 3354;
      intArray0[2] = 3354;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
      int int2 = 32;
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
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = 91;
      intArray0[1] = (-2397);
      intArray0[2] = 0;
      intArray0[3] = 738;
      intArray0[4] = 0;
      intArray0[5] = 2;
      intArray0[6] = 0;
      intArray0[7] = (-1337);
      charClass0.appendNegatedClass(intArray0);
      String string0 = charClass0.toString();
      assertEquals("[0xfffff6a4-0x10ffff]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 0;
      intArray0[0] = 0;
      int int1 = 6103;
      intArray0[1] = 6103;
      CharClass charClass0 = new CharClass(intArray0);
      int int2 = 0;
      int int3 = 16;
      CharClass charClass1 = charClass0.appendFoldedRange(0, 16);
      CharClass charClass2 = charClass1.appendLiteral(6103, 0);
      int[] intArray1 = null;
      // Undeclared exception!
      try { 
        charClass2.appendNegatedClass((int[]) null);
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
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = (-2463);
      intArray0[2] = 9632;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1137;
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-221));
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 601;
      CharClass charClass0 = new CharClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[9];
      intArray1[0] = 1938;
      intArray1[1] = 2754;
      intArray1[2] = 7006;
      intArray1[3] = 0;
      intArray1[4] = (-3472);
      intArray1[5] = 64;
      intArray1[6] = 0;
      intArray1[7] = 1113;
      intArray1[8] = 456;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[5];
      intArray2[0] = 456;
      intArray2[1] = 416;
      intArray2[2] = 1938;
      intArray2[3] = 1938;
      intArray2[4] = 0;
      intArray0[1] = intArray2;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, (-323));
      CharClass charClass2 = charClass1.cleanClass();
      // Undeclared exception!
      charClass2.appendFoldedRange((-4135), 2754);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = (-1606);
      intArray0[0] = (-1606);
      int int1 = 3296;
      intArray0[1] = 3296;
      int int2 = 1234;
      intArray0[2] = 1234;
      int int3 = (-198);
      intArray0[3] = (-198);
      intArray0[4] = 407;
      int int4 = 1501;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 1501);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 608;
      intArray0[0] = 608;
      intArray0[1] = (-2972);
      intArray0[2] = (-153);
      intArray0[3] = 93;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      CharClass charClass2 = charClass0.appendFoldedRange((-153), 32);
      charClass2.negateClass();
      charClass0.appendRange(93, 598);
      CharClass charClass3 = charClass0.cleanClass();
      CharClass charClass4 = charClass1.appendFoldedRange(1116, 598);
      int[] intArray1 = charClass1.toArray();
      charClass4.appendClassWithSign(intArray0, (-2972));
      int[][] intArray2 = new int[4][2];
      intArray2[0] = intArray1;
      intArray2[1] = intArray0;
      intArray2[2] = intArray1;
      intArray2[3] = intArray0;
      // Undeclared exception!
      try { 
        charClass3.appendTable(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[1] = (-2397);
      intArray0[2] = 0;
      intArray0[4] = 0;
      intArray0[5] = 2;
      intArray0[6] = 0;
      intArray0[7] = (-1337);
      charClass0.appendNegatedClass(intArray0);
      String string0 = charClass0.toString();
      assertEquals("[0xfffff6a4-0x10ffff]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[6][3];
      int[] intArray1 = new int[1];
      intArray1[0] = 1005;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 1005;
      intArray2[1] = 1005;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 1005;
      intArray3[1] = 1153;
      intArray3[2] = 3635;
      intArray3[3] = 1005;
      intArray3[4] = 1005;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[3];
      intArray4[0] = 1005;
      intArray4[1] = 3635;
      intArray4[2] = 1153;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[7];
      intArray5[0] = 1153;
      intArray5[1] = 1005;
      intArray5[2] = 3635;
      intArray5[3] = 1153;
      intArray5[4] = 1005;
      intArray5[5] = 1153;
      intArray5[6] = 1005;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = 1153;
      intArray6[1] = 1005;
      intArray6[2] = 3635;
      intArray6[3] = 3635;
      intArray0[5] = intArray6;
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
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[6][3];
      int[] intArray1 = new int[5];
      intArray1[0] = (-860);
      int int0 = 1569;
      intArray1[1] = 1569;
      int int1 = 8991;
      intArray1[2] = 8991;
      int int2 = (-2057);
      intArray1[3] = (-2057);
      int int3 = 408;
      intArray1[4] = 408;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = (-2057);
      intArray0[1] = intArray2;
      int[] intArray3 = new int[3];
      intArray3[0] = 1569;
      int int4 = 42607;
      intArray3[1] = 42607;
      intArray3[2] = 205;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[4];
      int int5 = 619;
      intArray4[0] = 619;
      intArray4[1] = 8991;
      intArray4[2] = 8991;
      intArray4[3] = 8991;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[6];
      intArray5[0] = 619;
      intArray5[1] = (-488);
      intArray5[2] = (-860);
      int int6 = 189;
      intArray5[3] = 189;
      intArray5[4] = (-2057);
      intArray5[5] = 205;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[6];
      intArray6[0] = 205;
      intArray6[1] = 8991;
      intArray6[2] = (-488);
      intArray6[3] = (-860);
      intArray6[4] = 408;
      intArray6[5] = 619;
      intArray0[5] = intArray6;
      int int7 = 1422;
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign(intArray0, 1422);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[3][0];
      int[] intArray1 = new int[6];
      intArray1[0] = 3062;
      intArray1[1] = 9837;
      intArray1[2] = (-2);
      intArray1[3] = 900;
      intArray1[4] = 6;
      intArray1[5] = 1938;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[8];
      intArray2[0] = (-2);
      intArray2[1] = 6;
      intArray2[2] = 64;
      intArray2[3] = 900;
      intArray2[4] = 900;
      intArray2[5] = 9837;
      intArray2[6] = 9837;
      intArray2[7] = 6;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[1];
      intArray3[0] = (-2);
      intArray0[2] = intArray3;
      // Undeclared exception!
      charClass0.appendTableWithSign(intArray0, (-2));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = 2237;
      intArray0[1] = 66560;
      intArray0[2] = (-2891);
      intArray0[3] = 601;
      intArray0[4] = 4;
      intArray0[5] = (-2099);
      intArray0[6] = (-2);
      intArray0[7] = (-226);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.negateClass();
      int[][] intArray1 = new int[0][1];
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, 66560);
      CharClass charClass4 = charClass3.appendFoldedRange(0, 386);
      charClass4.negateClass();
      CharClass charClass5 = charClass4.cleanClass();
      charClass5.appendClassWithSign(intArray0, 0);
      charClass1.appendClassWithSign(intArray0, 42894);
      charClass4.appendRange(43042, 66560);
      charClass1.appendTableWithSign(intArray1, (-226));
      int[] intArray2 = charClass4.toArray();
      assertEquals(2, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-116);
      intArray0[1] = 4;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-2364));
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.appendFoldedRange(65308, (-116));
      charClass2.appendFoldedRange(65308, 65308);
      charClass3.appendLiteral(2299, 4);
      CharClass charClass4 = charClass2.appendClass(intArray0);
      charClass0.negateClass();
      charClass4.appendClassWithSign(intArray0, 2299);
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 1162);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
