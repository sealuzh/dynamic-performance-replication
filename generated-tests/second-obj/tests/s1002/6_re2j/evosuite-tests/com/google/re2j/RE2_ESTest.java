/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:53:53 GMT 2018
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
      RE2 rE2_0 = new RE2("UTF-8");
      int[] intArray0 = rE2_0.findIndex("UTF-8");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("\"\"j.i@Wyt:O?");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = new RE2("S{H-<t");
      rE2_0.findSubmatchIndex("S{H-<t");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("UTF-8");
      int[] intArray0 = rE2_0.findIndex("D.D");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 5);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2("Gb4");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("Gb4", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("!zs8?^$M");
      List<String> list0 = rE2_0.findAll("!zs8?^$M", (-1632));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = new RE2("match");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = new RE2("Latin");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        rE2_0.match("Latin", 1073, 1073, 1073, intArray0, 7);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = RE2.match("EDNYY}", "EDNYY}");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = new RE2("UTF-8");
      String string0 = rE2_0.replaceFirst("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Runic");
      String string0 = rE2_0.toString();
      assertEquals("Runic", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("UTF-8");
      int[] intArray0 = rE2_0.findSubmatchIndex("UTF-8");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.reset();
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 589823);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = new RE2("%Q7IS?6l~mK1hwc ");
      byte[] byteArray0 = new byte[1];
      rE2_0.findAllUTF8Index(byteArray0, (byte) (-56));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("JDJDbM;.mo_Y");
      rE2_0.find("JDJDbM;.mo_Y");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("}*");
      RE2.quoteMeta("}*");
      rE2_0.replaceAll("}*", "}*");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.replaceFirst("empty ", "");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("7*DtjR5n~D4g");
      rE2_0.toString();
      rE2_0.replaceAll("7*DtjR5n~D4g", (String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      RE2.quoteMeta("");
      rE2_0.findAllSubmatch("", 968);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1699, true);
      rE2_0.findAllSubmatchIndex("a_!`&LRON", 1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Nko");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8Submatch(byteArray0, 10224);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.findAllIndex("", 1144);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)124;
      rE2_0.matchUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-119);
      rE2_0.findAllUTF8Submatch(byteArray0, 1677);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = new RE2("Gb4");
      rE2_0.findAllIndex("Gb4", 0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$nm*");
      rE2_0.replaceFirst("Nko", "Nko");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = new RE2("f4|eaE0dV442Fq'Xj");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, 6416);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2.quoteMeta("\"");
      RE2 rE2_0 = new RE2("M]J0j:");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("A]", 929, true);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)12;
      rE2_0.matchUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1161), true);
      rE2_0.findAllSubmatchIndex("", (-1161));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = new RE2("!zs8?^$M");
      byte[] byteArray0 = new byte[1];
      rE2_0.findUTF8Submatch(byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2.match("HSS%T^ o8K", "HSS%T^ o8K");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.reset();
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-13));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-78);
      rE2_0.findUTF8Index(byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2.quoteMeta("");
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("\"H+X,7BXDJK8");
      rE2_0.findSubmatch("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Nko");
      rE2_0.reset();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.prefixComplete;
      rE2_0.findAll("", (-3612));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8(byteArray0, 4);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("UTF-8");
      rE2_0.findSubmatchIndex("D.D");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2.quoteMeta("TN'%?");
      RE2 rE2_0 = RE2.compile("TN'%?");
      rE2_0.findAllSubmatch("com.google.re2j.MachineInput", (-629));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\"\"j.i@Wyt:O?");
      byte[] byteArray0 = new byte[0];
      rE2_0.findUTF8SubmatchIndex(byteArray0);
      rE2_0.match("\"\"j.i@Wyt:O?", 3348, 464, 464, (int[]) null, 3348);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = "";
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.numberOfCapturingGroups();
      RE2.quoteMeta("com.google.re2j.RE2");
      int int0 = 1343;
      int[] intArray0 = new int[6];
      intArray0[0] = 761;
      intArray0[1] = (-2035);
      intArray0[2] = (-2035);
      intArray0[3] = 12;
      intArray0[4] = 12;
      intArray0[5] = 0;
      // Undeclared exception!
      try { 
        rE2_0.match("com.google.re2j.RE2", 0, 761, 1343, intArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compile("");
      rE2_0.findUTF8Submatch(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 248);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = new RE2("Latin");
      rE2_0.findAllSubmatchIndex("Latin", (-283));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.findAllSubmatch("", 956);
      rE2_0.prefixRune = 827;
      byte[] byteArray0 = new byte[12];
      RE2 rE2_1 = RE2.compileImpl("e", (-2990), false);
      rE2_1.match("e");
      int[] intArray0 = new int[15];
      intArray0[1] = 2008;
      intArray0[3] = (-2990);
      rE2_0.match("e", (-29), (-29), 827, intArray0, 1001);
      rE2_0.findUTF8(byteArray0);
      boolean boolean0 = rE2_1.prefixComplete;
      rE2_1.findUTF8Index(byteArray0);
      String string0 = rE2_1.prefix;
      rE2_0.findSubmatch("e");
      rE2_0.match("[c/=N6d*RS~/n/P", 0, 0, 0, (int[]) null, 1001);
      rE2_1.toString();
      rE2_0.put((Machine) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)78;
      byteArray0[1] = (byte) (-113);
      byteArray0[2] = (byte)25;
      RE2 rE2_0 = RE2.compile("z");
      rE2_0.findAllIndex("cKJi2\"I!Y", 42803);
      rE2_0.get();
  }
}