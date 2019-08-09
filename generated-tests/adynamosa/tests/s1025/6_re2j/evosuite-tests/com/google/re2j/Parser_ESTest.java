/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:07:51 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Parser;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S|o", 1121);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{9+TojJxU}", (-1311));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S|o", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("gq6^0+2 ", 2884);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser("MO .=r^", 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 0, 4);
      assertEquals(4, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp[] regexpArray0 = Parser.subarray((Regexp[]) null, 25, 25);
      assertEquals(0, regexpArray0.length);
      assertNotNull(regexpArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[8];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, (-89));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 1048, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-4258), 2188);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 3112;
      Regexp[] regexpArray0 = new Regexp[9];
      int int1 = 4071;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, 91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\\x{10FFFF}", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        Parser.parse("pI{[03{Dp-JZ_sO[F", 108);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `p-J`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Parser.parse("[:-", 81);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        Parser.parse("T[-", 97);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        Parser.parse("T[-", 24);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        Parser.parse("V<r%=%r j[]X-k+9", (-1804));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]X-k+9`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-3243));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "\\P{";
      int int0 = 11745;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `\\P{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Parser.parse("K;3[", 65512);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "\\x'{";
      int int0 = 120;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\x'{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "\\6&2T_7^d<n\\s5X]Cu";
      int int0 = 36;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\6`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 9165;
      String string0 = "TOg^1$;of#6 vLF\\3";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\3`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(l;:)", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp regexp0 = Parser.parse("TXy,vr>|SLn|pc}", 9168);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("(?(?", 2884);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^(?i:@UGTOD%/},BBB6)", 2513);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        Parser.parse("(?", (-683));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 8189);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("g0Z{6", 785);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse("=,>Xi6h3xV<|", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "\\C";
      int int0 = (-827);
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\C`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "apbQZ+W%9cgj<Pp\\";
      int int0 = 120;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: trailing backslash at end of expression
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("]m*v*dh{*9TqK,7L", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("MO .=r^", 1048);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        Parser.parse("YO'd(z:cHAX~l", (-908));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `YO'd(z:cHAX~l`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|4atxB!!Bci", (-340));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp regexp0 = Parser.parse("<u|1", (-3571));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse(",lh6f/46];|)9", (-4388));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[X:x00-x{FFFF}]", (-1968));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = "";
      int int0 = 100;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = 785;
      String string0 = "(?P<(?PF";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        Parser.parse("*m9|Pn^]9:yx4KA", 45);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        Parser.parse("~7!V\u0007H qlsAf*+MX", 1780);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `*+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("5k{y??;T$", 244);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("TcaH.=mn{1NemEs~?", 3540);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp regexp0 = Parser.parse("dl?9*|db7uJw}0", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 73);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        Parser.parse(",2(R|S", 60);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `,2(R|S`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[X:x080-{FFFF]", (-1968));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:m:]", (-3164));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp regexp0 = Parser.parse("AkUoRe_=_zfn!I0u[!]", (-2007));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 49);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".rxkwes|.Vy2FGVf6", 764);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp regexp0 = Parser.parse("dml?9*|db7uJw}0", (-664));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = "";
      int int0 = 2831;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }
}