/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:37:34 GMT 2019
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
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      List<String[]> list0 = rE2_0.findAllSubmatch("can't happen", 170);
      assertEquals(13, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = new RE2("(?-m:$)");
      String[] stringArray0 = rE2_0.findSubmatch("com.google.re2j.RE2$4");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      RE2 rE2_0 = new RE2("(?-m:$)");
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = RE2.quoteMeta("uVF;/U>V3N-Gy");
      assertEquals("uVF;/U>V3N-Gy", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      RE2 rE2_0 = new RE2("&Scy");
      rE2_0.findAllSubmatchIndex("&Scy", 14);
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("0A#h?!9]`H2yBH");
      String string0 = rE2_0.replaceAllFunc("0A#h?!9]`H2yBH", (RE2.ReplaceFunc) null, 2164);
      assertEquals("0A#h?!9]`H2yBH", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = new RE2("%Tg");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 3248);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$8");
      boolean boolean0 = rE2_0.match("m7uL'_J;DiEj@GImO");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(".|");
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      String string0 = rE2_0.find("can't happen");
      assertEquals("can't happen", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("Z", (String) null);
      assertEquals("nullZ", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = new RE2("%Tg");
      String string0 = rE2_0.replaceFirst("%Tg", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (byte)0);
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
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("M~V7Qw3", (RE2.ReplaceFunc) null, (byte) (-8));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 514);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "y{;jp&A:1M~-;Km");
      boolean boolean0 = RE2.match("y{;jp&A:1M~-;Km", charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = RE2.match(string0, string0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("fLt&.x8TZ", 2064, false);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotNull(byteArray1);
      
      byte[][] byteArray2 = rE2_0.findUTF8Submatch(byteArray1);
      assertEquals(1, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("~eO$jN3},:");
      int[] intArray0 = rE2_0.findSubmatchIndex("~eO$jN3},:");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("I$w#>b");
      String[] stringArray0 = rE2_0.findSubmatch("I$w#>b");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("9C}v&8aE*\" Fjx4'");
      int[] intArray0 = rE2_0.findIndex("9C}v&8aE*\" Fjx4'");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("INw]9&6^");
      byte[] byteArray0 = new byte[3];
      RE2 rE2_1 = new RE2("");
      Machine machine0 = rE2_1.get();
      rE2_0.put(machine0);
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray1, (byte) (-99));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(":v");
      byte[] byteArray0 = new byte[3];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-1102));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("x");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[8];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 3628);
      assertNotNull(list0);
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-90));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("9%0VxV");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray1, 16);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 218);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("2yQnR");
      List<String[]> list0 = rE2_0.findAllSubmatch("2yQnR", (-1102));
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = new RE2("'Z2 =]2%6}m\" G&ff");
      List<String> list0 = rE2_0.findAll("com.google.re2j.RE2$1", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("fLt&.x8TZ", 2064, false);
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      List<String[]> list0 = rE2_0.findAllSubmatch("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "Limbu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("(?-m:$)");
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
      RE2 rE2_0 = RE2.compile("(?:$)");
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
        RE2.match("j!)W6,@|%^?(8)shO", "j!)W6,@|%^?(8)shO");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
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
      RE2 rE2_0 = new RE2("2N");
      CharBuffer charBuffer0 = CharBuffer.allocate(120597);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      rE2_0.match(charBuffer0, 8173, 8173, 120597, intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match("", 54, 54, 54, intArray0, 54);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, 1740, 1740, 1740, intArray0, 1740);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, 2544, 2544, 2544, intArray0, 2544);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, (byte)0, (byte)0, 16, intArray0, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test054()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$6");
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
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      RE2 rE2_0 = new RE2("NOP");
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
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("o|");
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
  public void test058()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("I$#w#>b");
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
  public void test061()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 11320044);
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
        rE2_0.findAllUTF8Submatch((byte[]) null, (byte) (-96));
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
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, (-2575));
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
      RE2 rE2_0 = RE2.compile("m!BC");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 7);
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
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, (-2259));
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
      RE2 rE2_0 = RE2.compile("D");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 1367);
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
      RE2 rE2_0 = RE2.compile("H_");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, (-5309));
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
      RE2 rE2_0 = RE2.compile("can't happen");
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
  public void test069()  throws Throwable  {
      try { 
        RE2.compilePOSIX(".~@;x[T{$9a");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[T{$9a`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 5051, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      try { 
        RE2.compile("i8el_j,(4uN");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `i8el_j,(4uN`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("[.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[.`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = new RE2("&Scy");
      byte[] byteArray0 = new byte[9];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)14);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-2146), false);
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("12ez(xD 4k X@)t.<L");
      List<String> list0 = rE2_0.findAll("A;V#Os", 5024);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("12ez(xD 4k X@)t.<L");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("12ez(xD 4k X@)t.<L");
      byte[] byteArray0 = new byte[5];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = new RE2("&Scy");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$8");
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      RE2 rE2_0 = new RE2("(?-m:$)");
      List<int[]> list0 = rE2_0.findAllIndex("eV:x+PD=A.>W", 128);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("0A#h?!9]`H2yBH");
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(rE2_0.prefixUTF8);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = RE2.quoteMeta("com.google.re2j.RE2$8");
      assertEquals("com\\.google\\.re2j\\.RE2\\$8", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = new RE2("(?-m:$)");
      String string0 = rE2_0.replaceAll("(?-m:$)", "5H[<=");
      assertEquals("(?-m:$)5H[<=", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceAll("^,pu&$xPz8Ig 0(B@", "");
      assertEquals("^,pu&$xPz8Ig 0(B@", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-2146), false);
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Z~J~%nrC}bP9=',Y;n");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      boolean boolean0 = rE2_0.match("", (byte)0, (byte)0, (byte)0, (int[]) null, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("&-}");
      boolean boolean0 = rE2_0.match("{bVV", (byte)0, 4330, (byte)0, (int[]) null, 952);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findIndex("");
      boolean boolean0 = rE2_0.match("", (byte)0, (byte)0, (-1098), intArray0, (byte)0);
      assertEquals(2, intArray0.length);
      assertTrue(boolean0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[8];
      boolean boolean0 = rE2_0.match("M~V7Qw3", (byte)0, (-2286), 16, intArray0, 256);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        rE2_0.match("", (-4210), 12349, (-4210), intArray0, (-1042));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = new RE2("(|F?-m:$)");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 3);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("", "M~V7Qw3");
      assertEquals("M~V7Qw3", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-381));
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String> list0 = rE2_0.findAll("", 1041);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", (byte) (-93));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = new RE2("(|F?-m:$)");
      byte[] byteArray0 = new byte[8];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 4030);
      assertNotNull(list0);
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("INw]9&6^");
      String string0 = rE2_0.toString();
      assertEquals("INw]9&6^", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("12ez(xD 4k X@)t.<L");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1102), true);
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, (byte) (-99));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      boolean boolean0 = RE2.match("=A`2+$1", "=A`2+$1");
      assertFalse(boolean0);
  }
}
