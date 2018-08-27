/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:51:53 GMT 2018
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
      Regexp regexp0 = Parser.parse("%1|ed%s]~$F]OF1s{F", (-4607));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("k9r9H%tyl%^o6:/#c", 4008);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 4008);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("I i=Bw.8/}", 2536);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      try { 
        Parser.parse("(?(?P<", 4008);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser.parse("(?-s:.)", (-295));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        Parser.parse("(CP<", 8413);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(CP<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        Parser.parse("(?i:", (-1176));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser.parse("wVi[==]$/r:f,", 45);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        Parser.parse("-J5l=)O", 2536);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Parser.parse("{AZG^[LogZxV", 32);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[LogZxV`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser.parse("com.google.re2j.Parser$Stack", 2536);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser.parse("com.google.re2j.Parser$Stack", 65373);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser.parse("x{", (-295));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser.parse("AVS?kh~UxZ", 2116);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parser.parse("e<+", 8);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        Parser.parse("(?", (-295));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parser.parse("p}*", (-1540));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parser.parse("[:s]", (-295));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser.parse("D\"yY|I", 10496);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Parser.parse("4z(YoUy^", (-2707));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `4z(YoUy^`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser.parse("9!@d,CWExo*>$CUl", (-3211));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parser.parse("k9r9H%tyl%^\u0006k6:/#c", 4988);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Parser.parse("[:4z`$", 93);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:4z`$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parser.parse("[:X]$/r:f,", 66660);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-607);
      Regexp[] regexpArray0 = new Regexp[5];
      Parser.parse("Hyphen", (-607));
      Regexp regexp0 = Parser.parse("Hyphen", (-607));
      Parser parser0 = new Parser("yn]1- dCpB4V0\u0002C ", (-607));
      Parser.parse("yn]1- dCpB4V0\u0002C ", (-607));
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = "missing argument to repetition operator";
      Parser.parse(string0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parser.parse("k9r9H%tyl%^\u0006k6:/#c", 66660);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parser.parse("p}*", 65373);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        Parser.parse("(?(?i:", 3057);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parser.parse("~v:+", (-2615));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      try { 
        Parser.parse("*b", 2560);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Parser.parse("C", 2553);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parser.parse("rSwn", (-3211));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Parser.parse("ZCdMK,v%", 9);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        Parser.parse("{6y%Yf)", 17);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse("42U\t", (-263));
      Regexp regexp1 = new Regexp(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Parser.parse("[::]", 8732);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Parser.parse("[:t:]", 2556);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Parser.parse("P", (-3211));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Parser.parse(">C}25uwHcd3", 1000);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 8413);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Parser.parse("|lyHP/S5vf7gi", (-3059));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Parser.parse("QB'<Bm/2i!,#Ps|Y?Tx", 368);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Parser.parse("PP==X]$/r:f,", (-139));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Parser.parse("{1", (-3211));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Parser.parse("P>-Q=2Q@", 2545);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        Parser.parse("<W6:Ubd |D/aFyIZR<)", 2665);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Parser.parse("[:x00-x{10FFFF}]", 85);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Parser.parse("R|Q", 2384);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Parser.parse("]{ 8m", 193);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Parser.parse("s&m&=sxGzY,zx4w\u0007", 1509);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("2Tn>wz@G[^8),k*", (-543));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^8),k*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Parser.parse("[^x00-x{10FFFF}]", 40);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        Parser.parse("ffl[SUZ~'GqtWELY", 112);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[SUZ~'GqtWELY`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = 0;
      Parser.parse("x", 0);
      String string0 = "BDXN-%";
      Parser.parse(string0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      try { 
        Parser.parse(".Uw[", 29);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Parser.parse("(K?-s:.)", (-160));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Parser.parse("fYX&R|UQH", (-295));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Parser.parse("\r", 880);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      try { 
        Parser.parse("=3xOWo!$}35Z6[^$BR.", (-4275));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[^$BR.`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Parser.parse("\u0004my!;$X^_&%?d", 128);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      try { 
        Parser.parse("J{>[]hVF$F,R.p6@", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]hVF$F,R.p6@`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = 66660;
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = "\\3{";
      Parser.parse("\u0003{", 66660);
      Parser parser0 = new Parser(string0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Parser.parse("\u0004", 85);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      try { 
        Parser.parse("??", 2404);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `??`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      try { 
        Parser.parse("NOPLRWN+*\"i)Un)]8&", 3264);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = 41;
      try { 
        Parser.parse("AOcQtIqr[LkKn-", 41);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[LkKn-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Parser parser0 = new Parser("[:-+Bp$x8Q}", 73);
      try { 
        Parser.parse("[:-+Bp$x8Q}", 124);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `:-+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Parser.parse("P}{4c7OZc\u00008chmv#%o", 2560);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      try { 
        Parser.parse("&ECSto~7[-+Bp$x8Q}", 785);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-+Bp$x8Q}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Parser.parse("i'!%F2r8", 128536);
      Parser.parse("i'!%F2r8", 128536);
      Parser parser0 = new Parser("\b", 128536);
      Parser.parse(".|{p", 128536);
      Parser.parse("i'!%F2r8", 43);
      Parser.parse("QNKX7o^d", 128536);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Parser.parse("D", (-3211));
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Parser.parse("\b", 9180);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Parser.parse("\n", 105);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Parser.parse("{12i9P&{M", 64);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Parser.parse("7bOnwMUuF8!v6Y", 1544);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Parser.parse("P{#.}?r_aR", 2545);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      try { 
        Parser.parse("P{..x)0_aR", 2545);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Parser.parse("p^alpha:]", 2545);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Parser.parse("aL2S%-4X_0R|K", 1504);
      Parser parser0 = new Parser("rb_>p5wN.s1+>", 1504);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Parser.parse("|", 64);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      try { 
        Parser.parse("&ECSto~7[-+Bp$x8Q}", 485);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-+Bp$x8Q}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Regexp regexp0 = Parser.parse("B", 8413);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 113, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = 785;
      Parser.parse(".|$B+XC", 785);
      Regexp[] regexpArray0 = null;
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, 785, 65130);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Parser.parse("\u0001", 3265);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Parser.parse("z", 497);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Parser.parse("s/am||d><i ", 797);
      Parser.parse("s/am||d><i ", 797);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Parser.parse("PP", 2532);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Parser.parse("pP{#.}?r_aR", 2545);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Parser.parse("[:x*0-x{s110FFFF}]", 120);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      try { 
        Parser.parse("\f1A?f@fT&fPzn[t", 1509);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[t`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      try { 
        Parser.parse("[:\u0000", 4304);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:\u0000`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      int int0 = 64;
      Regexp regexp0 = Parser.parse("\u0002/o0'quQd#~@,1sn><", 64);
      String string0 = "(?P<";
      Parser parser0 = new Parser(string0, int0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      try { 
        Parser.parse("[:x0x{10F}FF}v", 4304);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:x0x{10F}FF}v`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Parser.parse("3S0StjYzeII|3KX4", 4321);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp0 = Parser.parse("(?-m:$)", 2260);
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[1] = regexp2;
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexpArray0[2] = regexp3;
      Regexp regexp4 = new Regexp(regexp3);
      regexpArray0[3] = regexp4;
      Regexp regexp5 = new Regexp(regexp4);
      regexpArray0[4] = regexp5;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 97, 2260);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 97
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Parser.parse("R|Q", 97);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      String string0 = "Qhg[\\";
      try { 
        Parser.parse("Qhg[", (-1060));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Regexp regexp0 = Parser.parse("ones\"", 1644);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      Parser.subarray(regexpArray0, 1644, 1644);
  }
}