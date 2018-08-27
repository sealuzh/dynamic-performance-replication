/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 18:13:58 GMT 2018
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
      boolean boolean0 = Unicode.isLower(8080);
      boolean boolean1 = Unicode.isTitle(3718);
      assertFalse(boolean1);
      
      Unicode.toUpper(8273);
      Unicode.simpleFold(0);
      Unicode.toUpper(0);
      Unicode.simpleFold(0);
      Unicode.toUpper(144);
      Unicode.isTitle((-1717));
      Unicode.isUpper(8080);
      int int0 = Unicode.simpleFold(8273);
      assertEquals(8273, int0);
      
      Unicode.isTitle(0);
      Unicode.toLower(65373);
      Unicode.isTitle((-1504));
      Unicode.toLower((-3770));
      Unicode.toLower(8273);
      boolean boolean2 = Unicode.isPrint(0);
      assertFalse(boolean2 == boolean0);
      
      int int1 = Unicode.simpleFold(0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Unicode.simpleFold(127);
      Unicode.isTitle((-3094));
      boolean boolean0 = Unicode.isUpper((-3094));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Unicode.MAX_ASCII;
      Unicode.isUpper(127);
      int int1 = Unicode.toUpper(981);
      assertEquals(934, int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(4256);
      boolean boolean1 = Unicode.isPrint((-4873));
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = Unicode.isLower(14);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Unicode.toUpper(497);
      assertEquals(497, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(3169);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Unicode.isLower(11361);
      Unicode.simpleFold(591);
      int int0 = Unicode.simpleFold(591);
      assertEquals(590, int0);
      
      Unicode.toLower((-3494));
      Unicode.isUpper(0);
      Unicode.toUpper(691);
      boolean boolean0 = Unicode.isPrint(2118);
      Unicode.simpleFold((-1879));
      Unicode.isTitle(5759);
      boolean boolean1 = Unicode.isUpper(11361);
      assertFalse(boolean1 == boolean0);
      
      boolean boolean2 = Unicode.isPrint(66639);
      Unicode.toUpper(0);
      Unicode.toLower((-1879));
      int int1 = Unicode.simpleFold(5759);
      assertEquals(5759, int1);
      
      Unicode.isUpper((-2953));
      Unicode.toUpper(0);
      Unicode.toUpper((-2527));
      Unicode.isLower((-1250));
      int int2 = Unicode.simpleFold(11361);
      assertEquals(11360, int2);
      
      boolean boolean3 = Unicode.isPrint(0);
      assertFalse(boolean3 == boolean2);
      
      Unicode.isLower(161);
      Unicode.isTitle((-556));
      int int3 = Unicode.simpleFold((-1350));
      assertEquals((-1350), int3);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(3203);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Unicode.MAX_LATIN1;
      boolean boolean0 = Unicode.isPrint(746);
      assertTrue(boolean0);
      
      boolean boolean1 = Unicode.isTitle(59);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(3182);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Unicode.isTitle(1);
      Unicode.isPrint(1);
      Unicode.isPrint(1);
      Unicode.isTitle(1);
      Unicode.simpleFold(0);
      Unicode.isPrint(0);
      Unicode.toLower(0);
      Unicode.isLower(780);
      Unicode.isTitle(122);
      Unicode.simpleFold(0);
      Unicode.toUpper(0);
      Unicode.isTitle(0);
      boolean boolean0 = Unicode.isTitle(1);
      int int0 = Unicode.toLower(1);
      assertEquals(1, int0);
      
      boolean boolean1 = Unicode.isPrint(3421);
      Unicode.isUpper(0);
      Unicode.isTitle(0);
      Unicode.isTitle(0);
      boolean boolean2 = Unicode.isLower(122);
      assertFalse(boolean2 == boolean0);
      
      Unicode.isUpper(122);
      boolean boolean3 = Unicode.isPrint(1);
      assertTrue(boolean3 == boolean1);
      
      Unicode.toUpper(0);
      Unicode.isLower(0);
      int int1 = Unicode.simpleFold((-4341));
      assertEquals((-4341), int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Unicode.MAX_FOLD;
      boolean boolean0 = Unicode.isPrint(1803);
      boolean boolean1 = Unicode.isLower((-2920));
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Unicode.isLower(205);
      boolean boolean0 = Unicode.isTitle(826);
      assertFalse(boolean0);
      
      int int0 = Unicode.toUpper((-2495));
      assertEquals((-2495), int0);
      
      Unicode.isLower(205);
      int int1 = Unicode.toUpper(205);
      assertEquals(205, int1);
      
      Unicode.isTitle(0);
      int int2 = Unicode.toLower(122);
      assertEquals(122, int2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Unicode.toLower(65);
      assertEquals(97, int0);
      
      boolean boolean0 = Unicode.isTitle(97);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Unicode.toLower(119156);
      Unicode.simpleFold(119156);
      Unicode.toUpper(433);
      Unicode.isUpper(0);
      Unicode.simpleFold(0);
      Unicode.toUpper(119156);
      Unicode.toLower(433);
      boolean boolean0 = Unicode.isTitle(1137);
      int int0 = Unicode.toUpper(433);
      assertEquals(433, int0);
      
      Unicode.isLower((-2950));
      int int1 = Unicode.simpleFold((-2950));
      assertEquals((-2950), int1);
      
      Unicode.isUpper((-2950));
      Unicode.toUpper((-2950));
      Unicode.isTitle((-282));
      int int2 = Unicode.simpleFold(433);
      assertEquals(650, int2);
      
      boolean boolean1 = Unicode.isUpper(433);
      assertTrue(boolean1);
      
      Unicode.isLower((-282));
      Unicode.isTitle(433);
      Unicode.toLower(8263);
      Unicode.simpleFold(3685);
      Unicode.isUpper((-282));
      Unicode.isTitle((-282));
      boolean boolean2 = Unicode.isTitle(650);
      assertFalse(boolean2);
      
      Unicode.toUpper(119156);
      Unicode.isLower(0);
      Unicode.isTitle(119156);
      Unicode.isTitle((-282));
      Unicode.simpleFold(0);
      boolean boolean3 = Unicode.isUpper(0);
      assertTrue(boolean3 == boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(0);
      Unicode.isUpper(0);
      Unicode.toLower(0);
      boolean boolean1 = Unicode.isPrint(0);
      Unicode.isTitle(0);
      Unicode.toLower(95);
      boolean boolean2 = Unicode.isPrint(1053);
      Unicode.toLower(0);
      Unicode.isLower((-1062));
      Unicode.toLower(2208);
      Unicode.isTitle(2363);
      Unicode.toLower(0);
      Unicode.toLower(0);
      Unicode.isTitle(0);
      Unicode.isLower((-1498));
      Unicode.toLower((-2662));
      boolean boolean3 = Unicode.isPrint(95);
      assertTrue(boolean3 == boolean2);
      
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
      
      int int1 = Unicode.simpleFold(2208);
      assertEquals(2208, int1);
      
      boolean boolean4 = Unicode.isTitle(0);
      assertTrue(boolean4 == boolean1);
      
      boolean boolean5 = Unicode.isLower(0);
      assertTrue(boolean5 == boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(186);
      boolean boolean1 = Unicode.isTitle(186);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Unicode.isPrint(851);
      Unicode.isTitle(851);
      Unicode.toUpper(851);
      int int0 = Unicode.simpleFold(1495);
      assertEquals(1495, int0);
      
      Unicode.simpleFold(0);
      int int1 = Unicode.simpleFold(0);
      assertEquals(0, int1);
      
      Unicode.isTitle(851);
      Unicode.isTitle((-198));
      int int2 = Unicode.toUpper(467);
      assertEquals(467, int2);
      
      Unicode.isTitle((-224));
      boolean boolean0 = Unicode.isPrint(851);
      boolean boolean1 = Unicode.isPrint(467);
      Unicode.toLower((-224));
      Unicode.isLower(0);
      boolean boolean2 = Unicode.isUpper(851);
      assertFalse(boolean2 == boolean0);
      
      Unicode.toUpper(1556);
      boolean boolean3 = Unicode.isTitle(1495);
      assertFalse(boolean3 == boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(97);
      assertFalse(boolean0);
      
      int int0 = Unicode.toUpper(97);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Unicode.toUpper(127);
      assertEquals(127, int0);
      
      Unicode.isUpper(127);
      boolean boolean0 = Unicode.isUpper(43968);
      int int1 = Unicode.simpleFold(2298);
      assertEquals(2298, int1);
      
      boolean boolean1 = Unicode.isPrint(43968);
      assertFalse(boolean1 == boolean0);
      
      Unicode.isLower(127);
      Unicode.isUpper(255);
      boolean boolean2 = Unicode.isUpper(8155);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Unicode.toUpper(2559);
      Unicode.simpleFold(1800);
      Unicode.toLower(1800);
      Unicode.simpleFold((-1021));
      Unicode.simpleFold(0);
      boolean boolean0 = Unicode.isPrint(1800);
      boolean boolean1 = Unicode.isLower(2559);
      assertFalse(boolean1 == boolean0);
      
      Unicode.isLower(0);
      int int0 = Unicode.toLower(0);
      assertEquals(0, int0);
      
      Unicode.toUpper(0);
      int int1 = Unicode.simpleFold(2559);
      assertEquals(2559, int1);
      
      Unicode.isTitle((-934));
      Unicode.isUpper(161);
      Unicode.isLower(0);
      boolean boolean2 = Unicode.isLower((-136));
      assertFalse(boolean2 == boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Unicode.simpleFold(122);
      Unicode.simpleFold(90);
      boolean boolean0 = Unicode.isPrint(30);
      boolean boolean1 = Unicode.isLower(122);
      Unicode.isUpper(30);
      Unicode.toUpper(122);
      Unicode.isPrint(90);
      Unicode.toLower(30);
      boolean boolean2 = Unicode.isUpper(90);
      assertTrue(boolean2);
      
      Unicode.isLower(90);
      Unicode.isPrint(1784);
      Unicode.isLower(90);
      Unicode.simpleFold(1114111);
      Unicode.isTitle((-696));
      int int0 = Unicode.simpleFold(122);
      assertEquals(90, int0);
      
      Unicode.toUpper(30);
      Unicode.simpleFold(30);
      Unicode.isUpper(1623);
      int int1 = Unicode.simpleFold(30);
      assertEquals(30, int1);
      
      Unicode.isLower(43486);
      int int2 = Unicode.simpleFold(2816);
      assertEquals(2816, int2);
      
      Unicode.isTitle(90);
      Unicode.isLower(0);
      boolean boolean3 = Unicode.isTitle(43486);
      assertFalse(boolean3 == boolean1);
      
      Unicode.isTitle(122);
      boolean boolean4 = Unicode.isPrint(43486);
      assertFalse(boolean4 == boolean0);
      
      int int3 = Unicode.simpleFold(90);
      assertEquals(122, int3);
      
      int int4 = Unicode.toLower(30);
      assertEquals(30, int4);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Unicode.toLower(2025);
      boolean boolean0 = Unicode.isLower(2025);
      Unicode.isTitle(2025);
      Unicode.isUpper(2025);
      Unicode.simpleFold((-1098));
      int int0 = Unicode.simpleFold(2025);
      assertEquals(2025, int0);
      
      Unicode.isUpper(0);
      boolean boolean1 = Unicode.isPrint(173);
      assertTrue(boolean1 == boolean0);
      
      int int1 = Unicode.simpleFold((-2725));
      assertEquals((-2725), int1);
  }
}