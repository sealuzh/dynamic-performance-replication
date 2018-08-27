/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:10:00 GMT 2018
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
  public void test000()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^`;*{;_Jn", (-1231));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|u3w4@bge6SS]", 16);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:igit:]", (-12));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^`;*{;_Jn", (-1208));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      try { 
        Parser.parse("[.zr(", 53);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[.zr(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Regexp regexp0 = Parser.parse("E", (-1231));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Regexp regexp0 = Parser.parse("3IRm3=^@{-2J", (-1884));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 1784);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?P", 2817);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      try { 
        Parser.parse("vW 8FZ(secTWVE", (-1884));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `vW 8FZ(secTWVE`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Regexp regexp0 = Parser.parse("yCFY1z<1jB{", 3344);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|y'+-", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Regexp regexp0 = Parser.parse("R|u3w4@bge6SS]", 16);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      try { 
        Parser.parse("-P}(@xY<Jg", 120);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `-P}(@xY<Jg`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Regexp regexp0 = Parser.parse("KPb+F", (-1587));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      try { 
        Parser.parse("pP+rC?[ix!<{", 1225);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[ix!<{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".eN", (-259));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Regexp regexp0 = Parser.parse("com.google.re2j.Parser$1", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      try { 
        Parser.parse("CZ)j\"LH:C;jZd5@", (-12));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Regexp regexp0 = Parser.parse("tXEWF?fWu", (-2367));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        Parser.parse("U(\":", 85);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `U(\":`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      try { 
        Parser.parse("?T=`dU@3=9<4d", 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Regexp regexp0 = Parser.parse("$qx$9C/W", (-12));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z", 116);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C", 1020);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P+", 8693);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Tj3Rex2TxBXTC+3|r", (-48));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p:]", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        Parser.parse("-P}(@xY?Jg", (-259));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `-P}(@xY?Jg`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        Parser.parse("8*+qM", (-280));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `*+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        Parser.parse("PY^a?XQK9Hnsi?c8[", (-2104));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Regexp regexp0 = Parser.parse("#Oi$&H7=yc", 100);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Regexp regexp0 = Parser.parse("d", 1760);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[0]@<ftOZ+QO^^ a", (-588));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[0]@<ftOZ+QO^^ a", 109);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\r", 1497);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Regexp regexp0 = Parser.parse("_n::vktJ%LRW7p~-<z", 9);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      try { 
        Parser.parse("YhQ6&[f-`#", 43188);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `f-``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-239));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Regexp regexp0 = Parser.parse(" `hHM@Q}OA\u0005X", 9);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Regexp regexp0 = Parser.parse("sw53V|SgatRpG|", 3392);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      try { 
        Parser.parse("(?P", (-1587));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?P`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      try { 
        Parser.parse("(?s:", 96);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?s:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 7145);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      try { 
        Parser.parse("(?", (-1587));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 1697);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]{}^$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D", 85);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Regexp regexp0 = Parser.parse("<|/", 128);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:0]@<ftOZ+QO^^ a", (-1879));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", (-275));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", (-3388));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-xL10FFFF}", 113);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Regexp regexp0 = Parser.parse("9{7L9%L;JmT<;p", (-12));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      try { 
        Parser.parse("P^[a", (-12));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[a`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      try { 
        Parser.parse("pP+rC?[ix!<{", (-3112));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[ix!<{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      try { 
        Parser.parse("V|}o)", (-259));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      try { 
        Parser.parse("(T42U !OGn`p()] Xv", 1505);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(T42U !OGn`p()] Xv`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0003\"d", 5829);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      try { 
        Parser.parse("-\u0006=}(@xY?Jg", (-1591));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `-\u0006=}(@xY?Jg`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\t", 893);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Q:]", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Regexp regexp0 = Parser.parse("y?bvVaY*y", 1989);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Regexp regexp0 = Parser.parse("@Lo&LmDvMO|Q2?x|VL", 2249);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p{", 1768);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x", 80);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 1);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Regexp regexp0 = Parser.parse("A", 616);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      try { 
        Parser.parse("uk4[xk{2:D],[^0M", 1505);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^0M`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      try { 
        Parser.parse("[:xk{2:D],[^0M", 3580);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^0M`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0006", 2101);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      try { 
        Parser.parse("`[\"raA=XE{ey)Dm\"6M", 101);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[\"raA=XE{ey)Dm\"6M`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      try { 
        Parser.parse("}V|}o)", (-259));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D/QB`?F?3", 84);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[Y]@m<ftOZ+QO^^hr/ a", (-3));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      try { 
        Parser.parse("YQ6&[-#", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-#`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x0ZA0-x{10F", (-568));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u001Ad", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{$7%~R|{Jr", 6949);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Regexp regexp0 = Parser.parse("pLm{", 1505);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 893);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0002d", (-40));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Regexp regexp0 = Parser.parse(",o-dLc>'{c~\u0001", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0000", (-1551));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10YFFF}", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Ih$]qh.-7Tz", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Regexp regexp0 = Parser.parse("'T$n]Zn4BT;Y{14", 893);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\b", 893);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        Parser.parse("YQ6&[-#", 113);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-#`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Regexp regexp0 = Parser.parse("l15\fAn8@KI", 453);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p{}^$", 748);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = "(?-:u)";
      try { 
        Parser.parse("(?-:u)", 7145);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?-:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x0O-x{10YdRFFA}", 748);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-6{10FFF}", 764);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^\u0000-x{10FFF}", 8);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^??X", 93);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Regexp regexp0 = Parser.parse("~aiiY6zvY[=]GoEOf32O", 1764);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      try { 
        Parser.parse("P`xfTg\u0007nMb;([E0P", 1501);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[E0P`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D:\n,G{!PI<cYX", 8172);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFFF}]", 97);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x40-x{10FFFF}]", 97);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse("H N7#xaOZZtt", 97);
      assertNotNull(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotSame(regexp1, regexp0);
      
      try { 
        Parser.parse("V=6Q(o.*W@1d", 97);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `V=6Q(o.*W@1d`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[9];
      int int0 = 1197;
      Regexp regexp0 = Parser.parse("x??", 1197);
      assertNotNull(regexp0);
      
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      assertNotNull(regexp1);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexpArray0[1] = regexp1;
      String string0 = "-";
      regexp0.max = 58;
      int int1 = 564;
      Regexp regexp2 = Parser.parse("-", 564);
      assertNotNull(regexp2);
      assertFalse(regexp2.equals((Object)regexp0));
      assertFalse(regexp2.equals((Object)regexp1));
      assertNotSame(regexp2, regexp0);
      assertNotSame(regexp2, regexp1);
      
      regexpArray0[2] = regexp2;
      Regexp regexp3 = Parser.parse("-", 1197);
      assertNotNull(regexp3);
      assertFalse(regexp3.equals((Object)regexp0));
      assertFalse(regexp3.equals((Object)regexp1));
      assertTrue(regexp3.equals((Object)regexp2));
      assertNotSame(regexp3, regexp0);
      assertNotSame(regexp3, regexp2);
      assertNotSame(regexp3, regexp1);
      
      regexpArray0[3] = regexp3;
      Regexp regexp4 = Parser.parse("x??", 1197);
      assertNotNull(regexp4);
      assertTrue(regexp4.equals((Object)regexp0));
      assertFalse(regexp4.equals((Object)regexp2));
      assertFalse(regexp4.equals((Object)regexp3));
      assertTrue(regexp4.equals((Object)regexp1));
      assertNotSame(regexp4, regexp0);
      assertNotSame(regexp4, regexp1);
      assertNotSame(regexp4, regexp2);
      assertNotSame(regexp4, regexp3);
      
      Regexp regexp5 = new Regexp(regexp4);
      assertNotNull(regexp5);
      assertTrue(regexp4.equals((Object)regexp0));
      assertFalse(regexp4.equals((Object)regexp2));
      assertFalse(regexp4.equals((Object)regexp3));
      assertTrue(regexp4.equals((Object)regexp1));
      assertTrue(regexp5.equals((Object)regexp1));
      assertTrue(regexp5.equals((Object)regexp0));
      assertFalse(regexp5.equals((Object)regexp2));
      assertTrue(regexp5.equals((Object)regexp4));
      assertFalse(regexp5.equals((Object)regexp3));
      
      regexpArray0[4] = regexp5;
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp6 = new Regexp(regexp_Op0);
      assertNotNull(regexp6);
      assertFalse(regexp6.equals((Object)regexp5));
      assertFalse(regexp6.equals((Object)regexp2));
      assertFalse(regexp6.equals((Object)regexp4));
      assertFalse(regexp6.equals((Object)regexp3));
      assertFalse(regexp6.equals((Object)regexp0));
      assertFalse(regexp6.equals((Object)regexp1));
      
      regexpArray0[5] = regexp6;
      Regexp regexp7 = new Regexp(regexp_Op0);
      assertNotNull(regexp7);
      assertFalse(regexp7.equals((Object)regexp5));
      assertFalse(regexp7.equals((Object)regexp2));
      assertFalse(regexp7.equals((Object)regexp1));
      assertFalse(regexp7.equals((Object)regexp0));
      assertFalse(regexp7.equals((Object)regexp4));
      assertFalse(regexp7.equals((Object)regexp3));
      
      regexpArray0[6] = regexp7;
      String string1 = "j[^tHvPaDz44%fkA%-";
      try { 
        Parser.parse("j[^tHvPaDz44%fkA%-", 1197);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^tHvPaDz44%fkA%-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int int0 = 2420;
      try { 
        Parser.parse("u^~kM!_0\"hmPq[HzB#", 2420);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[HzB#`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      assertNotNull(regexp0);
      
      regexpArray0[0] = regexp0;
      Regexp regexp1 = Parser.parse("|s|/", 1256);
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      
      regexpArray0[1] = regexp1;
      Regexp regexp2 = Parser.parse("|s|/", 1814);
      assertNotNull(regexp2);
      assertFalse(regexp2.equals((Object)regexp1));
      assertFalse(regexp2.equals((Object)regexp0));
      assertNotSame(regexp2, regexp1);
      assertNotSame(regexp2, regexp0);
      
      regexpArray0[2] = regexp2;
      Regexp regexp3 = new Regexp(regexp0);
      assertNotNull(regexp3);
      assertFalse(regexp0.equals((Object)regexp2));
      assertFalse(regexp3.equals((Object)regexp2));
      
      regexp1.op = regexp_Op0;
      regexpArray0[3] = regexp3;
      Regexp regexp4 = new Regexp(regexp2);
      assertNotNull(regexp4);
      assertFalse(regexp2.equals((Object)regexp1));
      assertFalse(regexp2.equals((Object)regexp3));
      assertFalse(regexp2.equals((Object)regexp0));
      assertFalse(regexp4.equals((Object)regexp1));
      assertTrue(regexp4.equals((Object)regexp2));
      assertFalse(regexp4.equals((Object)regexp0));
      assertFalse(regexp4.equals((Object)regexp3));
      
      regexpArray0[4] = regexp4;
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp5 = new Regexp(regexp_Op1);
      assertNotNull(regexp5);
      assertFalse(regexp_Op1.equals((Object)regexp_Op0));
      assertFalse(regexp5.equals((Object)regexp3));
      assertFalse(regexp5.equals((Object)regexp2));
      assertFalse(regexp5.equals((Object)regexp0));
      assertFalse(regexp5.equals((Object)regexp4));
      assertFalse(regexp5.equals((Object)regexp1));
      
      regexp5.op = regexp_Op1;
      regexpArray0[5] = regexp5;
      Regexp regexp6 = new Regexp(regexp1);
      assertNotNull(regexp6);
      assertFalse(regexp6.equals((Object)regexp4));
      assertTrue(regexp6.equals((Object)regexp1));
      assertFalse(regexp6.equals((Object)regexp5));
      assertFalse(regexp6.equals((Object)regexp2));
      assertFalse(regexp1.equals((Object)regexp4));
      assertFalse(regexp1.equals((Object)regexp2));
      assertFalse(regexp1.equals((Object)regexp5));
      
      regexpArray0[6] = regexp6;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 1256, 1814);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1256
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x<-c{10}", 1340);
      assertNotNull(regexp0);
  }
}