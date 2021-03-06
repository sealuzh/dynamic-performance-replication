/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 06:24:43 GMT 2019
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
      try { 
        Parser.parse("S(SD|VsJ|L", 43465);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `S(SD|VsJ|L`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("4wr{9VEpCF&vXRpQ", 1273);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFF}]", 1945);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("bW8q>U<[QH]a", 120);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = new Parser("Limbu", 1174);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp regexp0 = Parser.parse("CfQgXxlUe\"?Sc#ki", 4197);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("E<o!`b&dl{#P\"", 89);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 2, 3);
      assertEquals(1, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[4];
      int int0 = 0;
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, int0, int0);
      assertEquals(0, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, (-209));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 65);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, 43465, 120603);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-775), (-2662));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 15, 128542);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      try { 
        Parser.parse("6C][", 125);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "\\6";
      int int0 = (-4771);
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
  public void test17()  throws Throwable  {
      String string0 = "\\5nTFdq_93U";
      Regexp regexp0 = Parser.parse("\u0005nTFdq_93U", (-299));
      try { 
        Parser.parse(string0, regexp0.min);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\5`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[]x00-x]10FFF}]", 7144);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[9:H]", 2664);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Parser.parse("Jfkb]En5[Pr9^jR0-)", (-299));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `0-)`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse("/j0bo+F[Na:[|.5()8-", (-299));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[Na:[|.5()8-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Parser.parse("a[-cp", 609);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-cp`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("a[-cp", 36);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-cp`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("[^\u0000-x{10FFFKF}", 2400);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^\u0000-x{10FFFKF}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        Parser.parse("B|I;TTz&*Hw\"G[d", 3277);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[d`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 108);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp regexp0 = Parser.parse("ubC|c", 8);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C|c", 2105);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C|.", (-3271));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C|.", (-1296));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("'j4AN9R'@e'G3Pq{.A", (-299));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      try { 
        Parser.parse("(?i-:$)", (-2051));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?i-:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", 113);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        Parser.parse("vc:!%9uBH#](?Uv&s", 1504);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?Uv`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?)y", (-539));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        Parser.parse("(?", (-140));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        Parser.parse("(?P<", (-27));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{1", 720);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|s6J|WL", (-1055));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 108);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp regexp0 = Parser.parse("jw\"|hCPO$KHTvw", 1965);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse("}r^xl(g9gd|Dma{", 2877);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `}r^xl(g9gd|Dma{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?i:9)(?-m:$)(?i:2LKAR)|(?i:DVA -x7fRE<)", (-920));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("iPn|iw+u", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?i:", 8);
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
        Parser.parse("?ZX'Z%", (-492));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("y5&V\"Z\"+", (-551));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 65);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S[6]AJVjg1", 1);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[9::]", 48);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C|c", 16);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[9:: ]", (-152));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      try { 
        Parser.parse("s|2):h{M[-", (-900));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("=EVc/ pg2W[F]3wJ", (-68));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp regexp0 = Parser.parse("G|g'pG$!`", 29);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("jw\"|hCPO$KHTvw", 1815);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 1156);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]{}^$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }
}
