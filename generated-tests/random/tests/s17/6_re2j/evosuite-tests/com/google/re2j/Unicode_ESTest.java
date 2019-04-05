/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:33:01 GMT 2019
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
      int int0 = Unicode.simpleFold(376);
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Unicode.toLower(1312);
      assertEquals(1313, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(1014);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(42897);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(1200);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Unicode.toUpper((-30));
      assertEquals((-30), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Unicode.toLower((-555));
      assertEquals((-555), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper((-1228));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle((-4305));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Unicode.isLower((-30));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Unicode.simpleFold(1012);
      assertEquals(920, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Unicode.simpleFold(65046);
      assertEquals(65046, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Unicode.simpleFold(90);
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Unicode.toUpper(115);
      assertEquals(83, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Unicode.simpleFold((-313));
      assertEquals((-313), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Unicode.simpleFold(127);
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = Unicode.toUpper(1018);
      assertEquals(1018, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2762);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(65533);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(43487);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(43453);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(8088);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint((-1797));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(255);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(374);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1780);
      assertTrue(boolean0);
  }
}
