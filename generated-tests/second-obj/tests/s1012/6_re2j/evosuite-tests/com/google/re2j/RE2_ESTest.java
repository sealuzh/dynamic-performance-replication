/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:32:08 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
import com.google.re2j.RE2;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      String[] stringArray0 = rE2_0.findSubmatch("can't happen");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)34;
      byteArray0[2] = (byte)34;
      byteArray0[3] = (byte)34;
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte)34);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("t,O]%;x^<dCz|");
      byte[] byteArray0 = new byte[18];
      byteArray0[1] = (byte)0;
      rE2_0.findUTF8Submatch(byteArray0);
      List<int[]> list0 = rE2_0.findAllIndex("t,O]%;x^<dCz|", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("t,O;x^<dvz~|");
      assertEquals("t,O;x^<dvz~|", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.find("t,O;x^<dvz~|");
      assertEquals("t,O;x^<dvz~|", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
      
      rE2_0.reset();
      assertEquals("t,O;x^<dvz~|", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String[]> list0 = rE2_0.findAllSubmatch("", (-896));
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = new RE2("Zl");
      assertEquals("Zl", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("Zl", "Zl");
      assertEquals("Zl", rE2_0.toString());
      assertEquals("Zl", string0);
      assertNotNull(string0);
      
      Machine machine0 = rE2_0.get();
      assertEquals("Zl", rE2_0.toString());
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("VERTICAL_BAR", (-137), false);
      assertEquals("VERTICAL_BAR", rE2_0.toString());
      assertNotNull(rE2_0);
      
      StringBuilder stringBuilder0 = new StringBuilder("Co");
      assertEquals("Co", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      StringBuilder stringBuilder1 = stringBuilder0.reverse();
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder1, stringBuilder0);
      assertEquals("oC", stringBuilder0.toString());
      assertEquals("oC", stringBuilder1.toString());
      assertNotNull(stringBuilder1);
      
      int[] intArray0 = new int[7];
      intArray0[0] = (-994);
      intArray0[1] = (-137);
      intArray0[2] = (-170);
      intArray0[3] = (-170);
      intArray0[4] = (-137);
      intArray0[5] = (-170);
      intArray0[6] = (-170);
      boolean boolean0 = rE2_0.match(stringBuilder1, (-137), (-137), (-170), intArray0, 260);
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder1, stringBuilder0);
      assertEquals("VERTICAL_BAR", rE2_0.toString());
      assertEquals("oC", stringBuilder0.toString());
      assertEquals("oC", stringBuilder1.toString());
      assertFalse(boolean0);
      assertArrayEquals(new int[] {(-994), (-137), (-170), (-170), (-137), (-170), (-170)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.Compiler$1");
      assertEquals("com.google.re2j.Compiler$1", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = rE2_0.findSubmatchIndex("com.google.re2j.Compiler$1");
      assertEquals("com.google.re2j.Compiler$1", rE2_0.toString());
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String> list0 = rE2_0.findAll("", 5580);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.Regexp$Op");
      assertEquals("com.google.re2j.Regexp$Op", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("com.google.re2j.Regexp$Op", 9);
      assertEquals("com.google.re2j.Regexp$Op", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-32);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-32));
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertArrayEquals(new byte[] {(byte) (-32)}, byteArray0);
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1, true);
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("W?dNQs.QXi'xO3f le=", 1);
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-56);
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-2177));
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertArrayEquals(new byte[] {(byte) (-56)}, byteArray0);
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = new RE2("%'X");
      assertEquals("%'X", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)113);
      assertEquals("%'X", rE2_0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      assertEquals("can't happen", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 92);
      assertEquals("can't happen", rE2_0.toString());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("C[#]I");
      assertEquals("C[#]I", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String[]> list0 = rE2_0.findAllSubmatch("C[#]I", 67595);
      assertEquals("C[#]I", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = new RE2("FAIL");
      assertEquals("FAIL", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("FAIL", 3345);
      assertEquals("FAIL", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4KUTv@");
      assertEquals("4KUTv@", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("4KUTv@", "Ps");
      assertEquals("4KUTv@", rE2_0.toString());
      assertEquals("Ps", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("LITERAL");
      assertEquals("LITERAL", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals("LITERAL", rE2_0.toString());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = RE2.quoteMeta(".+*?()|[]{}^$");
      assertEquals("\\.\\+\\*\\?\\(\\)\\|\\[\\]\\{\\}\\^\\$", string0);
      assertNotNull(string0);
      
      RE2 rE2_0 = new RE2("/98H}+r");
      assertEquals("/98H}+r", rE2_0.toString());
      assertNotNull(rE2_0);
      
      boolean boolean0 = rE2_0.match("/98H}+r");
      assertEquals("/98H}+r", rE2_0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("iaT#4E99bM33", "");
      assertEquals("", rE2_0.toString());
      assertEquals("iaT#4E99bM33", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.Regexp$Op");
      assertEquals("com.google.re2j.Regexp$Op", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("", 9);
      assertEquals("com.google.re2j.Regexp$Op", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllIndex("", 17);
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("CkFq@LOeuQEL+??");
      assertEquals("CkFq@LOeuQEL+??", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals("CkFq@LOeuQEL+??", rE2_0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = new RE2("\"U y:");
      assertEquals("\"U y:", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = rE2_0.findIndex("");
      assertEquals("\"U y:", rE2_0.toString());
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("CHAR_CLASS", 0, true);
      assertEquals("CHAR_CLASS", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<String> list0 = rE2_0.findAll("CHAR_CLASS", 0);
      assertEquals("CHAR_CLASS", rE2_0.toString());
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      RE2 rE2_0 = RE2.compileImpl("$5Zl[xhhF2R{b)zJ(", (-730), true);
      assertEquals("$5Zl[xhhF2R{b)zJ(", rE2_0.toString());
      assertNotNull(rE2_0);
      
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray1, 2181);
      assertNotSame(byteArray1, byteArray0);
      assertEquals("$5Zl[xhhF2R{b)zJ(", rE2_0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = RE2.quoteMeta("Uzr)$?j}");
      assertEquals("Uzr\\)\\$\\?j\\}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-1));
      assertEquals("", rE2_0.toString());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("d");
      assertEquals("d", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals("d", rE2_0.toString());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = new RE2("IDS_Trinary_Operator");
      assertEquals("IDS_Trinary_Operator", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)7;
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals("IDS_Trinary_Operator", rE2_0.toString());
      assertArrayEquals(new byte[] {(byte)7}, byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Georgian");
      assertEquals("Georgian", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.find(".31>|1Yrd:o;s!zD");
      assertEquals("Georgian", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = new RE2("Zl");
      assertEquals("Zl", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceFirst("a\"", "Zl");
      assertEquals("Zl", rE2_0.toString());
      assertEquals("a\"", string0);
      assertNotNull(string0);
      
      boolean boolean0 = rE2_0.match("Zl", 2530, 19, 19, (int[]) null, 19);
      assertEquals("Zl", rE2_0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("^f,,iq5D7");
      assertEquals("^f,,iq5D7", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 119963);
      assertEquals("^f,,iq5D7", rE2_0.toString());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("j<';Ed7E!g");
      assertEquals("j<';Ed7E!g", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals("j<';Ed7E!g", rE2_0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("OuJ0q*$m");
      assertEquals("OuJ0q*$m", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("", "OuJ0q*$m");
      assertEquals("OuJ0q*$m", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = new RE2("n@dgpl&Z?U|#!m-");
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNull(byteArray1);
      
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertEquals("", rE2_0.toString());
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-23);
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte) (-23));
      assertEquals("", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(1, list0.size());
      assertArrayEquals(new byte[] {(byte) (-23)}, byteArray0);
      assertNotNull(list0);
      
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = new RE2("can't happen");
      assertEquals("can't happen", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-126);
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertEquals("can't happen", rE2_0.toString());
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {(byte) (-126)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", rE2_0.toString());
      assertEquals("", string0);
      assertNotNull(string0);
      
      Machine machine0 = rE2_0.get();
      assertEquals("", rE2_0.toString());
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals("", rE2_0.toString());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals("", rE2_0.toString());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("\"", "");
      assertEquals("", rE2_0.toString());
      assertEquals("\"", string0);
      assertNotNull(string0);
      
      rE2_0.prefix = "";
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("orgian");
      assertEquals("orgian", rE2_0.toString());
      assertNotNull(rE2_0);
      
      String string0 = rE2_0.replaceAll("orgian", "orgian");
      assertEquals("orgian", rE2_0.toString());
      assertEquals("orgian", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      Machine machine0 = new Machine(rE2_0);
      assertEquals("", rE2_0.toString());
      assertNotNull(machine0);
      
      rE2_0.put(machine0);
      assertEquals("", rE2_0.toString());
      
      int[] intArray0 = new int[8];
      intArray0[0] = (int) (byte)0;
      intArray0[3] = (int) (byte)0;
      intArray0[4] = (int) (byte)0;
      intArray0[5] = (int) (byte)0;
      intArray0[6] = 97;
      intArray0[7] = (int) (byte)0;
      boolean boolean0 = rE2_0.match("", 0, 0, (byte)0, intArray0, (byte)0);
      assertEquals("", rE2_0.toString());
      assertTrue(boolean0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 97, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = "";
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
      assertNotNull(rE2_0);
      
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
      
      String string1 = rE2_0.find("");
      assertEquals("", rE2_0.toString());
      assertEquals("", string1);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      
      int[] intArray0 = rE2_0.findIndex("");
      assertEquals("", rE2_0.toString());
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
      
      byte[] byteArray0 = new byte[1];
      int int0 = 0;
      boolean boolean1 = rE2_0.match("", (byte)0, 0, (byte)0, (int[]) null, 6449);
      assertEquals("", rE2_0.toString());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
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
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("R#F|", 256, true);
      assertEquals("R#F|", rE2_0.toString());
      assertNotNull(rE2_0);
      
      int[] intArray0 = new int[1];
      intArray0[0] = 256;
      List<int[]> list0 = rE2_0.findAllIndex("R#F|", 32);
      assertEquals("R#F|", rE2_0.toString());
      assertFalse(list0.isEmpty());
      assertEquals(2, list0.size());
      assertNotNull(list0);
      
      // Undeclared exception!
      try { 
        rE2_0.match("R#F|", 256, 256, 256, intArray0, 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = new RE2("6?");
      assertEquals("6?", rE2_0.toString());
      assertNotNull(rE2_0);
      
      boolean boolean0 = rE2_0.longest;
      assertFalse(boolean0);
      
      String string0 = rE2_0.find("6?");
      assertEquals("6?", rE2_0.toString());
      assertEquals("6", string0);
      assertNotNull(string0);
      
      String string1 = rE2_0.find("6");
      assertEquals("6?", rE2_0.toString());
      assertEquals("6", string1);
      assertTrue(string1.equals((Object)string0));
      assertNotNull(string1);
      
      RE2 rE2_1 = RE2.compilePOSIX("6");
      assertNotSame(rE2_1, rE2_0);
      assertEquals("6", rE2_1.toString());
      assertFalse(rE2_1.equals((Object)rE2_0));
      assertNotNull(rE2_1);
      
      int[] intArray0 = rE2_1.findIndex("6?");
      assertNotSame(rE2_1, rE2_0);
      assertEquals("6", rE2_1.toString());
      assertArrayEquals(new int[] {0, 1}, intArray0);
      assertFalse(rE2_1.equals((Object)rE2_0));
      assertNotNull(intArray0);
      
      String string2 = rE2_0.replaceAll("6?", "6");
      assertNotSame(rE2_0, rE2_1);
      assertEquals("6?", rE2_0.toString());
      assertEquals("6?6", string2);
      assertFalse(rE2_0.equals((Object)rE2_1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotNull(string2);
      
      Machine machine0 = rE2_0.get();
      assertNotSame(rE2_0, rE2_1);
      assertEquals("6?", rE2_0.toString());
      assertFalse(rE2_0.equals((Object)rE2_1));
      assertNotNull(machine0);
      
      boolean boolean1 = rE2_0.match("MATCH");
      assertNotSame(rE2_0, rE2_1);
      assertEquals("6?", rE2_0.toString());
      assertTrue(boolean1);
      assertFalse(rE2_0.equals((Object)rE2_1));
      assertFalse(boolean1 == boolean0);
      
      // Undeclared exception!
      try { 
        rE2_1.match("6?6", 2172, 2172, (byte)0, intArray0, 2172);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}