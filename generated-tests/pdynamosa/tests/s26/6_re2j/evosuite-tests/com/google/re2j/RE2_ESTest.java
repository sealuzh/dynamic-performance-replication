/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:40:40 GMT 2019
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
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("q\"hjW", 7516);
      assertEquals(6, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("5");
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)53;
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 4346580);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F");
      String[] stringArray0 = rE2_0.findSubmatch("3Fh[496#\r");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\b");
      byte[] byteArray0 = new byte[8];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      RE2 rE2_0 = new RE2("(ApaZ$\"Q#h) Jqt ");
      RE2 rE2_1 = RE2.compile("");
      Machine machine0 = new Machine(rE2_1);
      rE2_0.put(machine0);
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-1549));
      assertEquals(6, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      String string0 = RE2.quoteMeta("com.google.re2.Parser");
      assertEquals("com\\.google\\.re2\\.Parser", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Pbz\u0001qo*fW0LA`z~%(|", (-1), true);
      String string0 = rE2_0.replaceAll("Pbz\u0001qo*fW0LA`z~%(|", "Pbz\u0001qo*fW0LA`z~%(|");
      assertEquals("Pbz\u0001qo*fW0LA`z~%(|", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll("com.google.re2j.RE2$3", "Ba%");
      assertEquals("Ba%cBa%oBa%mBa%.Ba%gBa%oBa%oBa%gBa%lBa%eBa%.Ba%rBa%eBa%2Ba%jBa%.Ba%RBa%EBa%2Ba%$Ba%3Ba%", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$7", (-209), true);
      String string0 = rE2_0.toString();
      assertNotNull(string0);
      assertEquals("com.google.re2j.RE2$7", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("6w(z*03 9c.lHDHZ)D");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("|K");
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("q&=Qf;M9B");
      String string0 = rE2_0.find("q&=Qf;M9B");
      assertEquals("q&=Qf;M9B", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      String string0 = rE2_0.replaceAllFunc("com.google.re2j.RE2$1", (RE2.ReplaceFunc) null, 6701);
      assertEquals("com.google.re2j.RE2$1", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("6w(z*03 9c.lHDH)D");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 3848);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
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
  public void test020()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2034);
      boolean boolean0 = RE2.match("^Y>cFM{g9wB`_", charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = new RE2("d^&CN");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        rE2_0.match("d^&CN", (-76), 0, (-76), intArray0, (-1566));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int[] intArray0 = new int[4];
      boolean boolean0 = rE2_0.match(charBuffer0, 2, 2, 2, intArray0, 38);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("!jWLZ.!n");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("UTF-8", 65343, false);
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("_P\u0000D(zE.,/(o");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = new RE2("Variation_Selector");
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-102));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compile("G]E>");
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = new RE2("rune ");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)51);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$7");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, (byte) (-114));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Pbz\u0001qo*fW0LA`z~%(|", (-1), true);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("c5tr]MN8bf65", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (-1238));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", 2240);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String> list0 = rE2_0.findAll("`2_rU", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 12, false);
      List<String> list0 = rE2_0.findAll("", (-112));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test047()  throws Throwable  {
      RE2 rE2_0 = new RE2("|K");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, (-5257));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("\b");
      // Undeclared exception!
      try { 
        rE2_0.match("", 4168, 4168, 4168, (int[]) null, 652);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("|K", 417, true);
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, 417, 417, 1450, (int[]) null, 40);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      RE2 rE2_0 = new RE2("rune ");
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        rE2_0.match("Tibetan", 0, 3519, 0, intArray0, (-1076));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      RE2 rE2_0 = new RE2("|fK");
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("QuQr5e");
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
  public void test056()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-3465), false);
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
  public void test058()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
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
  public void test059()  throws Throwable  {
      RE2 rE2_0 = new RE2("|K");
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
  public void test060()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
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
  public void test061()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Pok*ok7/");
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
  public void test062()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (-1144));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, (-1238));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 2559);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      rE2_0.put((Machine) null);
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8(byteArray0, (-1199));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      RE2 rE2_0 = new RE2("rune ");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, 3179);
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 34);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      RE2 rE2_0 = new RE2("(ApaZ$\"Q#h) Jqt ");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, (-1577));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 92, false);
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 185);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("|K");
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
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, (-3690), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      try { 
        RE2.compile("}n^%P(<%#l3");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `}n^%P(<%#l3`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
      RE2 rE2_0 = new RE2("n}t<9\u0000JSWBa");
      List<String[]> list0 = rE2_0.findAllSubmatch(";&>", (-3041));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$7");
      byte[] byteArray0 = new byte[3];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 2633);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      List<int[]> list0 = rE2_0.findAllIndex("com.google.re2j.RE2$3", 2252);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.Parser$1");
      byte[] byteArray0 = new byte[5];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = new RE2("n}t<9\u0000JSWBa");
      String[] stringArray0 = rE2_0.findSubmatch("gqIyJNTn");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compilePOSIX("|K");
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      int[] intArray0 = rE2_0.findIndex("7BrKYI0q[ xA@C");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      String string0 = rE2_0.find("com.google.re2j.RE2$10");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 767, true);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("k");
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)107;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("|K", 417, true);
      List<String> list0 = rE2_0.findAll("|K", 417);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 12, false);
      rE2_0.prefix = "lSNf%";
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = new RE2("n}t<9\u0000JSWBa");
      String string0 = rE2_0.replaceFirst("gqIyJNTn", "n}t<9\u0000JSWBa");
      assertEquals("gqIyJNTn", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|K");
      String string0 = rE2_0.replaceAll("|K", "[gGO5q(P.pf_QL!p ");
      assertEquals("[gGO5q(P.pf_QL!p |[gGO5q(P.pf_QL!p ", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findIndex("7BrKYI0q[ xA@C");
      assertNotNull(intArray0);
      
      boolean boolean0 = rE2_0.match("z};;tH<dfT],Lm`IVYj", 0, 2240, 2240, intArray0, 0);
      assertTrue(boolean0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("", 0, 0, 0, (int[]) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[9];
      boolean boolean0 = rE2_0.match("", 3846, (byte)75, (byte)0, intArray0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("j^z@rg", 127, true);
      int[] intArray0 = new int[7];
      boolean boolean0 = rE2_0.match("j^z@rg", (-2665), (-2665), (-692), intArray0, 5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      boolean boolean0 = rE2_0.match("com.google.re2j.RE2$3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 2644);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compilePOSIX("|K");
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-3977));
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)49);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 3, true);
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 767, true);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.replaceFirst("", "");
      byte[] byteArray0 = new byte[0];
      rE2_0.put((Machine) null);
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8(byteArray0, (-1199));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      rE2_0.reset();
      assertEquals("UTF-8", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = RE2.match(",@`UDN@9H7O>ADD", ",@`UDN@9H7O>ADD");
      assertTrue(boolean0);
  }
}
