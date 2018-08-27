/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:28:48 GMT 2018
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
      Regexp regexp0 = Parser.parse("E", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PPPrd:]", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      try { 
        Parser.parse("Zl[W\u0004t1GNN:b,w/|o|", 6104);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[W\u0004t1GNN:b,w/|o|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      try { 
        Parser.parse("/au<W[CYnbcQ}b", 6128);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[CYnbcQ}b`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".:,T/Te|qY1-@", 2096);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      try { 
        Parser.parse(")7", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      try { 
        Parser.parse("I_~]U?sGM(e\"[)TjX`_", 741);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[)TjX`_`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|2 !gx]Hx<<c2", (-1295));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      try { 
        Parser.parse("$IL(:^2\fB*N9{", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `$IL(:^2\fB*N9{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Regexp regexp0 = Parser.parse("1!\"|m^O-]C", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      try { 
        Parser.parse("]f`}b)}+Lb", 80);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Regexp regexp0 = Parser.parse("4{7l5", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      try { 
        Parser.parse("[:#/I-#,AC", (-1696));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `I-#`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      try { 
        Parser.parse("(M l7l(E^j;", (-1767));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(M l7l(E^j;`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/EvXV9iA\"ICn;F-^8+3", 76);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      try { 
        Parser.parse("$IL(:^2\fB*N9{", 1928);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `$IL(:^2\fB*N9{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      try { 
        Parser.parse("uZ(?P<", 2064);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[invalid char class]", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 3424);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Regexp regexp0 = Parser.parse("xjlOuO[.oo8cR\"]", (-3187));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      try { 
        Parser.parse("*k.h]", 41);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Pz4Chq", 6140);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".:,T/Te|KJqY1-@", 729);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Regexp regexp0 = Parser.parse("pI", (-1923));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      try { 
        Parser.parse("[:;8`xNbCY102oI", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:;8`xNbCY102oI`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Regexp regexp0 = Parser.parse("$5 HHe82BO,/", 24);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      try { 
        Parser.parse("uZ(?P<", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p'", 3797);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Regexp regexp0 = Parser.parse("com.google.re2j.PatternSyntaxException", 24);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("", 24);
      assertNotNull(parser0);
      
      Regexp regexp1 = Parser.parse("E", 24);
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
      
      Regexp regexp2 = Parser.parse("", 24);
      assertFalse(regexp2.equals((Object)regexp0));
      assertFalse(regexp2.equals((Object)regexp1));
      assertNotNull(regexp2);
      assertNotSame(regexp2, regexp0);
      assertNotSame(regexp2, regexp1);
      
      Regexp regexp3 = Parser.parse("", 24);
      assertFalse(regexp3.equals((Object)regexp0));
      assertFalse(regexp3.equals((Object)regexp1));
      assertTrue(regexp3.equals((Object)regexp2));
      assertNotNull(regexp3);
      assertNotSame(regexp3, regexp2);
      assertNotSame(regexp3, regexp0);
      assertNotSame(regexp3, regexp1);
      
      Regexp regexp4 = Parser.parse("X{Bcwx=", (-2877));
      assertFalse(regexp4.equals((Object)regexp1));
      assertFalse(regexp4.equals((Object)regexp2));
      assertFalse(regexp4.equals((Object)regexp0));
      assertFalse(regexp4.equals((Object)regexp3));
      assertNotNull(regexp4);
      assertNotSame(regexp4, regexp1);
      assertNotSame(regexp4, regexp2);
      assertNotSame(regexp4, regexp0);
      assertNotSame(regexp4, regexp3);
      
      Regexp regexp5 = Parser.parse("X{Bcwx=", 24);
      assertFalse(regexp5.equals((Object)regexp0));
      assertFalse(regexp5.equals((Object)regexp2));
      assertFalse(regexp5.equals((Object)regexp1));
      assertFalse(regexp5.equals((Object)regexp3));
      assertTrue(regexp5.equals((Object)regexp4));
      assertNotNull(regexp5);
      assertNotSame(regexp5, regexp0);
      assertNotSame(regexp5, regexp2);
      assertNotSame(regexp5, regexp4);
      assertNotSame(regexp5, regexp1);
      assertNotSame(regexp5, regexp3);
      
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp6 = new Regexp(regexp_Op0);
      assertFalse(regexp6.equals((Object)regexp1));
      assertFalse(regexp6.equals((Object)regexp3));
      assertFalse(regexp6.equals((Object)regexp5));
      assertFalse(regexp6.equals((Object)regexp0));
      assertFalse(regexp6.equals((Object)regexp4));
      assertFalse(regexp6.equals((Object)regexp2));
      assertNotNull(regexp6);
      
      Regexp regexp7 = Parser.parse("[:upper:]", 84);
      assertFalse(regexp7.equals((Object)regexp1));
      assertFalse(regexp7.equals((Object)regexp3));
      assertFalse(regexp7.equals((Object)regexp5));
      assertFalse(regexp7.equals((Object)regexp2));
      assertFalse(regexp7.equals((Object)regexp4));
      assertFalse(regexp7.equals((Object)regexp6));
      assertFalse(regexp7.equals((Object)regexp0));
      assertNotNull(regexp7);
      assertNotSame(regexp7, regexp1);
      assertNotSame(regexp7, regexp3);
      assertNotSame(regexp7, regexp5);
      assertNotSame(regexp7, regexp2);
      assertNotSame(regexp7, regexp4);
      assertNotSame(regexp7, regexp6);
      assertNotSame(regexp7, regexp0);
      
      Regexp regexp8 = Parser.parse("p^word:]", (-2871));
      assertFalse(regexp8.equals((Object)regexp4));
      assertFalse(regexp8.equals((Object)regexp2));
      assertFalse(regexp8.equals((Object)regexp1));
      assertFalse(regexp8.equals((Object)regexp3));
      assertFalse(regexp8.equals((Object)regexp5));
      assertFalse(regexp8.equals((Object)regexp7));
      assertFalse(regexp8.equals((Object)regexp6));
      assertFalse(regexp8.equals((Object)regexp0));
      assertNotNull(regexp8);
      assertNotSame(regexp8, regexp4);
      assertNotSame(regexp8, regexp2);
      assertNotSame(regexp8, regexp1);
      assertNotSame(regexp8, regexp3);
      assertNotSame(regexp8, regexp5);
      assertNotSame(regexp8, regexp7);
      assertNotSame(regexp8, regexp6);
      assertNotSame(regexp8, regexp0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        Parser.parse("(?(Z:^2qfB*N<9{", 6104);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        Parser.parse("(?", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      try { 
        Parser.parse("(e{-9aD0N:1'#:v$4#]", (-975));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(e{-9aD0N:1'#:v$4#]`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D+", 220);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:=]", 205);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\"!\"XA0cxJ`<=1(w)m", (-1696));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Regexp regexp0 = Parser.parse("'oNe*`vO", (-903));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      try { 
        Parser.parse("(;I[^2cMHdA> )7,", (-1295));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^2cMHdA> )7,`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C", (-787));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Regexp regexp0 = Parser.parse("4pRa 3pE*=bA>", 76);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Regexp regexp0 = Parser.parse("_\nDG>0Q#`dQlc&", 789);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("_\nDG>0Q#`dQlc&", 789);
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D%0x`'|P", 216);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      try { 
        Parser.parse("[:h", (-787));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:h`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      try { 
        Parser.parse("(?:", 97);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      try { 
        Parser.parse("&{47Ot`GI [g<`", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[g<``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      try { 
        Parser.parse("oM x/j\u0010)Dz4KVg", 729);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P:]", 94);
      assertNotNull(regexp0);
      
      try { 
        Parser.parse("~P\u0001LY}i9:F*$)~Mu", 997);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 433);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]{}^$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 76);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      try { 
        Parser.parse("FEs\"\u0007)Si798", 92);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PCY102oI", 721);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      try { 
        Parser.parse("/,X|N11i)\"vEd.q&", 3424);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Regexp regexp0 = Parser.parse(":|:", 65092);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Regexp regexp0 = Parser.parse("kH0?~+2}35fviEP$}", 24);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\r", 40);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      try { 
        Parser.parse("2TV [^`2>UT%", 52);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^`2>UT%`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Regexp regexp0 = Parser.parse("s", (-1060));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Regexp regexp0 = Parser.parse("&0YJj*,'|&", 1789);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0004", 1512);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Regexp regexp0 = Parser.parse("s", (-1043));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Regexp regexp0 = Parser.parse(";F&WEC#{5}C7D", (-1263));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      try { 
        Parser.parse("3!U+FtJG*+pm}V..", 76);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `*+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D%0x`|P", 245);
      assertNotNull(regexp0);
      
      try { 
        Parser.parse("^ox=\tUk[", 245);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Regexp regexp0 = Parser.parse(";F&WEC#{5}C7D", 721);
      assertNotNull(regexp0);
      
      Regexp[] regexpArray0 = new Regexp[6];
      String string0 = regexp0.toString();
      assertEquals("(?i:;F&WEC)(?i:#){5}(?i:C\\x7f7D)", string0);
      assertNotNull(string0);
      
      Regexp regexp1 = Parser.parse("(?i:;F&WEC)(?i:#){5}(?i:Cx7f7D)", 721);
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotNull(regexp1);
      assertNotSame(regexp1, regexp0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", (-787));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x", (-787));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x{", (-1044));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFF}]", 57);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Regexp regexp0 = Parser.parse("d+5YS|F'g%\"u6Q<", (-1060));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Regexp regexp0 = Parser.parse("pC#12o", (-292));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      try { 
        Parser.parse("xLV[D/,-g#Kf%Jb~i", (-287));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[D/,-g#Kf%Jb~i`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Regexp regexp0 = Parser.parse("B", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Regexp regexp0 = Parser.parse("fp`e&ELq7i_[-2!]", (-1295));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Regexp regexp0 = Parser.parse("cGm7OzFV9|l|", (-787));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Regexp regexp0 = Parser.parse("fp`e&ELq7i_[-2!]", 57);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z", 601);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D", 1505);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 93);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0003", (-2252));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Regexp regexp0 = Parser.parse("mE~n\u0000<RC", (-787));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      try { 
        Parser.parse("[eK:$t1rNN:bjw/|o|", 1768);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[eK:$t1rNN:bjw/|o|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFFF}]", 57);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Regexp regexp0 = Parser.parse("&ZYUN/YY{0", 1485);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x0-]{10FnF}S]", 17);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Regexp regexp0 = Parser.parse(";VwJx}3BO@u}AW2;", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{1qFFFD}]", 125);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", 460);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\b", 976);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:;]", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0005", 1285);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Regexp regexp0 = Parser.parse("wf&\"@:YTyO{}JtR*x|.", 68);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int int0 = 2753;
      try { 
        Parser.parse("[:E!*&M`}N-", 2753);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:E!*&M`}N-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S|,", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?>Z:^2q/B*N<9{", 2753);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      try { 
        Parser.parse("ao%{09&UL1.&$7qGq(", 2753);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `ao%{09&UL1.&$7qGq(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[O-]", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Regexp regexp0 = Parser.parse("U[O]", 49);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0006", (-960));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Ll[O]", 52);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Regexp regexp0 = Parser.parse("UP[O]", (-1943));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Regexp regexp0 = Parser.parse("U[.]", 2493);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser((String) null, 2493);
      assertNotNull(parser0);
      
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      assertNotNull(regexp1);
      
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 8316, 2493);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = ".(\\any6JC";
      int int0 = 3024;
      try { 
        Parser.parse(".(any6JC", 3024);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `.(any6JC`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 41);
      assertNotNull(regexp0);
  }
}