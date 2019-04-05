/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:46:52 GMT 2019
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
      int int0 = Unicode.simpleFold(65);
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Unicode.toUpper(97);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Unicode.simpleFold(579);
      assertEquals(384, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(161);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(127);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(255);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(255);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(1718);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(453);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Unicode.toUpper(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Unicode.toLower(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Unicode.toLower((-1039));
      assertEquals((-1039), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Unicode.simpleFold((-1172));
      assertEquals((-1172), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper((-661));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle((-661));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint((-1075));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Unicode.simpleFold(256);
      assertEquals(257, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = Unicode.simpleFold(953);
      assertEquals(8126, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = Unicode.simpleFold(42647);
      assertEquals(42646, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = Unicode.simpleFold(127);
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = Unicode.simpleFold(122);
      assertEquals(90, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = Unicode.toUpper((-3182));
      assertEquals((-3182), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Unicode.toUpper(3072);
      assertEquals(3072, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(65284);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(6153);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(4969);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2865);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Unicode.isLower((-2));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(256);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(257);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1762);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1217);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(3072);
      assertFalse(boolean0);
  }
}
