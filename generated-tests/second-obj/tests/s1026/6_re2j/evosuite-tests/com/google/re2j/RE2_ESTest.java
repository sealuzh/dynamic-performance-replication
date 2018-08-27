/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:25:00 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
import com.google.re2j.MachineInput;
import com.google.re2j.RE2;
import java.nio.CharBuffer;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = new RE2("wo;|G>kzO vsRv\"t?Fe");
      int[] intArray0 = rE2_0.findSubmatchIndex("wo;|G>kzO vsRv\"t?Fe");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (-213));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", (-234));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 1758);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Batak");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-13);
      rE2_0.findAllUTF8(byteArray0, (byte) (-13));
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = new RE2("D,>2~NjR0Fl8oJC%");
      List<String[]> list0 = rE2_0.findAllSubmatch("D,>2~NjR0Fl8oJC%", 161);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte) (-41);
      byteArray0[2] = (byte) (-83);
      byteArray0[3] = (byte)38;
      byteArray0[4] = (byte)1;
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)1);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)65);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = new RE2("6x");
      byte[] byteArray0 = new byte[1];
      rE2_0.findAllUTF8Submatch(byteArray0, 120514);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.reset();
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)9);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compilePOSIX("g");
      rE2_0.reset();
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)9);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = new RE2("V:");
      rE2_0.replaceFirst("V:", "V:");
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, "V:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = new RE2("1hi");
      rE2_0.findAllSubmatchIndex("1hi", 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8Index(byteArray0, 257);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.get();
      rE2_0.replaceAll("LG", "");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("regexp/syntax: internal error");
      rE2_0.replaceFirst("is0", "regexp/syntax: internal error");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.replaceFirst("7vZS#v$koC}", "");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.replaceAll("", "");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("regexp/syntax: internal error");
      rE2_0.replaceAll("regexp/syntax: internal error", (String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Batak");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-13);
      byteArray0[1] = (byte) (-13);
      rE2_0.findAllUTF8(byteArray0, (byte) (-13));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = new RE2("h-+u&@uus");
      rE2_0.findAll("h-+u&@uus", 4160);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = new RE2("");
      rE2_0.matchUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2("D,>2~NjR0Fl8oJC%");
      rE2_0.findSubmatchIndex("D,>2~NjR0Fl8oJC%");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2.quoteMeta("");
      RE2 rE2_0 = new RE2("");
      rE2_0.numberOfCapturingGroups();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("1hi", 0, false);
      byte[] byteArray0 = new byte[0];
      rE2_0.matchUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2.match("com.google.re2j.RE2", "com.google.re2j.RE2");
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = new RE2("1hi");
      rE2_0.findAllIndex("ANY_CHAR_NOT_NL", 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = new RE2("^Uir!2x}&5=x4j4K");
      rE2_0.find("");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.findAll("", 3509);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:xdigit:]");
      rE2_0.findSubmatch("[:xdigit:]");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = new RE2("pSG&");
      rE2_0.findUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("raliL!$");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8Index(byteArray0, 67840);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = new RE2("g GN cglp.U");
      rE2_0.findAll("g GN cglp.U", 4160);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte) (-4);
      RE2 rE2_0 = new RE2("=@|sSX\"");
      rE2_0.findUTF8Index(byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(": 3J-$}m");
      rE2_0.match(": 3J-$}m");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = "ApXrKw|`>!<~qe*7";
      RE2 rE2_0 = RE2.compilePOSIX("ApXrKw|`>!<~qe*7");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        rE2_0.match("ApXrKw|`>!<~qe*7", (-1817), (-1817), (-1817), intArray0, (-1817));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[6];
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8(byteArray0, 0);
      intArray0[0] = 0;
      intArray0[3] = 0;
      intArray0[2] = 0;
      intArray0[2] = 0;
      intArray0[4] = 2448;
      intArray0[5] = 0;
      rE2_0.match("", 0, 0, 0, (int[]) null, 0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[5];
      intArray0[3] = 0;
      intArray0[2] = 0;
      rE2_0.findSubmatch("");
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 0, 0, intArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      RE2 rE2_0 = RE2.compileImpl("WRC!C)S@3-pS*4y%k]", (-1902), true);
      rE2_0.findUTF8Submatch(byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = new RE2("V:");
      rE2_0.findIndex("V:");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Cs");
      int[] intArray0 = new int[2];
      intArray0[1] = (-2);
      rE2_0.match("Cs", 2982, (-2), 127984, intArray0, (-2));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compile("");
      rE2_0.findAllUTF8(byteArray0, 7011);
      char[] charArray0 = new char[0];
      CharBuffer.wrap(charArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 4, true);
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)0;
      rE2_0.findUTF8Index(byteArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = new RE2("D,>2~NjR0Fl8oJC%");
      rE2_0.findIndex("D,>2~NjR0Fl8oJC%");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("ualiL!$");
      rE2_0.findSubmatch("");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2.quoteMeta("K9&M_q[r>A~S");
      RE2 rE2_0 = RE2.compileImpl("UTF-b8", (-132), false);
      int[] intArray0 = new int[2];
      intArray0[0] = 4100;
      intArray0[1] = 4100;
      rE2_0.match("K9&M_q[r>A~S", (-132), (-132), (-132), intArray0, 4100);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = "\"rVe7JO1|";
      RE2 rE2_0 = RE2.compileImpl("\"rVe7JO1|", 212, true);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-92);
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)56;
      byte byte0 = (byte) (-3);
      rE2_0.findAll("\"rVe7JO1|", (byte)12);
      byteArray0[4] = (byte) (-3);
      String string1 = ",[3,jIZI`T";
      RE2 rE2_1 = null;
      try {
        rE2_1 = new RE2(",[3,jIZI`T");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[3,jIZI`T`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("|OFl(D|P_`)5l3L");
      rE2_0.findAll("", 128);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)28;
      byteArray0[1] = (byte) (-51);
      byteArray0[2] = (byte)4;
      rE2_0.reset();
      byteArray0[1] = (byte) (-3);
      byteArray0[4] = (byte) (-44);
      rE2_0.findUTF8Submatch(byteArray0);
      RE2.quoteMeta("|OFl(D|P_`)5l3L");
      String string0 = rE2_0.prefix;
      Machine machine0 = new Machine(rE2_0);
      byte[] byteArray1 = new byte[10];
      byteArray1[0] = (byte)28;
      byteArray1[1] = (byte) (-3);
      byteArray1[2] = (byte)28;
      byteArray1[3] = (byte)4;
      byteArray1[4] = (byte) (-51);
      byteArray1[5] = (byte) (-3);
      MachineInput machineInput0 = MachineInput.fromUTF8(byteArray1);
      machineInput0.canCheckPrefix();
      MachineInput.fromUTF8(byteArray1);
      // Undeclared exception!
      try { 
        machine0.match(machineInput0, (byte) (-51), (byte) (-51));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -51
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("\"rVe7JO1|", 212, true);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-92);
      byteArray0[0] = (byte) (-92);
      rE2_0.findUTF8SubmatchIndex(byteArray0);
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)56;
      rE2_0.findAll("\"rVe7JO1|", (byte)0);
      byteArray0[4] = (byte)15;
      rE2_0.findAll("\"rVe7JO1|", 5);
      rE2_0.replaceAll("\"rVe7JO1|", "\"rVe7JO1|");
      RE2.compile("\"rVe7JO1||\"rVe7JO1|");
      rE2_0.replaceFirst("\"rVe7JO1|", "\"rVe7JO1|");
  }
}