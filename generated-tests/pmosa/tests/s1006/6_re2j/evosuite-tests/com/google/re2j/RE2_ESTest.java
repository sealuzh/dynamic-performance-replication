/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 08:08:36 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.RE2;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("QUEST");
      rE2_0.prefix = "QUEST";
      rE2_0.findAllIndex("", 4);
      rE2_0.reset();
      rE2_0.replaceAll("QUEST", "QUEST");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      rE2_0.findUTF8Submatch(byteArray0);
      rE2_0.findAllSubmatchIndex("O", 0);
      rE2_0.replaceAll("QUEST", "O");
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)0;
      rE2_0.findUTF8Submatch(byteArray1);
      rE2_0.replaceFirst("", "QUEST");
      // Undeclared exception!
      try { 
        rE2_0.findIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = new RE2(";#w]$;6'A~d;LTiYQ");
      rE2_0.replaceAll("Z-# ", ";#w]$;6'A~d;LTiYQ");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, (-2202));
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
      RE2 rE2_0 = RE2.compile("");
      rE2_0.toString();
      List<int[]> list0 = rE2_0.findAllIndex("", 1537);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.replaceAll("", " -> ");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 6622, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 4055);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-96);
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte)38;
      byteArray0[5] = (byte) (-21);
      byteArray0[6] = (byte) (-24);
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-26));
      assertEquals(4, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = new RE2("\"5");
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 160);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("ohDtO~:FWZTm~jn5");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("ohDtO~:FWZTm~jn5", 1, 1, 4, intArray0, 4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-939), true);
      rE2_0.match("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 92);
      assertNotNull(list0);
      
      StringBuilder stringBuilder0 = new StringBuilder(92);
      int[] intArray0 = new int[9];
      intArray0[0] = (-939);
      intArray0[1] = (-939);
      intArray0[2] = (-939);
      intArray0[3] = 1;
      intArray0[4] = 92;
      intArray0[5] = 1;
      intArray0[6] = 92;
      intArray0[7] = 92;
      intArray0[8] = (-1);
      rE2_0.match(stringBuilder0, 1, 92, 1, intArray0, 1);
      List<int[]> list1 = rE2_0.findAllIndex("KqTs! 3Q.Ozy8YfR|", 1);
      assertNotNull(list1);
      assertEquals(1, list1.size());
      
      String string0 = rE2_0.replaceAll("", "CAPTURE");
      assertEquals("CAPTURE", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = new RE2("p");
      boolean boolean0 = rE2_0.match("p");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)72;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-109);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)15;
      byteArray0[7] = (byte)0;
      rE2_0.prefixUTF8 = byteArray0;
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)121;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)31;
      rE2_0.findUTF8SubmatchIndex(byteArray1);
      String string0 = rE2_0.replaceAll("", "can't happen");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 11);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("w", 28, false);
      String string0 = rE2_0.find("Pattern_White_Space");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("u]");
      rE2_0.toString();
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-839));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("a");
      byte[] byteArray0 = new byte[7];
      rE2_0.prefixComplete = false;
      byteArray0[0] = (byte)16;
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte) (-53);
      byteArray0[4] = (byte)125;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)19;
      RE2.match("can't happen", "can't happen");
      rE2_0.findAllSubmatchIndex("can't happen", 7);
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      rE2_0.numberOfCapturingGroups();
      RE2 rE2_1 = RE2.compile("a");
      rE2_1.findSubmatch("K");
      rE2_1.findAllUTF8Index(byteArray0, (byte)16);
      rE2_1.replaceFirst(".b'pol8vy%S>%VcA", ".b'pol8vy%S>%VcA");
      rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-53));
      rE2_1.findUTF8(byteArray0);
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 3574);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      rE2_0.replaceFirst("1Zucc:+", "");
      byteArray0[4] = (byte)32;
      byteArray0[5] = (byte)0;
      rE2_0.findSubmatchIndex("");
      byteArray0[6] = (byte)0;
      RE2 rE2_1 = RE2.compileImpl("", (byte)0, false);
      rE2_1.findAllUTF8(byteArray0, (byte)0);
      rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      byte[] byteArray2 = rE2_0.findUTF8(byteArray0);
      rE2_0.findAllUTF8Submatch(byteArray2, (byte)0);
      rE2_1.findAll("", 0);
      rE2_1.findUTF8Submatch(byteArray1);
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.findAll("", (-1120));
      String string0 = rE2_0.prefix;
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2.quoteMeta("can't happen");
      RE2 rE2_0 = RE2.compilePOSIX("can't happen");
      rE2_0.findAllIndex("", 2);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-97);
      rE2_0.match("");
      byteArray0[1] = (byte)0;
      rE2_0.findUTF8Index(byteArray0);
      rE2_0.matchUTF8(byteArray0);
      rE2_0.findAllSubmatchIndex("", 1100);
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 8);
      rE2_0.findAll("can't happen", 8);
      rE2_0.findIndex("can't happen");
      rE2_0.findSubmatch("");
      try { 
        RE2.compile("(?i:");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("n");
      String[] stringArray0 = rE2_0.findSubmatch("n");
      assertNotNull(stringArray0);
      
      String string0 = RE2.quoteMeta("n");
      assertEquals("n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("y:`QM!D*%B-=H_3!vt ");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 12, true);
      RE2.quoteMeta("");
      rE2_0.reset();
      List<String[]> list0 = rE2_0.findAllSubmatch("", 283);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2(" -> ");
      rE2_0.findIndex(" -> ");
      String string0 = rE2_0.toString();
      assertEquals(" -> ", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("STAR");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)90;
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)90;
      byteArray1[1] = (byte) (-128);
      byteArray1[2] = (byte) (-128);
      rE2_0.findSubmatchIndex("unhandled case in Inst.toString");
      byteArray1[3] = (byte) (-128);
      byteArray1[4] = (byte) (-128);
      rE2_0.replaceAll("unhandled case in Inst.toString", "BEGIN_LINE");
      rE2_0.replaceFirst("STAR", "[!H,");
      byteArray1[5] = (byte)90;
      byteArray1[6] = (byte) (-128);
      rE2_0.findAllUTF8Submatch(byteArray1, (byte) (-128));
      byteArray0[1] = (byte) (-128);
      rE2_0.findSubmatch("=1~s6udm`|E%V*7<");
      byteArray0[2] = (byte)118;
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      RE2 rE2_1 = RE2.compile("STAR");
      rE2_0.findIndex("unhandled case in Inst.toString");
      rE2_0.findIndex("JX]:%l_/j0F");
      rE2_0.findAllUTF8SubmatchIndex(byteArray1, 2062);
      rE2_0.find("STAR");
      rE2_0.findAllUTF8Index(byteArray0, (-1149));
      List<int[]> list0 = rE2_1.findAllUTF8Index(byteArray1, (byte) (-128));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.replaceAll(" -> ", " -> ");
      RE2 rE2_1 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)57;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)12;
      byteArray0[5] = (byte)73;
      rE2_1.findUTF8Submatch(byteArray0);
      boolean boolean0 = RE2.match(" -> ", "");
      boolean boolean1 = rE2_0.match("");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 42, false);
      rE2_0.longest = false;
      String string0 = "ZSR{2a`$iUM_wf2|";
      rE2_0.replaceFirst("Uona^&PkxhFtT%Giorw", "ZSR{2a`$iUM_wf2|");
      byte[] byteArray0 = null;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-122);
      byteArray1[1] = (byte) (-128);
      byteArray1[2] = (byte)12;
      rE2_0.findAllUTF8Index(byteArray1, (-2057));
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 42);
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
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-774));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.longest;
      assertFalse(boolean0);
      
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("Diacritic", (byte) (-53));
      assertEquals(10, list0.size());
      assertNotNull(list0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte) (-53);
      byteArray0[3] = (byte)19;
      List<String> list1 = rE2_0.findAll("UTF-8", (byte)0);
      assertNull(list1);
      
      List<int[]> list2 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-157));
      assertEquals(4, list2.size());
      
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
      
      RE2 rE2_1 = RE2.compile("can't happen");
      rE2_0.findSubmatch("K");
      rE2_1.findAllUTF8Index(byteArray0, (-9));
      String string0 = rE2_1.replaceFirst("can't happen", "");
      assertEquals("", string0);
      
      rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-53));
      rE2_0.findUTF8(byteArray0);
      RE2 rE2_2 = RE2.compileImpl("LEFT_PAREN", (byte)19, false);
      String string1 = rE2_2.replaceAll("", "!%O4");
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 12, false);
      rE2_0.reset();
      rE2_0.findAllSubmatch("", (-829));
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)70;
      byteArray0[3] = (byte)60;
      byteArray0[4] = (byte)101;
      byteArray0[5] = (byte)87;
      rE2_0.findUTF8Index(byteArray0);
      rE2_0.findAllSubmatchIndex("w", 12);
      rE2_0.numberOfCapturingGroups();
      String[] stringArray0 = rE2_0.findSubmatch("Thai");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.match("", 0, 0, 0, (int[]) null, 330);
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = "";
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      // Undeclared exception!
      try { 
        rE2_0.match("", (-1), (-1), 0, intArray0, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|ELGSpXjoDAV");
      List<String[]> list0 = rE2_0.findAllSubmatch("|ELGSpXjoDAV", 7);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|ELGSpXjoDAV");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-1399));
      assertNotNull(list0);
      
      String string0 = rE2_0.replaceAll("|ELGSpXjoDAV", "}y{H4N_}");
      assertEquals("}y{H4N_}|}y{H4N_}", string0);
  }
}