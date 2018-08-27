/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:26:25 GMT 2018
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
      int int0 = Unicode.toUpper(1259);
      assertEquals(1258, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(3860);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(412);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Unicode.toLower(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Unicode.simpleFold((-3444));
      assertEquals((-3444), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Unicode.simpleFold(1252);
      assertEquals(1253, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint((-129));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Unicode.toUpper((-442));
      assertEquals((-442), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(3860);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle((-1697));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Unicode.toUpper(3860);
      assertEquals(3860, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(498);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Unicode.simpleFold(65338);
      assertEquals(65370, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper((-1772));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Unicode.MAX_LATIN1;
      assertEquals(255, int0);
      
      boolean boolean0 = Unicode.isLower(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2028);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(65340);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1114111);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Unicode.simpleFold(70);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Unicode.simpleFold(97);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = Unicode.toLower(8136);
      assertEquals(8050, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(256);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = Unicode.toUpper(115);
      assertEquals(83, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = Unicode.toUpper(127);
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2408);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(8454);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Unicode.simpleFold(1013);
      assertEquals(917, int0);
  }
}
