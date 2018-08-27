/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:22:11 GMT 2018
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
      RE2 rE2_0 = RE2.compilePOSIX("g");
      RE2.quoteMeta("g");
      byte[] byteArray0 = new byte[3];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("=@i|D");
      RE2.quoteMeta("=@i|D");
      String[] stringArray0 = rE2_0.findSubmatch("=@i|D");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("I!Z");
      int[] intArray0 = rE2_0.findIndex("I!Z");
      assertArrayEquals(new int[] {0, 3}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = RE2.match("1Zu2Jxc0R", "1Zu2Jxc0R");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = new RE2("I!Z");
      int[] intArray0 = rE2_0.findSubmatchIndex("I!Z");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("rune <null>");
      boolean boolean0 = rE2_0.match("rune <null>");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertNotNull(string0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Phags_Pa");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-34);
      byteArray0[1] = (byte)112;
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte) (-34));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String> list0 = rE2_0.findAll("", 2141);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String> list0 = rE2_0.findAll("", (-2492));
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("", rE2_0.toString());
      assertEquals(0, int0);
      
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 614);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("nVR8F!g@YR");
      assertEquals("nVR8F!g@YR", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("}s?+co|c3 _k~Dj", 1848);
      assertEquals("nVR8F!g@YR", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("t;KY@BWq~snv^");
      assertEquals("t;KY@BWq~snv^", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String[] stringArray0 = rE2_0.findSubmatch("t;KY@BWq~snv^");
      assertEquals("t;KY@BWq~snv^", rE2_0.toString());
      assertNull(stringArray0);
      
      Machine machine0 = rE2_0.get();
      assertEquals("t;KY@BWq~snv^", rE2_0.toString());
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("2");
      assertEquals("2", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = RE2.quoteMeta("2");
      assertEquals("2", string0);
      assertNotNull(string0);
      
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[2];
      intArray0[0] = (int) (byte)0;
      boolean boolean0 = rE2_0.match("2", (byte)0, (byte)0, (byte) (-25), intArray0, 416);
      assertEquals("2", rE2_0.toString());
      assertFalse(boolean0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("vWU'\"gl iUQW`VwZ<");
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-1439));
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNull(list0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("uCoH]");
      assertEquals("uCoH]", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertEquals("uCoH]", rE2_0.toString());
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("5dk$H");
      assertEquals("5dk$H", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("5dk$H", (-152));
      assertEquals("5dk$H", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (-1014));
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.toString();
      assertEquals("", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
      
      int int0 = MachineInput.EOF;
      assertEquals((-8), int0);
      
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-8));
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("X");
      assertEquals("X", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = rE2_0.findSubmatchIndex("X");
      assertEquals("X", rE2_0.toString());
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("q !>*Zju");
      assertEquals("q !>*Zju", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String> list0 = rE2_0.findAll("!EcS(K:8D7aS3E[", 7);
      assertEquals("q !>*Zju", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = new RE2("7fAto-");
      assertEquals("7fAto-", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-92));
      assertEquals("7fAto-", rE2_0.toString());
      assertNull(list0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = new RE2("&V2");
      assertEquals("&V2", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("n't happen", "n't happen");
      assertEquals("&V2", rE2_0.toString());
      assertEquals("n't happen", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2("2");
      assertEquals("2", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("2", "2");
      assertEquals("2", rE2_0.toString());
      assertEquals("2", string0);
      assertNotNull(string0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("2", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Ir&%");
      assertEquals("Ir&%", rE2_0.toString());
      assertNotNull(rE2_0);
      
      rE2_0.reset();
      assertEquals("Ir&%", rE2_0.toString());
      
      String string0 = rE2_0.replaceFirst("Ir&%", "Ir&%");
      assertEquals("Ir&%", rE2_0.toString());
      assertEquals("Ir&%", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("can't happen");
      assertEquals("can't happen", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals("can't happen", rE2_0.toString());
      assertNull(intArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("vWU'\"gl iUQW`VwZ<");
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String[]> list0 = rE2_0.findAllSubmatch("n.uJ~Sx}4gi0OVh", 831);
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNull(list0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("5Lm2\"?");
      assertEquals("5Lm2\"?", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("5Lm2\"?", 53);
      assertEquals("5Lm2\"?", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String[]> list0 = rE2_0.findAllSubmatch("", 2501);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("uCoH]");
      assertEquals("uCoH]", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.longest;
      assertFalse(boolean0);
      
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals("uCoH]", rE2_0.toString());
      assertNull(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("[:alnum:]");
      assertEquals("[:alnum:]", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals("[:alnum:]", rE2_0.toString());
      assertNull(intArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[5];
      String string0 = rE2_0.toString();
      assertEquals("", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
      
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals("", rE2_0.toString());
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertEquals("", rE2_0.toString());
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2752, false);
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)79;
      byteArray0[2] = (byte)59;
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 1);
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
      assertArrayEquals(new byte[] {(byte)79, (byte)0, (byte)59, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("vWU'\"gl iUQW`VwZ<");
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)58;
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)58);
      assertEquals("vWU'\"gl iUQW`VwZ<", rE2_0.toString());
      assertNull(list0);
      assertArrayEquals(new byte[] {(byte)58}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = rE2_0.findIndex("j'S rRuU$");
      assertEquals("", rE2_0.toString());
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.prefix;
      assertEquals("", string0);
      assertNotNull(string0);
      
      int[] intArray0 = new int[2];
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 12);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("can't happen");
      assertEquals("can't happen", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String[] stringArray0 = rE2_0.findSubmatch("can't happen");
      assertEquals("can't happen", rE2_0.toString());
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = new RE2("2");
      assertEquals("2", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.find("2");
      assertEquals("2", rE2_0.toString());
      assertEquals("2", string0);
      assertNotNull(string0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("2", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-39);
      byteArray0[2] = (byte) (-14);
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals("", rE2_0.toString());
      assertNotNull(intArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-39), (byte) (-14), (byte)0}, byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", (byte)4, (byte) (-87), (byte)12, intArray0, (byte)4);
      assertEquals("", rE2_0.toString());
      assertFalse(boolean0);
      assertArrayEquals(new int[] {}, intArray0);
      
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 977);
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("", 382);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = RE2.match("-vre8!cpGeAB?o-", "-vre8!cpGeAB?o-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      Machine machine0 = new Machine(rE2_0);
      assertEquals("", rE2_0.toString());
      assertNotNull(machine0);
      
      String string0 = rE2_0.replaceAll(")", (String) null);
      assertEquals("", rE2_0.toString());
      assertEquals("null)null", string0);
      assertNotNull(string0);
      
      // Undeclared exception!
      try { 
        rE2_0.find((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("|yD]XW&ei{", (-4132), false);
      assertEquals("|yD]XW&ei{", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("|yD]XW&ei{", "|yD]XW&ei{");
      assertEquals("|yD]XW&ei{", rE2_0.toString());
      assertEquals("|yD]XW&ei{|yD]XW&ei{", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = new RE2("&2");
      assertEquals("&2", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.find("can't happen");
      assertEquals("&2", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-57);
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals("", rE2_0.toString());
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-57), (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
      assertNotNull(string0);
      
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[2];
      intArray0[0] = (int) (byte)0;
      intArray0[1] = (int) (byte) (-5);
      // Undeclared exception!
      try { 
        rE2_0.match("", (byte)0, (byte)0, (byte) (-5), intArray0, 416);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|b");
      assertEquals("|b", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String[]> list0 = rE2_0.findAllSubmatch("|b", 2501);
      assertEquals("|b", rE2_0.toString());
      assertEquals(2, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.expr;
      assertEquals("", string0);
      assertNotNull(string0);
      
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[7];
      intArray0[0] = (int) (byte)0;
      boolean boolean0 = rE2_0.match("", (byte)0, (byte)0, (byte) (-33), (int[]) null, 0);
      assertEquals("", rE2_0.toString());
      assertTrue(boolean0);
      
      boolean boolean1 = rE2_0.longest;
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      
      String string1 = rE2_0.replaceFirst("", "");
      assertEquals("", rE2_0.toString());
      assertEquals("", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      
      String[] stringArray0 = rE2_0.findSubmatch(">[`jjuMt5E");
      assertEquals("", rE2_0.toString());
      assertNotNull(stringArray0);
      
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertEquals("", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("K*");
      assertEquals("K*", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("K*", "K*");
      assertEquals("K*", rE2_0.toString());
      assertEquals("K**K*", string0);
      assertNotNull(string0);
      
      byte[] byteArray0 = new byte[12];
      try { 
        RE2.compile("K**K*");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `**`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }
}