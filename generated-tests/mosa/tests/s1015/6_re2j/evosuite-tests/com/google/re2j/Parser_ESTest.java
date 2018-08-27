/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:42:28 GMT 2018
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
      Regexp regexp0 = Parser.parse("'|", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/4t0nL?|J", (-16));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      try { 
        Parser.parse("<a{?", (-3092));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `{?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      try { 
        Parser.parse("(?(?", (-204));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Fy`H&*WBqGlXLlXN", (-3243));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Regexp regexp0 = Parser.parse("com.google.re2j.Parser", (-16));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:^space:]", 48);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P7{z", 2217);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      try { 
        Parser.parse("P(&}$\"$ZTSZAcmnY_", (-16));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `P(&}$\"$ZTSZAcmnY_`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?(?P=", (-4415));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<(?(?P=`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Regexp regexp0 = Parser.parse(",PEGFV3,^", 4921);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Bm;\"T_^<h+NGV", (-4415));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Regexp regexp0 = Parser.parse("bV3z%sIv", (-4415));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\r", 120);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Regexp regexp0 = Parser.parse("I|=OY6$w", (-4415));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      try { 
        Parser.parse("V1)?fV*|>5*<", (-443));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Regexp regexp0 = Parser.parse("6|ENh@\"", (-443));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/4t0nL?|J", 85);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|mCT2", 3497);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P7{z", (-16));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P7{z", (-443));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Regexp regexp0 = Parser.parse("7{", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Regexp regexp0 = Parser.parse("JoJ.x.dxpVVbv>S", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      try { 
        Parser.parse(")", 44053);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:^space:]", 25);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Regexp regexp0 = Parser.parse("w", (-3347));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Regexp regexp0 = Parser.parse(">;w2<ZRm!}Ri6", 8016);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:ascii:]", 80);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      try { 
        Parser.parse("+tZ[<|s", (-4415));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      try { 
        Parser.parse("[:/{?", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:/{?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      try { 
        Parser.parse("(?(?P=", (-3347));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Regexp regexp0 = Parser.parse("#_", 44025);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      try { 
        Parser.parse("~u}#$DA`wA1s[|nfv5", 3497);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[|nfv5`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      try { 
        Parser.parse("(?", 6593);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      try { 
        Parser.parse("wa|)NQc<'Ew/w", 1524);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      try { 
        Parser.parse("(og?=", (-3347));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(og?=`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      try { 
        Parser.parse("A(l$+#}%:L$oO1d", 44025);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `A(l$+#}%:L$oO1d`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Utif1ldxNv!dXk{5,+U", (-443));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?:)", 1000);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\te:]", 1000);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 116);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x{", 5105);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\bApZ*", (-63));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C", (-35));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Regexp regexp0 = Parser.parse("A9", 1524);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".iS\u0006m<{hI?RxiY;crE", 3456);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Regexp regexp0 = Parser.parse("7|;", (-3347));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:e:]", 116);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Regexp regexp0 = Parser.parse("81D#dxh,|6j|R.=i5k6|", (-219));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Gu(nB{MB)'&Nc^_", (-515));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Regexp regexp0 = Parser.parse("}0In6\"8TdOuUD{45Y7", (-628));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      try { 
        Parser.parse("l_[BOh;c&CscQBE+[", (-59));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[BOh;c&CscQBE+[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PP7{z", (-16));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      try { 
        Parser.parse("[^spae:S", 48);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^spae:S`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Regexp regexp0 = Parser.parse("pP]hlU", 44025);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      try { 
        Parser.parse("<\"_8[]_", (-2088));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]_`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      try { 
        Parser.parse("~Q*13vQD(*?_4q", (-2088));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\f0:Lbu", 1000);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PL|nnv5", (-16));
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("PL|nnv5", (-16));
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      try { 
        Parser.parse("[:g-'", 44025);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `g-'`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", (-451));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      try { 
        Parser.parse("{96}FwwGZ*", 24);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `{96}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Regexp regexp0 = Parser.parse("UJ,cWt|\n+M", 1524);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p^L#]'0wctk}$m", 1232);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Regexp regexp0 = Parser.parse("B", (-3347));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:<00-x{10FFFF}]", 57344);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{10FFFF}]", (-2088));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^<00-x{10FFFF}]", 116);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 360);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^<00-x{10FFFF}]", 97);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      try { 
        Parser.parse("7[", 109);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Regexp regexp0 = Parser.parse("=e9-:8`z]Oya/j", 5089);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      try { 
        Parser.parse("(?i:", 509);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Regexp regexp0 = Parser.parse("!\u0004uT70", 1524);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Regexp regexp0 = Parser.parse("7[::]", 93);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x", 1);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0002{e", 241);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0001", 1524);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      try { 
        Parser.parse("I\u0001'(i,@Ihdu", 1705);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `I\u0001'(i,@Ihdu`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Regexp regexp0 = Parser.parse("xhn%\u00009O7\"<f}", (-627));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Regexp regexp0 = Parser.parse("0In6\"8TdOUD{457", 985);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x0y0-x{10FFFF}]", 128);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:e)", 81);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[9];
      Regexp regexp0 = Parser.parse("IDS_Binary_Operator", 57);
      assertNotNull(regexp0);
      
      regexpArray0[0] = regexp0;
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op0);
      assertNotNull(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      regexpArray0[1] = regexp1;
      Regexp regexp2 = Parser.parse("&", 9);
      assertNotSame(regexp2, regexp0);
      assertNotSame(regexp2, regexp1);
      assertNotNull(regexp2);
      assertFalse(regexp2.equals((Object)regexp0));
      assertFalse(regexp2.equals((Object)regexp1));
      
      regexpArray0[2] = regexp2;
      Regexp regexp3 = Parser.parse("v", 12);
      assertNotSame(regexp3, regexp1);
      assertNotSame(regexp3, regexp2);
      assertNotSame(regexp3, regexp0);
      assertNotNull(regexp3);
      assertFalse(regexp3.equals((Object)regexp1));
      assertFalse(regexp3.equals((Object)regexp2));
      assertFalse(regexp3.equals((Object)regexp0));
      
      regexpArray0[3] = regexp3;
      Regexp regexp4 = Parser.parse("invalid named capture", 65);
      assertNotSame(regexp4, regexp1);
      assertNotSame(regexp4, regexp3);
      assertNotSame(regexp4, regexp2);
      assertNotSame(regexp4, regexp0);
      assertNotNull(regexp4);
      assertFalse(regexp4.equals((Object)regexp1));
      assertFalse(regexp4.equals((Object)regexp3));
      assertFalse(regexp4.equals((Object)regexp2));
      assertFalse(regexp4.equals((Object)regexp0));
      
      regexpArray0[4] = regexp4;
      Regexp regexp5 = new Regexp(regexp3);
      assertNotNull(regexp5);
      assertFalse(regexp3.equals((Object)regexp1));
      assertFalse(regexp3.equals((Object)regexp2));
      assertFalse(regexp3.equals((Object)regexp0));
      assertFalse(regexp3.equals((Object)regexp4));
      assertTrue(regexp5.equals((Object)regexp3));
      assertFalse(regexp5.equals((Object)regexp2));
      assertFalse(regexp5.equals((Object)regexp0));
      assertFalse(regexp5.equals((Object)regexp1));
      assertFalse(regexp5.equals((Object)regexp4));
      
      regexpArray0[5] = regexp5;
      try { 
        Parser.parse("m!\u0003T)MH3Iv=cuy", 12);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{[$]", 1344);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Regexp regexp0 = Parser.parse("AQj{!$sO&fT1", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Regexp regexp0 = Parser.parse("P{7Pe", (-39));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[7];
      int int0 = 64;
      try { 
        Parser.parse("(?U|", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?U|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S*I@NapORg|gmV5", 1757);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        Parser.parse("=8x(,2W;[-8_4=tDiGq", 85);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-8_4=tDiGq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Regexp regexp0 = Parser.parse("A|A`Z", 92);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^<00-x{1$FFFF}]", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        Parser.parse("[<00-x{1AFFF4", (-2824));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[<00-x{1AFFF4`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[z\u0000-{10icFF]", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Axj{!$sO&fT1", 60);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0005B", (-10828));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      try { 
        Parser.parse("\"}[-", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Regexp regexp0 = Parser.parse("U@n68TOUD{4,57", 65);
      assertNotNull(regexp0);
      
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 962, 962);
      assertNotSame(regexpArray0, regexpArray1);
      assertNotSame(regexpArray1, regexpArray0);
      assertNotNull(regexpArray1);
      assertFalse(regexpArray1.equals((Object)regexpArray0));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Parser parser0 = new Parser("071^w;Gc4B.R0", 62);
      assertNotNull(parser0);
      
      Regexp regexp0 = Parser.parse("071^w;Gc4B.R0", 3);
      assertNotNull(regexp0);
      
      int int0 = 2605;
      Regexp regexp1 = Parser.parse("^x00-x{10FFFF}", 2605);
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      Regexp regexp2 = Parser.parse("o>'73_M+TxXY_>x!<@", 62);
      assertNotSame(regexp2, regexp1);
      assertNotSame(regexp2, regexp0);
      assertNotNull(regexp2);
      assertFalse(regexp2.equals((Object)regexp1));
      assertFalse(regexp2.equals((Object)regexp0));
      
      Regexp regexp3 = Parser.parse("wUF%`Bemb8q82)A", 62);
      assertNotSame(regexp3, regexp1);
      assertNotSame(regexp3, regexp0);
      assertNotSame(regexp3, regexp2);
      assertNotNull(regexp3);
      assertFalse(regexp3.equals((Object)regexp1));
      assertFalse(regexp3.equals((Object)regexp0));
      assertFalse(regexp3.equals((Object)regexp2));
      
      int int1 = (-4696);
      try { 
        Parser.parse("wUF%`Bemb8q82)A", (-4696));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Regexp regexp0 = Parser.parse("1aO<i-Q^$;beN~|1V<J", 2649);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Regexp regexp0 = Parser.parse("R;\"*A", 8153);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse("R;\"*A", 66639);
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 73);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int int0 = 2;
      Parser parser0 = new Parser("?XOnq", 2);
      assertNotNull(parser0);
      
      Regexp[] regexpArray0 = new Regexp[3];
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      assertNotNull(regexp0);
      
      Regexp regexp1 = new Regexp(regexp0);
      assertNotNull(regexp1);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexpArray0[0] = regexp1;
      Regexp regexp2 = new Regexp(regexp0);
      assertNotNull(regexp2);
      assertTrue(regexp0.equals((Object)regexp1));
      assertTrue(regexp2.equals((Object)regexp0));
      assertTrue(regexp2.equals((Object)regexp1));
      
      regexpArray0[1] = regexp2;
      int int1 = 4145;
      try { 
        Parser.parse("[:-", 4145);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      int int0 = 5105;
      String string0 = "(?-)i$|";
      try { 
        Parser.parse("(?-)i$|", 5105);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?-)`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }
}