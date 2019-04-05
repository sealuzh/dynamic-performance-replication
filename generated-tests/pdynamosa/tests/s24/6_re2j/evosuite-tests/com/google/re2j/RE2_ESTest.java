/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:20:44 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
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
      List<String[]> list0 = rE2_0.findAllSubmatch(" w(#`v-+}T", (byte)43);
      assertEquals(12, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("]Jp&giZ0?Qgk|Y7S", 1408, false);
      String[] stringArray0 = rE2_0.findSubmatch("]Jp&giZ0?Qgk|Y7S");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = RE2.quoteMeta("Q7Hjv0fN.");
      assertEquals("Q7Hjv0fN\\.", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("9<G3|\":C=nENuT", 1024, true);
      String string0 = rE2_0.replaceAll("9<G3|\":C=nENuT", "9<G3|\":C=nENuT");
      assertEquals("9<G3|\":C=nENuT|9<G3|\":C=nENuT", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\b");
      String string0 = rE2_0.toString();
      assertEquals("\b", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$8");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 1578);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = RE2.match("Zs", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\b");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("can't happen");
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("g#Y,:Sb}jgV4&vO");
      String string0 = rE2_0.find("g#Y,:Sb}jgV4&vO");
      assertEquals("g#Y,:Sb}jgV4&vO", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("mDq");
      String string0 = rE2_0.replaceFirst("com.google.re2j.RE2$2", (String) null);
      assertEquals("com.google.re2j.RE2$2", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = new RE2("A");
      String string0 = rE2_0.replaceAllFunc("=.'R7?Xkhmk<B`$8", (RE2.ReplaceFunc) null, 0);
      assertEquals("=.'R7?Xkhmk<B`$8", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (-450));
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
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, false);
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll("", (String) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.put((Machine) null);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("h^%O");
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      rE2_0.put(machine0);
      List<int[]> list0 = rE2_0.findAllIndex("", 45);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotNull(byteArray1);
      
      boolean boolean0 = rE2_0.matchUTF8(byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      try { 
        RE2.match(".uQ)7{JZze", charBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, true);
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("/?,Iz}RP", 1667, (-539), 0, intArray0, 212);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Gothic");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 8);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("9<G3|\":C=nENuT", 1024, true);
      byte[] byteArray0 = new byte[2];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("CHAR_CLASS");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-6));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, false);
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$2", 63, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = new RE2("Q7Hjv0fN.");
      List<String[]> list0 = rE2_0.findAllSubmatch("TJ?", (-448));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllIndex("com.google.re2j.RE2$1", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllIndex("", (-1893));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, false);
      List<String> list0 = rE2_0.findAll("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("mDq", (-4570), false);
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "/{Cs1e8s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 5449);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Dg");
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, "anynotnl -> ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.matchUTF8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.match((String) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$2", 63, false);
      // Undeclared exception!
      try { 
        rE2_0.match("com.google.re2j.RE2$2", (byte)16, 128, 128, (int[]) null, 63);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Z");
      StringBuffer stringBuffer0 = new StringBuffer(0);
      // Undeclared exception!
      try { 
        rE2_0.match(stringBuffer0, (byte)0, (byte)0, 0, (int[]) null, (byte) (-44));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = new RE2("Q7Hjv0fN.");
      StringBuffer stringBuffer0 = new StringBuffer("Q7Hjv0fN.");
      int[] intArray0 = new int[5];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, 1962, 3512, 9, intArray0, 212);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("<@");
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null);
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
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$8", 420, false);
      // Undeclared exception!
      try { 
        rE2_0.findUTF8SubmatchIndex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findUTF8Submatch((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("aJL4/GsXF}", 0, false);
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
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test51()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Dg");
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
  public void test53()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (byte)109);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 1848);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$7");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 2451);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, (-1380));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, 128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("fw", (-9), true);
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 1183);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("mDq");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 43790);
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
      RE2 rE2_0 = new RE2("$VALUES");
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
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compilePOSIX((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        RE2.compileImpl("^1[Djkcc@QKt`", 0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[Djkcc@QKt``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 4129, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray1, (-206));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1606), false);
      byte[] byteArray0 = new byte[2];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\b");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("\b", 7424);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[4];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 91);
      assertNotNull(list0);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("g#Y,:Sb}jgV4&vO");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("(?s:.)", (-1985));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$8");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("D");
      String[] stringArray0 = rE2_0.findSubmatch("D");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("D");
      byte[] byteArray0 = new byte[7];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, false);
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("PRI*}]:,m6qMP");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$8");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/?,Iz}RP", 212, true);
      byte[] byteArray0 = new byte[16];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotNull(byteArray1);
      
      int[] intArray0 = rE2_0.findUTF8Index(byteArray1);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("D");
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("mDq");
      int[] intArray0 = rE2_0.findSubmatchIndex("com.google.re2j.RE2$2");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("h");
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("", (-1954), (-1954), 0, (int[]) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      RE2 rE2_0 = new RE2("A");
      int[] intArray0 = new int[7];
      boolean boolean0 = rE2_0.match((CharSequence) null, 0, (-1750), 286, intArray0, (-1750));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      RE2 rE2_0 = new RE2("A");
      int[] intArray0 = new int[7];
      boolean boolean0 = rE2_0.match("A", 0, 0, (-2132), intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("CHAR_CLASS");
      boolean boolean0 = rE2_0.match("]CuJT2w3i9I'$C=q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-104));
      assertNotNull(list0);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 756);
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4");
      List<String> list0 = rE2_0.findAll("4", (-1336));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll("zuMZ GwH[qDiC`6rM", "zuMZ GwH[qDiC`6rM");
      assertEquals("zuMZ GwH[qDiC`6rMzzuMZ GwH[qDiC`6rMuzuMZ GwH[qDiC`6rMMzuMZ GwH[qDiC`6rMZzuMZ GwH[qDiC`6rM zuMZ GwH[qDiC`6rMGzuMZ GwH[qDiC`6rMwzuMZ GwH[qDiC`6rMHzuMZ GwH[qDiC`6rM[zuMZ GwH[qDiC`6rMqzuMZ GwH[qDiC`6rMDzuMZ GwH[qDiC`6rMizuMZ GwH[qDiC`6rMCzuMZ GwH[qDiC`6rM`zuMZ GwH[qDiC`6rM6zuMZ GwH[qDiC`6rMrzuMZ GwH[qDiC`6rMMzuMZ GwH[qDiC`6rM", string0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("8A6rMa,%]");
      rE2_0.reset();
      assertEquals("8A6rMa,%]", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      boolean boolean0 = RE2.match("", "6XqQ");
      assertTrue(boolean0);
  }
}