/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:18:19 GMT 2018
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
        Parser.parse("3sz,`WPzL`F(wAua-", 3905);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `3sz,`WPzL`F(wAua-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("'HvC|", 3905);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".{x5`1", 1488);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P3", 644);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P59{L#h>:", 1488);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp regexp0 = Parser.parse("V].6", 125);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P", 1873);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 7544);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z", (-1386));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^Q2Q%iHz", 644);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 7557);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp regexp0 = Parser.parse("ZXVO ?|}KunLC", (-1408));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp regexp0 = Parser.parse("FD %VV*/{", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{7lRG69`H%u", 6608);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp regexp0 = Parser.parse("'{+EfPH^NK4M{", (-2259));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp regexp0 = Parser.parse("56*jA9L", (-2807));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        Parser.parse(".[", 848);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:r:]", (-1764));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::s]", (-1755));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 117);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Parser.parse("/1~0TI)}(2", (-2259));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp regexp0 = Parser.parse("f$`o3_rI{", 1873);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse("3sz,`WPzL`(wAua-", 3877);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `3sz,`WPzL`(wAua-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Parser.parse("[::#h\u0007BKwsp-", (-803));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[::#h\u0007BKwsp-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("#(2Mg?V-|", 988);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `#(2Mg?V-|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp regexp0 = Parser.parse("lB$-", 1136);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp regexp0 = Parser.parse("| Gyri,^c8Xa$x", 45);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z", 988);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\"av=gWN~VCJC_48y", 117);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 3245);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        Parser.parse("[:g-0[?PG", 109);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `g-0`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 1528);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      try { 
        Parser.parse("zrSnT*x)|-kNs\"S[}B", 105);
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
      Regexp regexp0 = Parser.parse("\u0003", 601);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x", (-2747));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p`_S;F", 1488);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        Parser.parse("l2uiyZVwg?*M", 988);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `?*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("=eGu&1^I' O8j>nk", 56);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        Parser.parse("(?(?P<", 117);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\r", 1488);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        Parser.parse("+RXyf4", 3905);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp regexp0 = Parser.parse("KR\"3R@P\u0006S-", (-1764));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        Parser.parse("(?-eP<", 7544);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?-e`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 3404);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        Parser.parse("(?:", 973);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        Parser.parse("\":Npo!~_i8|){E", (-848));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        Parser.parse(",c:,t(QQFhMv_(r^+", 988);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `,c:,t(QQFhMv_(r^+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 41);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]{}^$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\f3", (-168));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("<Nu\"MeVy-Pa|j", 7544);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        Parser.parse("/2\u0000TJ),(2", 117);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("(?", 2041);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("So", 6608);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse("3jV-B`9gIa\b'k0s", 6608);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse(",;QP^.C", 988);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("A", 7544);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Parser parser0 = new Parser("\"[rb6D=<o/P5:-:", 117);
      assertNotNull(parser0);
      
      Regexp regexp0 = Parser.parse("9^G|2alH wtH`", 117);
      assertNotNull(regexp0);
      
      String string0 = regexp0.toString();
      assertNotNull(string0);
      assertEquals("(?i:9)\\A(?i:G)|(?i:2ALH WTH`)", string0);
      
      Regexp regexp1 = Parser.parse("(?i:9)A(?i:G)|(?i:2ALH WTH`)", 117);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:]1`P6", (-1055));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-576));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = 1488;
      Regexp regexp0 = Parser.parse("R\"R@P\u0006-", 1488);
      assertNotNull(regexp0);
      
      String string0 = "<z:As][^]1`P6";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^]1`P6`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp regexp0 = Parser.parse("A|Q|fS+Qxw;qR", 53);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", (-3487));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{78jxTqRc_V.", (-676));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\t", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        Parser.parse("aMMXX5>]E[-NX", 85);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-NX`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      try { 
        Parser.parse("aMMXX5>]5[-NX", 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-NX`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      try { 
        Parser.parse("g[|{>h)fhvq&-", 200);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[|{>h)fhvq&-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Regexp regexp0 = Parser.parse("0t(@gR,T:w)|v", 13);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PC_48y", 973);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      try { 
        Parser.parse("\\PC_8y", 956);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\P`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Regexp regexp0 = Parser.parse("s0=", 3404);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Regexp regexp0 = Parser.parse("-Q.Bh$q\"#q7WU:`e8v", 313);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Regexp regexp0 = Parser.parse("s0=", (-823));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Regexp regexp0 = Parser.parse("%T/??w 2SPoUZ*Ei!\"", 988);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Regexp regexp0 = Parser.parse("B", 92);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PCX*0m%s}{3", 13);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:9::]", 848);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("zP\u0004{:`|0RbFY<{u", (-3543));
      assertNotNull(parser0);
      
      Regexp regexp1 = Parser.parse("zP\u0004{:`|0RbFY<{u", 241);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
      
      int int0 = 55;
      String string0 = "E.o[O{KE0G?GU\"";
      Regexp regexp2 = Parser.parse(string0, int0);
      assertNotNull(regexp2);
      assertNotSame(regexp2, regexp1);
      assertNotSame(regexp2, regexp0);
      assertFalse(regexp2.equals((Object)regexp1));
      assertFalse(regexp2.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      int int0 = 988;
      String string0 = "k4[2\\D'MQ[Q";
      try { 
        Parser.parse("k4[2D'MQ[Q", 988);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[2D'MQ[Q`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String string0 = "[:\\::]";
      Regexp regexp0 = Parser.parse("[:::]", 973);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("[:::]", 973);
      assertNotNull(parser0);
      
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      Regexp regexp1 = Parser.parse("kSGN6]7V\"zaa", 973);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
      
      regexpArray0[1] = regexp1;
      int int0 = (-1243);
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 973, (-1243));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Regexp regexp0 = Parser.parse(",;P^.C", (-2824));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Regexp regexp0 = Parser.parse("IS-z+Q>[j]6l", (-3487));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Regexp regexp0 = Parser.parse("IS-z+Q>[j]6l", 988);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFFF}]", (-2152));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-Xx{10FFFF}]", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", (-115));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0000", 1252);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00}x{10sFFF}]", (-576));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFF}]", (-439));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x0D0-x{10FFF}]", (-423));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Regexp regexp0 = Parser.parse("I-z+Q[j]6l", (-3511));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x0-Xx{10FFFF]", (-947));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 65);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      String string0 = "\\x{";
      Regexp regexp0 = Parser.parse("x{", 2648);
      assertNotNull(regexp0);
      
      int int0 = 1638;
      Regexp regexp1 = Parser.parse(string0, int0);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\n", 8253);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Regexp regexp0 = Parser.parse("l|ky", 25);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse("cucjoS`>|c_", (-671));
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Regexp regexp0 = Parser.parse("gX\u0001HWFe!C,y", 12);
      assertNotNull(regexp0);
  }
}