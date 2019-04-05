/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:57:01 GMT 2019
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
      RE2 rE2_0 = RE2.compile("erZY9|");
      List<String[]> list0 = rE2_0.findAllSubmatch("\"#6ALMp1!", 873);
      assertNotNull(list0);
      assertEquals(10, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$8");
      String string0 = rE2_0.toString();
      assertNotNull(string0);
      assertEquals("com.google.re2j.RE2$8", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      boolean boolean0 = rE2_0.match("com.google.re2j.RE2$1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Ethiopic");
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      String string0 = rE2_0.replaceAllFunc("com.google.re2j.RE2$1", (RE2.ReplaceFunc) null, 919);
      assertEquals("com.google.re2j.RE2$1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      Machine machine0 = rE2_0.get();
      rE2_0.put(machine0);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 129);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("i!_9`H", 499, true);
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-21));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.MachineInput$UTF16Input", 1111, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("[invalid char class]", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("erZY9|");
      List<String> list0 = rE2_0.findAll("\"#6ALMp1!", 1377);
      assertEquals(10, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.quoteMeta((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.MachineInput$UTF16Input", 1111, false);
      // Undeclared exception!
      try { 
        rE2_0.findUTF8Index((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$8");
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
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1207), true);
      // Undeclared exception!
      try { 
        rE2_0.findSubmatchIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("W");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 52513);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 11493, false);
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
  public void test21()  throws Throwable  {
      try { 
        RE2.compilePOSIX("9j[*vNRR6YZc-MpJN");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `c-M`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        RE2.compile("t.i([iM<[,RLZ^k_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[iM<[,RLZ^k_`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("erZY9|");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2("TxMO|dZyn&34*E");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("TxMO|dZyn&34*E", 16);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = RE2.quoteMeta("com.google.re2j.RE2$1");
      assertEquals("com\\.google\\.re2j\\.RE2\\$1", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte) (-87));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.RE2$1", 1656);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-1));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 1656);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = new RE2("|d(Y<Tq}{PCb)>qs");
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)61);
      assertEquals(7, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      List<int[]> list0 = rE2_0.findAllIndex("", (-103));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/#y4P", 1518, true);
      List<String> list0 = rE2_0.findAll("", (-2104));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/#y4P", 1518, true);
      byte[] byteArray0 = new byte[9];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte) (-68));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Rejang", 415, true);
      String[] stringArray0 = rE2_0.findSubmatch("|");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("|d(Y<Tq}{PCb)>qs");
      String[] stringArray0 = rE2_0.findSubmatch("]5!(1t7OLkl+l!");
      assertEquals(2, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      byte[] byteArray0 = new byte[1];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = new RE2("|d(Y<Tq}{PCb)>qs");
      byte[] byteArray0 = new byte[6];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(2, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$8");
      int[] intArray0 = rE2_0.findIndex("com.google.re2j.RE2$8");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("i!_9`H", 499, true);
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      String string0 = rE2_0.find("F ");
      assertEquals("F ", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("z", 193, false);
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-103));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      int[] intArray0 = rE2_0.findSubmatchIndex("uri");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("z", 193, false);
      String string0 = rE2_0.replaceAll("z", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", (-9), (-9), (-9), intArray0, 425);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Ethiopic");
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        rE2_0.match("Ethiopic", 0, 8, 0, intArray0, 3378);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.MachineInput$UTF16Input", 1111, false);
      int[] intArray0 = new int[4];
      boolean boolean0 = rE2_0.match("[invalid char class]", (byte)0, (-961), (byte)1, intArray0, (byte)23);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("z", 193, false);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.match("9CSv=8K%4", (byte)44, 12370, 9398, intArray0, (-1123));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = RE2.match("Meetei_Mayek", "F ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-2329));
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = new RE2("|d(Y<Tq}{PCb)>qs");
      List<String[]> list0 = rE2_0.findAllSubmatch("|d(Y<Tq}{PCb)>qs", (byte)123);
      assertNotNull(list0);
      assertEquals(19, list0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      String string0 = rE2_0.replaceAll("N-lNLO?o?^#h+", "");
      assertEquals("N-lNLO?o?^#h+", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 415);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("erZY9|");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 873);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      List<int[]> list0 = rE2_0.findAllIndex("Inscriptional_Pahlavi", 415);
      assertNotNull(list0);
      assertEquals(22, list0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      byte[] byteArray0 = new byte[1];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 3);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 415, false);
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      String string0 = rE2_0.replaceAll("com.google.re2j.RE2$4", "F ");
      assertEquals("com.google.re2j.RE2$4", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RE2 rE2_0 = new RE2("nzy`n_=6|");
      String string0 = rE2_0.replaceFirst("nzy`n_=6|", "nzy`n_=6|");
      assertEquals("nzy`n_=6||", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RE2 rE2_0 = new RE2("STAR");
      rE2_0.reset();
      assertEquals("STAR", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("F ", (-103), false);
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RE2 rE2_0 = new RE2("|d(Y<Tq}{PCb)>qs");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0, (-1), (-1)}, intArray0);
      assertNotNull(intArray0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        rE2_0.match("", 2, 2, 5902, intArray0, 2);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
