/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:21:08 GMT 2019
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
        Parser.parse("Wap^%(BJ|i", (-2599));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `Wap^%(BJ|i`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("QK{9LiAaNBVqAdCRG", (-1688));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", (-912));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("J|c", (-5188));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("20{\"WQQW", (-3367));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser("pP3OG;", 118);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[3];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 1, 2);
      assertEquals(1, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp[] regexpArray0 = Parser.subarray((Regexp[]) null, 0, 0);
      assertEquals(0, regexpArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, (-3367), (-3367));
      assertEquals(0, regexpArray1.length);
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 119638);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp[] regexpArray0 = null;
      int int0 = 3428;
      int int1 = 6157;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, int0, int1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, 3203, (-349));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 320, 938);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 320
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = null;
      int int0 = 3400;
      // Undeclared exception!
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Parser.parse("(qG[oV{K3OG;", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[oV{K3OG;`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:]{}^$", (-247));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:?>]lU$", 1993);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        Parser.parse("B[n)N-1}Fc", (-1020));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `N-1`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        Parser.parse("nx[~wDe;,y-", 3517);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[~wDe;,y-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^S00-x{10FzFFF}]", (-1708));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Parser.parse("[-:8", 1000);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-:8`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Parser.parse("[-:8", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-:8`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 1537);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]{}^$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 43616);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("7i#DL{+t |X|;\u0007^[", 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("EJ8Ld~['~UThz[:Q`", 93);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `['~UThz[:Q``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "\\3d";
      int int0 = 2788;
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
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("%4 o|BJLOp)", 476);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        Parser.parse("JxFMeG_i:Hu^|7|7|(~", 1864);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `JxFMeG_i:Hu^|7|7|(~`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        Parser.parse("(?-)", 3137);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?-)`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", (-299));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        Parser.parse("(?i<(?Q<", 593);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?i<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", 2168);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?)P<", (-3979));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse("K`EEdE5zBM{3,u]1%k", (-3));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{7", (-300));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C\"av|DV@~7i?AHu5Ll", (-568));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        Parser.parse("qAZr`B***w+2JZNVV)", 2257);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `**`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = "O\\";
      int int0 = (-255);
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
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", 476);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse("(?", 3169);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Lu;7^|L", 4392);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse("V&O0(|d|", 476);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `V&O0(|d|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:t:]", 476);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 57);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        Parser.parse("(?", 0);
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
        Parser.parse("?%m!\"-h>^Q/1.", (-56));
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
      Regexp regexp0 = Parser.parse("c @+", 636);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 1153);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[?>]lU$", 1108);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("[T]T)@434", (-687));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("mG/[2]-", 6537);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P|d", (-559));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("%Stdwz@=|%$U^;&dC0", 508);
      assertNotNull(regexp0);
  }
}