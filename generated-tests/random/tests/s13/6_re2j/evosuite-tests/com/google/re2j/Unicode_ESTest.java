/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:27:35 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.re2j.Unicode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Unicode_ESTest extends Unicode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = Unicode.toLower(90);
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(250);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(127);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(1231);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(1104);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Unicode.toUpper(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Unicode.toUpper((-1957));
      assertEquals((-1957), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Unicode.toLower(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Unicode.toLower((-101));
      assertEquals((-101), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper((-2393));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle((-118));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Unicode.simpleFold(981);
      assertEquals(934, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Unicode.simpleFold(65533);
      assertEquals(65533, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = Unicode.toLower(65);
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Unicode.simpleFold(127);
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Unicode.toUpper(97);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = Unicode.simpleFold((-5068));
      assertEquals((-5068), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = Unicode.toUpper(255);
      assertEquals(376, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2163);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(6824);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2790);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(65533);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2752);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(161);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint((-1628));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Unicode.isLower((-256));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(199);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(382);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1396);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(43301);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = Unicode.simpleFold(258);
      assertEquals(259, int0);
  }
}