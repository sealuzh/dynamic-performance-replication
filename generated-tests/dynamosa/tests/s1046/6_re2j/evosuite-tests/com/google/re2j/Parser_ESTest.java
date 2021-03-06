/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 03:00:33 GMT 2019
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
      Regexp regexp0 = Parser.parse("Tc1+{9<FP", (-2335));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("FK~B_Mg^ZN_y[xY]", (-2016));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 237);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = new Parser("", (-1093));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("-zC", 13);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        Parser.parse("#JUXN(TBh]?*(", (-303));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `?*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PP\b`}+{\"", (-16));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp regexp0 = Parser.parse("]AV$6r]-Z1GwEhf", (-2059));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        Parser.parse("r1lM,PEN+tL(}I{2}TG", 45);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `r1lM,PEN+tL(}I{2}TG`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 1108, 0);
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
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, (-303), (-303));
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, 1233);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-1302), 1521);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, 3642);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Parser.parse(" <i!`(Kw:}T=xm~[SE", 92);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[SE`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", (-83));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:]NzMw/E8cp$oA", 289);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        Parser.parse("[:Ys--u}l6.wuP$9", 3176);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `s--`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        Parser.parse("[:-", 116);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        Parser.parse("#d/FD`jK{CC^-Y[-", 93);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Parser.parse("#d/FD`jK{CC^-Y[-", 4132);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Parser.parse(",jS{7[]NzMw/E8cp$oA", (-199));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]NzMw/E8cp$oA`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse(" vQw\"!A6G\"d[", 492);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp regexp0 = Parser.parse("u>()s`<c_0EBS&*k", 2037);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("(?(?P<", (-2359));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("(?i:", 3176);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m)", 1377);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("(?", 1129);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 720);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        Parser.parse("Vju2J7GV5>(,?!/{2", 65);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `Vju2J7GV5>(,?!/{2`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("aFKB_Mg^ZN_x`y[x]", (-1007));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 720);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      try { 
        Parser.parse("{7}OU&", 2517);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `{7}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Ad|.", (-1087));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        Parser.parse("/(WF4'?-6B{5,Qm", 2397);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `/(WF4'?-6B{5,Qm`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", (-660));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", 46);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|P%>de@X3", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp regexp0 = Parser.parse("jH/fTqm|P'!|pf", (-2059));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("aW'i7?|", (-1280));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-736));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse("??<", (-152));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `??`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/k-#]h/A\"*", 120);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse("(?(?P<", 13);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("v|w", 884);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[(RQ]$^ESt@$x}x%L", (-2820));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp regexp0 = Parser.parse(">|w", 720);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        Parser.parse("5|/|u)nVWR6a;]gkm!", (-2016));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("$%F[=]Do", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", (-2359));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?P<(?P><", 480);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<(?P<(?P`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }
}
