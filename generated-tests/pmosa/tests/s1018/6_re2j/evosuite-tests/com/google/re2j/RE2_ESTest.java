/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 14:12:24 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
import com.google.re2j.MachineInput;
import com.google.re2j.RE2;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("alt -> ");
      rE2_0.findAllSubmatch("alt -> ", 3477);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)89;
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte)64;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-67);
      byteArray0[5] = (byte) (-119);
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-3965));
      rE2_0.replaceAllFunc("BEGIN_TEXT", (RE2.ReplaceFunc) null, (-68));
      RE2.quoteMeta("BEGIN_TEXT");
      RE2.quoteMeta("alt -> ");
      rE2_0.findAllSubmatch("#es=kFJyjcCY!*qtR|r", (byte)0);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 34);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.replaceAll("", "");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 1828);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 101);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = RE2.quoteMeta("F");
      assertEquals("F", string0);
      
      int[] intArray0 = rE2_0.findIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("EQjZ");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-2342));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      rE2_0.findUTF8Submatch(byteArray0);
      rE2_0.numberOfCapturingGroups();
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = new RE2(";ch");
      List<int[]> list0 = rE2_0.findAllIndex("oda=8@~Uw\"+9F", 212);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      RE2 rE2_1 = RE2.compileImpl("", 2, true);
      rE2_0.findAllIndex("", 2);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte)3;
      rE2_0.match("");
      byteArray0[3] = (byte)102;
      rE2_0.findUTF8SubmatchIndex(byteArray0);
      rE2_0.match("");
      rE2_0.replaceFirst("", "");
      rE2_1.findAllUTF8Index(byteArray0, 1779);
      StringBuilder stringBuilder0 = new StringBuilder("");
      char[] charArray0 = new char[7];
      charArray0[0] = 'L';
      charArray0[1] = 'Y';
      charArray0[2] = '6';
      charArray0[3] = '[';
      charArray0[4] = 'i';
      charArray0[5] = '9';
      charArray0[6] = 'C';
      // Undeclared exception!
      try { 
        stringBuilder0.insert(2400, charArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2400
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 801, false);
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = "HjLbzj6lN4A/O";
      RE2 rE2_0 = new RE2("HjLbzj6lN4A/O");
      rE2_0.findSubmatch("HjLbzj6lN4A/O");
      int int0 = (-552);
      int int1 = 3568;
      int[] intArray0 = null;
      String string1 = "UTF-8";
      StringBuilder stringBuilder0 = null;
      try {
        stringBuilder0 = new StringBuilder((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "YSIf";
      RE2 rE2_0 = RE2.compileImpl("YSIf", 16, true);
      rE2_0.replaceFirst("YSIf", "YSIf");
      byte[] byteArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("HW");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)24;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "VERTICAL_BAR";
      RE2 rE2_0 = RE2.compilePOSIX("VERTICAL_BAR");
      rE2_0.prefixRune = 0;
      rE2_0.findAllSubmatch("VERTICAL_BAR", (-3817));
      rE2_0.reset();
      rE2_0.toString();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-55);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-44);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-124);
      byteArray0[6] = (byte)4;
      byteArray0[7] = (byte)0;
      rE2_0.findUTF8(byteArray0);
      try { 
        RE2.compile(";8IG,=\"?|^Z)d-yq");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      RE2 rE2_0 = RE2.compileImpl("J", 650, false);
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = new RE2("!>+jJ*9}2.");
      RE2.compileImpl("rune ", 16, true);
      rE2_0.findAllIndex("!>+jJ*9}2.", 16);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-25);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)64;
      byteArray0[3] = (byte)100;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)93;
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compile("5\"L]rieZC]J#");
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-3899));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 8);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("qr}#oe0.9N0X%");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-118);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)20;
      byteArray0[3] = (byte) (-16);
      rE2_0.reset();
      byteArray0[4] = (byte) (-56);
      byteArray0[5] = (byte)0;
      rE2_0.findAllSubmatch("2Tf", (byte) (-56));
      rE2_0.longest = true;
      byteArray0[6] = (byte)73;
      byteArray0[7] = (byte)0;
      rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      byteArray0[8] = (byte) (-1);
      rE2_0.findUTF8SubmatchIndex(byteArray0);
      rE2_0.findAllIndex("Lu0i4M(| k:t~UO[", 5);
      RE2.quoteMeta("qr}#oe0.9N0X%");
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 2391);
      RE2 rE2_1 = RE2.compileImpl("2Tf", 8, true);
      assertEquals("2Tf", rE2_1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "i0^>VcF2";
      RE2 rE2_0 = RE2.compilePOSIX("i0^>VcF2");
      rE2_0.numberOfCapturingGroups();
      rE2_0.reset();
      try { 
        RE2.match("dIxtoF[-[YvOaNS{V", "dIxtoF[-[YvOaNS{V");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-[YvOaNS{V`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Lepcha");
      rE2_0.find("Zl");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "";
      RE2 rE2_0 = new RE2("");
      int int0 = (-35);
      int[] intArray0 = new int[1];
      intArray0[0] = (-35);
      // Undeclared exception!
      try { 
        rE2_0.match("", (-35), (-35), (-35), intArray0, (-35));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = new RE2("3}J,SB{-I==7O");
      Machine machine0 = new Machine(rE2_0);
      List<String> list0 = rE2_0.findAll("&PqS]u0|!Kz", (-41));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("UTF-8", 481, false);
      rE2_0.replaceAll("UTF-8", "UTF-8");
      rE2_0.findSubmatch("NOP");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-27);
      byteArray0[3] = (byte)0;
      rE2_0.findIndex("UTF-8");
      byteArray0[4] = (byte)18;
      byteArray0[5] = (byte)0;
      rE2_0.findAllIndex("com.google.re2j.MachineInput", (byte)18);
      rE2_0.findUTF8Submatch(byteArray0);
      rE2_0.findUTF8(byteArray0);
      rE2_0.get();
      try { 
        RE2.compileImpl("IG5VajG!&<Cx'[)f", 0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[)f`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("issQ", 12);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = (-647);
      RE2 rE2_0 = RE2.compileImpl("", (-647), false);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-58);
      StringBuilder stringBuilder0 = new StringBuilder("com.google.re2j.RE2");
      stringBuilder0.insert(11, (CharSequence) "");
      char[] charArray0 = new char[0];
      stringBuilder0.insert(0, charArray0);
      RE2.match("can't happen", stringBuilder0);
      byteArray0[1] = (byte)36;
      byteArray0[2] = (byte)56;
      byteArray0[3] = (byte)123;
      byteArray0[4] = (byte)0;
      rE2_0.findUTF8(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.findUTF8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = new RE2("Common");
      rE2_0.findUTF8Index(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 698);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("4R", (-614), false);
      rE2_0.findAllSubmatchIndex("4R", (-2130));
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)75;
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)111;
      rE2_0.findUTF8(byteArray0);
      rE2_0.findIndex("4R");
      rE2_0.findAllSubmatchIndex("", (-614));
      rE2_0.replaceAll("4R", "4R");
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)75;
      byteArray1[1] = (byte)75;
      byteArray1[2] = (byte)75;
      byteArray1[3] = (byte) (-8);
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)75;
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray1, (byte) (-8));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[2];
      boolean boolean0 = rE2_0.match("", (-35), (-35), (-35), intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.findIndex("");
      rE2_0.findAll("", 1347);
      RE2 rE2_1 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      rE2_1.findUTF8(byteArray0);
      rE2_1.findAll("", (byte)0);
      byteArray0[1] = (byte) (-19);
      byteArray0[2] = (byte)13;
      rE2_1.findUTF8Index(byteArray0);
      rE2_0.findAllSubmatch("", 1347);
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      RE2.match("", "");
      String string0 = "iA`:";
      rE2_1.replaceFirst("", "iA`:");
      Machine machine0 = new Machine(rE2_0);
      MachineInput machineInput0 = MachineInput.fromUTF8(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        machine0.match(machineInput0, (-1178), 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      RE2 rE2_1 = RE2.compilePOSIX("pq.V+'7:*_!2Tu");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte) (-97);
      byteArray0[2] = (byte)0;
      rE2_1.findAllUTF8Submatch(byteArray0, 783);
      rE2_0.findIndex("4ok9j,~zT|j{NY.%");
      rE2_0.get();
      byte[] byteArray1 = new byte[3];
      rE2_0.find("Bnt]mwx#+'W\"5dz;.");
      byteArray1[0] = (byte)113;
      byteArray1[1] = (byte)72;
      byteArray1[2] = (byte) (-21);
      rE2_0.findAllUTF8SubmatchIndex(byteArray1, 306);
      try { 
        RE2.compile(")CCVX8Mnt\"@6|q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("y2|!sM2,M\"67szq3$d`");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8(byteArray0);
      rE2_0.findIndex("3}J,SB{-I==7O");
      rE2_0.findAllSubmatchIndex("", 92);
      RE2 rE2_1 = RE2.compile("");
      rE2_1.replaceAll("y2|!sM2,M\"67szq3$d`", "");
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.findIndex("");
      rE2_0.findAll("", 1347);
      RE2 rE2_1 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byte[] byteArray1 = rE2_1.findUTF8(byteArray0);
      rE2_1.findAll("", (byte)0);
      byteArray0[1] = (byte) (-19);
      byteArray0[2] = (byte)13;
      rE2_1.findUTF8Index(byteArray0);
      rE2_0.findAllSubmatch("", 1347);
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      rE2_0.findAllIndex(".+*?()|[]{}^$", 3143);
      rE2_1.findUTF8Submatch(byteArray1);
      rE2_1.findUTF8(byteArray0);
      rE2_0.get();
      RE2.compileImpl("", 0, false);
      rE2_1.findAllUTF8Submatch(byteArray1, 16);
      List<int[]> list0 = rE2_1.findAllSubmatchIndex("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.findIndex("");
      rE2_0.findAll("", 1347);
      RE2 rE2_1 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      rE2_1.findSubmatchIndex("Nd");
      RE2.compileImpl("", 869, false);
      byteArray0[0] = (byte)0;
      rE2_1.findUTF8(byteArray0);
      rE2_1.findAll("", (byte)0);
      byteArray0[1] = (byte) (-19);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-19);
      byteArray1[1] = (byte)2;
      byteArray1[2] = (byte)2;
      byteArray1[3] = (byte)81;
      byteArray1[4] = (byte)81;
      rE2_0.findAllUTF8(byteArray1, (-2842));
      String[] stringArray0 = rE2_0.findSubmatch("KD");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|,");
      int[] intArray0 = new int[7];
      intArray0[0] = 598;
      intArray0[1] = 2;
      String string0 = rE2_0.replaceAll("|,", "|,");
      assertEquals("|,||,", string0);
      
      intArray0[2] = 4;
      intArray0[3] = 2;
      intArray0[4] = 4;
      intArray0[5] = 2;
      intArray0[6] = 436;
      rE2_0.match("|,", 436, 2, 4, intArray0, (-17));
      List<String[]> list0 = rE2_0.findAllSubmatch("|,", 307);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", (-2023), (-2023), 0, intArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      boolean boolean0 = rE2_0.match("", (-2023), (-2023), 0, (int[]) null, 0);
      assertTrue(boolean0);
      
      rE2_0.findSubmatch("'o-kF@g5y!{!~#");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte)11;
      byteArray0[4] = (byte)11;
      byteArray0[5] = (byte)11;
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }
}