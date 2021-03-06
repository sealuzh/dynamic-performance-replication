/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 21:46:16 GMT 2019
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
  public void test000()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 4, true);
      List<String[]> list0 = rE2_0.findAllSubmatch("M^R)]P={hB]C,Wl", (-1360));
      assertNotNull(list0);
      assertEquals(16, list0.size());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 2);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("$", 2147483645, true);
      String[] stringArray0 = rE2_0.findSubmatch("$");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("$", 2147483645, true);
      byte[] byteArray0 = new byte[3];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = RE2.quoteMeta("#)YB9$=\u0000;gl,Syj78");
      assertEquals("#\\)YB9\\$=\u0000;gl,Syj78", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("-D");
      rE2_0.findAll("", (-1611));
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      int[] intArray0 = rE2_0.findSubmatchIndex("X4c");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      RE2 rE2_1 = RE2.compilePOSIX("e%?l>W-");
      Machine machine0 = rE2_1.get();
      rE2_0.put(machine0);
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 5);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("6o]_hrf|(5')'");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = RE2.match("mdx=MG5+oF8_C?nN", "mdx=MG5+oF8_C?nN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("(?s:.)");
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Carian");
      String string0 = rE2_0.find("Carian");
      assertEquals("Carian", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("`$u+g[L{|FT{i# [S9", ")Q");
      assertEquals(")Q`$u+g[L{|FT{i# [S9", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (-518));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 5337);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Greek");
      String string0 = rE2_0.replaceAllFunc("any -> ", (RE2.ReplaceFunc) null, 354);
      assertEquals("any -> ", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      String string0 = rE2_0.replaceAll("com.google.re2j.Prog", (String) null);
      assertEquals("com.google.re2j.Prog", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("HNaduY=&aG", 5760, true);
      String string0 = rE2_0.replaceAll("HNaduY=&aG", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      String string0 = rE2_0.replaceAll("", "Limbu");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = new RE2("UTF-8");
      rE2_0.put((Machine) null);
      assertEquals("UTF-8", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = RE2.match("", charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        rE2_0.match("F", (-240), 2275, 56, intArray0, 2275);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[4];
      boolean boolean0 = rE2_0.match((CharSequence) null, 2645, 156, 2645, intArray0, 1434);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("6o]_hrf|(5')'");
      boolean boolean0 = rE2_0.match("$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("`$u+g[L{|FT{i# [S9");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[8];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-826));
      assertNotNull(list0);
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = new RE2("UTF-8");
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[6];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("gO|sr_");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (-25));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = new RE2("/i");
      List<int[]> list0 = rE2_0.findAllIndex("/i", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      List<int[]> list0 = rE2_0.findAllIndex("", (-39));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("gO|sr_");
      List<String> list0 = rE2_0.findAll("gO|sr_", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      List<String[]> list0 = rE2_0.findAllSubmatch("|", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Old_Turkic");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("y0zIr>", (-611), true);
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, "U|0IN)sz`oa$U!Ve");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      try { 
        RE2.match("62;v3q(gHI%t1282+", "-D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `62;v3q(gHI%t1282+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("-D");
      // Undeclared exception!
      try { 
        rE2_0.match("-D", (byte) (-82), (byte)121, 0, (int[]) null, (-1611));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 22, true);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 0, 687, intArray0, 687);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test051()  throws Throwable  {
      RE2 rE2_0 = new RE2("FAIL");
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
  public void test052()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
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
  public void test053()  throws Throwable  {
      RE2 rE2_0 = new RE2("FAIL");
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
  public void test054()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 449, true);
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
  public void test056()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Greek", 705, true);
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
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("g");
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
  public void test058()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("qGl\"k5xp`,oZd;*V", 7, false);
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("g");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 1212);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2147483645, true);
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 1158);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("WG");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 21);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, (-832));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Carian");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 532);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("-D");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test067()  throws Throwable  {
      try { 
        RE2.compilePOSIX("#)YB9$=\\0;gl,Syj78");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 1205, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      try { 
        RE2.compile(")Q`$u+g[L{|FT{i# [S9");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 120770);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-35));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-3946));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.prefix = "+y\"B@I;Uug?";
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String[] stringArray0 = rE2_0.findSubmatch("com.google.re2j.RE2$3");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      byte[] byteArray0 = new byte[6];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("s", 2641, true);
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("-D");
      String string0 = rE2_0.find("'A-*g");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("WG");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("WG");
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("v|2hdrf*5. i|");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 346);
      assertNotNull(list0);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      List<String> list0 = rE2_0.findAll("$", (-707));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("K", (-39));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K", (-39), false);
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      boolean boolean0 = rE2_0.match("", 0, 0, (-1254), intArray0, 0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      int[] intArray0 = new int[6];
      boolean boolean0 = rE2_0.match("$", (-707), (-707), 1014, intArray0, 1014);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("", (-1591), (-1591), 0, (int[]) null, 3541);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findIndex("Myanmar");
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, (-763), 2048, 10, intArray0, 22);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.prefix = "+y\"B@I;Uug?";
      boolean boolean0 = rE2_0.match("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-519));
      assertFalse(list0.contains(byteArray0));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray1, 497);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", 1690);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = new RE2("3Vj'~");
      String string0 = rE2_0.toString();
      assertEquals("3Vj'~", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("v|2hdrf*5. i|");
      String string0 = rE2_0.replaceAll("v|2hdrf*5. i|", "Kannada");
      assertEquals("Kannada|Kannada2KannadahKannadadKannadarKannadafKannada*Kannada5Kannada.Kannada KannadaiKannada|Kannada", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match("", 1088, 1088, 4, intArray0, 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }
}
