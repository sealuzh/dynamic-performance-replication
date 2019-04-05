/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:40:07 GMT 2019
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
      RE2 rE2_0 = RE2.compileImpl(",", 1715, false);
      String string0 = rE2_0.replaceAll("", "X:GjFxio1z?N&");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("HIKm`>@bEjG0u+NbV!");
      boolean boolean0 = rE2_0.match("HIKm`>@bEjG0u+NbV!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Bf_;}");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = new RE2("dW*kdj3,|");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = RE2.match("aG=|", "aG=|");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("aG=|");
      boolean boolean0 = rE2_0.match("aG=|");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = new RE2("dW*kdj3,|");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Z");
      int[] intArray0 = rE2_0.findSubmatchIndex("Z");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 1}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findIndex("");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("m/%e/qi2#-m5MH3", 1105, false);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(rE2_0.prefixUTF8, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-10));
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = new RE2("dW*kdj3,|");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 1136);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = new RE2("dW*kdj3,|");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 1628);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte)7);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^cntrl:]");
      List<int[]> list0 = rE2_0.findAllIndex("f8s&|UcW%MOrT", (-213));
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.find("c1vxH+.H=L,QsMn");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(".rf5w|kp>MG/Nw", 0, true);
      String string0 = "";
      String[] stringArray0 = rE2_0.findSubmatch(string0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1286), false);
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match("", 2269, 2269, 2269, intArray0, 2269);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Bf_;}");
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
  public void test20()  throws Throwable  {
      RE2 rE2_0 = new RE2("L");
      // Undeclared exception!
      try { 
        rE2_0.findSubmatch((String) null);
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
        RE2.compilePOSIX("~(SMIe}|.e .lAG@");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `~(SMIe}|.e .lAG@`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("(I9)kQ]Iwz*3_a.Q|^", 3444, false);
      List<String[]> list0 = rE2_0.findAllSubmatch("(I9)kQ]Iwz*3_a.Q|^", (byte)69);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("`wWX`-u`^4=\u0000Smh>~z", 239);
      assertEquals(19, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^cntrl:]");
      byte[] byteArray0 = new byte[2];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("(I9)kQ]Iwz*3_a.Q|^", 3444, false);
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)8);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Bf_;}");
      List<int[]> list0 = rE2_0.findAllIndex("", 1618);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(",", 1715, false);
      List<String> list0 = rE2_0.findAll("", (byte) (-64));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      RE2 rE2_0 = RE2.compile("85HN");
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-32));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("m/%e/qi2#-m5MH3", 1105, false);
      byte[] byteArray0 = new byte[6];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-2872));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("(I9)kQ]Iwz*3_a.Q|^", 3444, false);
      String[] stringArray0 = rE2_0.findSubmatch("(I9)kQ]Iwz*3_a.Q|^");
      assertNotNull(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("(I9)kQ]Iwz*3_a.Q|^", 3444, false);
      byte[] byteArray0 = new byte[6];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(2, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Z");
      byte[] byteArray0 = new byte[4];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("rune1 ");
      int[] intArray0 = rE2_0.findIndex("eIl#m>(jb6TKe");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Z");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("rune1 ");
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("aG=|");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^lower:]");
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$9", (-3), true);
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = RE2.quoteMeta("aG=|");
      assertEquals("aG=\\|", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("rune1 ");
      String string0 = rE2_0.replaceFirst("", "PRc\"4.");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = new RE2("aG=|");
      String string0 = rE2_0.replaceAll("aG=|", "aG=|");
      assertEquals("aG=||aG=|", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("m/%e/qi2#-m5MH3", 1105, false);
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^cntrl:]");
      int[] intArray0 = rE2_0.findIndex("[:^cntrl:]");
      // Undeclared exception!
      try { 
        rE2_0.match("[:^cntrl:]", (byte)0, (byte)94, (byte)0, intArray0, 697);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("rune1 ");
      boolean boolean0 = rE2_0.match("PRc\"4.", (byte)0, (byte)127, 49, (int[]) null, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[8];
      boolean boolean0 = rE2_0.match("", 1826, (-626), 1826, intArray0, 1826);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("", 0, 0, (-380), (int[]) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-109));
      assertEquals(5, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(",", 1715, false);
      List<String[]> list0 = rE2_0.findAllSubmatch("`wWX`-u`^4=\u0000Smh>~z", 239);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("zDEsOx(\u0005vW#6", (byte) (-10));
      assertNotNull(list0);
      assertEquals(13, list0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^lower:]");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 14712172);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:^lower:]");
      String string0 = rE2_0.replaceFirst("Wd^N@FD;o", "");
      assertEquals("WdN@FD;o", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = new RE2("aG=|");
      List<String> list0 = rE2_0.findAll("aG=||aG=|", 6752);
      assertNotNull(list0);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", "com.google.re2j.RE2$10");
      assertEquals("com.google.re2j.RE2$10", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = new RE2("aG=|");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("HIKm`>@bEjG0u+NbV!");
      rE2_0.reset();
      assertEquals("HIKm`>@bEjG0u+NbV!", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = RE2.match("483k%qDA\"ev;N", "");
      assertFalse(boolean0);
  }
}
