/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 10:52:05 GMT 2018
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
      int int0 = Unicode.toUpper(1652);
      assertEquals(1652, int0);
      
      int int1 = Unicode.toLower(1652);
      assertEquals(1652, int1);
      
      Unicode.isTitle(0);
      boolean boolean0 = Unicode.isPrint(1652);
      boolean boolean1 = Unicode.isPrint(1652);
      Unicode.isPrint(1652);
      Unicode.toUpper((-741));
      Unicode.isLower((-1632));
      Unicode.toUpper((-1451));
      boolean boolean2 = Unicode.isLower(1652);
      int int2 = Unicode.toLower(20);
      assertEquals(20, int2);
      
      int int3 = Unicode.simpleFold((-1632));
      assertEquals((-1632), int3);
      
      boolean boolean3 = Unicode.isLower((-741));
      assertTrue(boolean3 == boolean2);
      
      boolean boolean4 = Unicode.isPrint(20);
      assertFalse(boolean4 == boolean0);
      
      Unicode.toUpper((-1632));
      Unicode.toUpper((-1632));
      boolean boolean5 = Unicode.isTitle(254);
      assertFalse(boolean5 == boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Unicode.MIN_FOLD;
      int int1 = Unicode.simpleFold((-1951));
      assertEquals((-1951), int1);
      
      Unicode.isTitle(256);
      int int2 = Unicode.MAX_RUNE;
      boolean boolean0 = Unicode.isUpper(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(3859);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Unicode.isUpper(17);
      Unicode.isLower((-923));
      int int0 = Unicode.toUpper(981);
      assertEquals(934, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Unicode.toUpper(8115);
      assertEquals(8124, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(3171);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(744);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Unicode.toUpper(0);
      Unicode.simpleFold((-2));
      Unicode.simpleFold(1114111);
      Unicode.isLower(1114111);
      boolean boolean0 = Unicode.isPrint(1114111);
      Unicode.toUpper((-2));
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
      
      int int1 = Unicode.simpleFold(1114111);
      assertEquals(1114111, int1);
      
      Unicode.isLower(1114111);
      boolean boolean1 = Unicode.isLower((-2));
      assertTrue(boolean1 == boolean0);
      
      Unicode.isTitle((-999));
      Unicode.isLower(3267);
      Unicode.isTitle(0);
      Unicode.isLower(1284);
      Unicode.simpleFold((-2));
      Unicode.isUpper(127);
      int int2 = Unicode.toUpper(1114111);
      assertEquals(1114111, int2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Unicode.MAX_LATIN1;
      boolean boolean0 = Unicode.isPrint(3178);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1478);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Unicode.simpleFold(12297);
      int int0 = Unicode.simpleFold(1398);
      assertEquals(1350, int0);
      
      Unicode.simpleFold(12297);
      Unicode.isUpper(2072);
      Unicode.isPrint(12297);
      Unicode.isLower(1398);
      Unicode.toUpper(12297);
      Unicode.toUpper(1350);
      Unicode.isPrint((-1617));
      Unicode.isTitle(12297);
      boolean boolean0 = Unicode.isPrint(12297);
      Unicode.simpleFold(7992);
      Unicode.isUpper((-1162));
      Unicode.isTitle(12297);
      Unicode.simpleFold(2072);
      boolean boolean1 = Unicode.isPrint(1114111);
      assertFalse(boolean1 == boolean0);
      
      Unicode.toLower(1398);
      Unicode.isPrint(66639);
      int int1 = Unicode.toUpper(907);
      assertEquals(907, int1);
      
      int int2 = Unicode.simpleFold(7992);
      assertEquals(7984, int2);
      
      Unicode.toLower(7992);
      Unicode.isUpper((-3743));
      int int3 = Unicode.toLower(0);
      assertEquals(0, int3);
      
      int int4 = Unicode.toUpper(7992);
      assertEquals(7992, int4);
      
      int int5 = Unicode.toUpper(0);
      assertEquals(0, int5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Unicode.toUpper(0);
      Unicode.isTitle(0);
      Unicode.simpleFold(12991);
      Unicode.isLower(12991);
      int int0 = Unicode.toLower(86);
      assertEquals(118, int0);
      
      Unicode.toUpper(12991);
      Unicode.isTitle(2);
      Unicode.isUpper(12317);
      boolean boolean0 = Unicode.isTitle(633);
      assertFalse(boolean0);
      
      Unicode.isPrint(0);
      Unicode.isPrint(86);
      Unicode.isUpper((-1274));
      int int1 = Unicode.simpleFold((-1999));
      assertEquals((-1999), int1);
      
      Unicode.isTitle(0);
      Unicode.simpleFold(12991);
      Unicode.isPrint(0);
      Unicode.isUpper(2);
      boolean boolean1 = Unicode.isUpper(127166);
      int int2 = Unicode.simpleFold(8621);
      assertEquals(8621, int2);
      
      boolean boolean2 = Unicode.isUpper(65);
      assertFalse(boolean2 == boolean1);
      
      Unicode.toLower(8621);
      int int3 = Unicode.toLower(120354);
      assertEquals(120354, int3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(195);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1768);
      assertTrue(boolean0);
      
      int int0 = Unicode.toUpper(1768);
      assertEquals(1768, int0);
      
      Unicode.isUpper(1627);
      Unicode.isUpper(1768);
      Unicode.toUpper((-1204));
      int int1 = Unicode.simpleFold((-1204));
      assertEquals((-1204), int1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Unicode.toUpper(2);
      Unicode.toUpper(2);
      Unicode.toLower(122);
      Unicode.toLower(1512);
      Unicode.simpleFold(2);
      Unicode.simpleFold(2);
      int int0 = Unicode.simpleFold(2);
      assertEquals(2, int0);
      
      Unicode.isTitle(2);
      Unicode.toUpper(1);
      int int1 = Unicode.toUpper(65440);
      assertEquals(65440, int1);
      
      Unicode.isUpper(2);
      boolean boolean0 = Unicode.isUpper(1);
      Unicode.toUpper(1);
      Unicode.toUpper(1);
      Unicode.isPrint(90);
      Unicode.toLower(1);
      Unicode.isPrint(153);
      boolean boolean1 = Unicode.isPrint(0);
      boolean boolean2 = Unicode.isLower(1654);
      assertTrue(boolean2 == boolean1);
      
      Unicode.isTitle(122);
      int int2 = Unicode.toLower(65440);
      assertEquals(65440, int2);
      
      boolean boolean3 = Unicode.isPrint(127);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Unicode.toUpper(120223);
      int int0 = Unicode.toUpper(120223);
      assertEquals(120223, int0);
      
      Unicode.isLower(2795);
      Unicode.toLower(7041);
      Unicode.isTitle(301);
      Unicode.toLower(4236);
      Unicode.isLower(173);
      boolean boolean0 = Unicode.isLower(1689);
      boolean boolean1 = Unicode.isPrint(4236);
      assertFalse(boolean1 == boolean0);
      
      Unicode.toLower(120223);
      boolean boolean2 = Unicode.isUpper(65371);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Unicode.MAX_RUNE;
      int int1 = Unicode.toUpper(99);
      assertEquals(67, int1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Unicode.isTitle(1331);
      Unicode.isLower(32);
      int int0 = Unicode.toUpper(127);
      assertEquals(127, int0);
      
      boolean boolean0 = Unicode.isPrint(893);
      assertTrue(boolean0);
      
      Unicode.isLower((-4401));
      int int1 = Unicode.simpleFold(66639);
      assertEquals(66599, int1);
      
      boolean boolean1 = Unicode.isLower(66639);
      Unicode.isUpper(0);
      Unicode.isTitle(445);
      Unicode.isPrint(0);
      Unicode.isLower(32);
      Unicode.toUpper(445);
      int int2 = Unicode.simpleFold(582);
      assertEquals(583, int2);
      
      boolean boolean2 = Unicode.isPrint((-390));
      assertFalse(boolean2 == boolean1);
      
      boolean boolean3 = Unicode.isUpper(0);
      assertFalse(boolean3 == boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Unicode.simpleFold(3416);
      int int0 = Unicode.simpleFold(3416);
      assertEquals(3416, int0);
      
      boolean boolean0 = Unicode.isPrint(1990);
      boolean boolean1 = Unicode.isPrint(3416);
      assertFalse(boolean1 == boolean0);
      
      Unicode.isUpper(0);
      Unicode.toUpper(1649);
      Unicode.isPrint(0);
      Unicode.simpleFold(917);
      int int1 = Unicode.simpleFold((-1497));
      assertEquals((-1497), int1);
      
      boolean boolean2 = Unicode.isLower(2033);
      assertFalse(boolean2);
      
      Unicode.toUpper(1649);
      Unicode.isUpper(950);
      int int2 = Unicode.toUpper(949);
      assertEquals(917, int2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Unicode.toUpper(32);
      assertEquals(32, int0);
      
      Unicode.isLower(32);
      int int1 = Unicode.toLower(65338);
      assertEquals(65370, int1);
      
      Unicode.isTitle(301);
      Unicode.toLower(1414);
      boolean boolean0 = Unicode.isLower(1414);
      boolean boolean1 = Unicode.isLower(32);
      assertFalse(boolean1);
      
      boolean boolean2 = Unicode.isPrint(173);
      assertFalse(boolean2 == boolean0);
      
      int int2 = Unicode.toLower(4448);
      assertEquals(4448, int2);
      
      boolean boolean3 = Unicode.isUpper(63);
      assertTrue(boolean3 == boolean2);
  }
}