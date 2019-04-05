/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:03:28 GMT 2019
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
      Regexp regexp0 = Parser.parse("\"O#b,e8@P|6|i", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("X*!,{9Rp'e", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("FxY1|;Ym|", 66045);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("9 <O%yLX<*?bP/", 1256);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-{10FF}]", 648);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = new Parser((String) null, 7);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PP:]", (-2079));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        Parser.parse("rWLQ(b:YQT!u?+_a@", 3300);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `?+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp regexp0 = Parser.parse("c~rO2B$=1]$h", 32);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        Parser.parse("\bWC(z1AjJsd", 120772);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `\bWC(z1AjJsd`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Parser.parse("Wxvk\"/[T-E:YfH", 1589);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `T-E`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[9];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 1, 9);
      assertEquals(8, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[2];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 13, 0);
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
      Regexp[] regexpArray0 = new Regexp[3];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, 48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, (-263), (-263));
      assertEquals(0, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", (-2079));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, 2311, 65509);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 681, 4239);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 681
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, 63);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 2037;
      String string0 = "\\P{2\"S*\\nP&5";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `\\P{2\"S*\\nP&5`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = (-1832);
      String string0 = "Q\\+ bIlU(Of2CiYH_";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `Q\\+ bIlU(Of2CiYH_`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 4913);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Z?|.", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp regexp0 = Parser.parse("t[:::]", 909);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("~l~Q[`bTJIXm4PN6-#<", (-292));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `6-#`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("[X;F89QJ&Vf{( -", (-8));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[X;F89QJ&Vf{( -`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        Parser.parse("xpP[jdM&", (-4899));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[jdM&`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("m1iecHoht;[-/d&X", 84);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-/d&X`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        Parser.parse("m1iecHoht;[-/d&X", (-3151));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-/d&X`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        Parser.parse("[]", 66045);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^Kwx0-x{10F!NFF}]", 6021);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        Parser.parse("[", (-3112));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      try { 
        Parser.parse("C#f0u|W5D7CGz<)", (-2079));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".|H$#m9=r", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp regexp0 = Parser.parse("dBQ'\"n@&t!|4|-", (-256));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        Parser.parse("(?bP<", 80);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?b`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        Parser.parse("(?i:", (-3112));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        Parser.parse("(?", 66037);
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
        Parser.parse("(?P<", 80);
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
      Regexp regexp0 = Parser.parse("A@Ti\"C|2{52,", 2377);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S`@A_{3", 736);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp regexp0 = Parser.parse("&(2&>AmxYZ)", 66044);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = "P\\";
      int int0 = (-5660);
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
  public void test43()  throws Throwable  {
      Regexp regexp0 = Parser.parse("n^Vef8{7}_", 1009);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", (-683));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("sm9<Jl{|s", 66013);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 8);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|TQPeg{r-QsE-I&M", 1097);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        Parser.parse(">hCVc(U|;8", 89);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `>hCVc(U|;8`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 32);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        Parser.parse("+@", 1813);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp regexp0 = Parser.parse("8?", 704);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 43561);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("gHhN&Y4IM[@]%", 93);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:9]m|X\"'i", 1533);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:']", 68);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp regexp0 = Parser.parse("2kfaA>j@[E]s|", 1181);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("H}Au|H@yS^T@'i17/\"8", 420);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp regexp0 = Parser.parse("-I|P'YDBd!:Jy", (-2130));
      assertNotNull(regexp0);
  }
}
