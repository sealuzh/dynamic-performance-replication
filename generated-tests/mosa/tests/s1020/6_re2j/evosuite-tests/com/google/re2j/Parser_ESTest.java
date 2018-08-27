/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:57:11 GMT 2018
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
        Parser.parse("2(V:I@y*W=|w", 3429);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `2(V:I@y*W=|w`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("REPEAT", 43702);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("]ZdT4yqy6,Rp?", 1917);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/nP:`9Hb,", (-4764));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|S*E&LWRt/V>e3#JY}'", 124);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p\ftflmysL4jk/", (-915));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p:er:]", 213);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 128);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        Parser.parse("*'nR", 48);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp regexp0 = Parser.parse("tnNS7V\".3_ihf9bqy", 128);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp regexp0 = Parser.parse("o9cz{6_&-E=Y{", 213);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp regexp0 = Parser.parse("4d\"58kS4;#<@50rjH*", 1);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp regexp0 = Parser.parse("WK|^&;-", 213);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        Parser.parse("$^qK8hf-)k7lcr-p", (-1480));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        Parser.parse("w(", 128);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `w(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Kd:Ru$2MRC9M(@)", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p\ftflmysoL4jk/", (-879));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Po!J", 116);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z", (-75));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        Parser.parse("(?(?P<", (-659));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        Parser.parse("iC(?P<", (-659));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|V8zi;.{+<A@/d:G", 7081);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse("M;CK(zmHTXj.k[IU", 240);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[IU`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:^ascii:]", 97);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp regexp0 = Parser.parse("9^392G!w", (-659));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("(?(Oi.", 41);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", (-667));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("(?i:", 85);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp regexp0 = Parser.parse("B", (-667));
      assertNotNull(regexp0);
      
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      assertNotNull(regexp1);
      
      Regexp regexp2 = Parser.parse("B", (-667));
      assertTrue(regexp2.equals((Object)regexp0));
      assertTrue(regexp2.equals((Object)regexp1));
      assertNotSame(regexp2, regexp1);
      assertNotSame(regexp2, regexp0);
      assertNotNull(regexp2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp regexp0 = Parser.parse("C", (-659));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PxV0-xon0FFFFf]", 740);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        Parser.parse("AKS%c.C[](zsHq", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[](zsHq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 213);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x|i", 1920);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        Parser.parse("%E[", 49);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse(":er:]", 2396);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("lni.W9]YRe<2_l", 73);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        Parser.parse("AKS%c.C[](zsHq", 105);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[](zsHq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S", (-659));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse(" ^6N| Doi`21d", 128);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D", 72);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse("(?", 93);
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
      try { 
        Parser.parse("o*_[I1T-Q:@AT[", 361);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `T-Q`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\f", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-3799));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\r", 3788);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Mdt'\b8,/~\"G$h_T='", (-659));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", 72);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("x", 333);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        Parser.parse("( q|co|d[NU,f%45h1+", 72);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[NU,f%45h1+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        Parser.parse("2(V:I@y*W=|", (-10792));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `2(V:I@y*W=|`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("5|9)k6{y1(;&J", 7040);
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
      Regexp regexp0 = Parser.parse("\n", (-3));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("$r$hI;Y", (-659));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      try { 
        Parser.parse("{[!nm+Sdt\u00028Nw", (-3188));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[!nm+Sdt\u00028Nw`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse(":d00-x{n0FFFFf]", 3453);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      try { 
        Parser.parse("8(qa?+#qc,grq", (-659));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `?+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 213);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Tu@\u0000Z`;~Ydg]A@8D7", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp regexp0 = Parser.parse("L0i$\u0003h<FP~C", 2969);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Regexp regexp0 = Parser.parse("bSNOLLcas[:]", 4968);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Regexp regexp0 = Parser.parse("\u0007", (-2395));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      try { 
        Parser.parse("p{h(Oi.", 213);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `p{h(Oi.`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        Parser.parse("\"[:](zHq", (-479));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `\"[:](zHq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Regexp regexp0 = Parser.parse("9QgNgxq2", 837);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[7];
      int int0 = (-1295);
      Regexp regexp0 = Parser.parse("^M1e$\u0001p", (-1295));
      assertNotNull(regexp0);
      
      regexpArray0[5] = regexp0;
      int int1 = 118;
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1295
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      try { 
        Parser.parse("8P](zDAH+?y", 997);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `8P](zDAH+?y`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Regexp regexp0 = Parser.parse("<6z", 376);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("KfwP24:%6]", 376);
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Regexp regexp0 = Parser.parse("nch]q[>-]SU", (-1600));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Regexp regexp0 = Parser.parse("cqW\"0|C`h.\"&0r1VpI", 2925);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse("missing argument to repetition operator", 2925);
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = 2925;
      String string0 = "$k8\\x\"7";
      Regexp regexp0 = Parser.parse("$k8x\"7", 2925);
      assertNotNull(regexp0);
      
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\x\"7`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:>-]SU", 1);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PP\u0003Y", 468);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Regexp regexp0 = Parser.parse("w@mR{3,vl}\"1", 2925);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Qad,t=+", (-652));
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("p", (-652));
      assertNotNull(parser0);
      
      // Undeclared exception!
      try { 
        Parser.parse((String) null, (-652));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser$StringIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{eLu@ldv", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Regexp regexp0 = Parser.parse("h\u0003,Y", 5);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      try { 
        Parser.parse("GRE;n\"HL3cs`[=udI", 80);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[=udI`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      try { 
        Parser.parse("\u0004P{h(OZ.", 1493);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `\u0004P{h(OZ.`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[-]S", 133);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("O'", 133);
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      try { 
        Parser.parse("pPP](zsHq", 993);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `pPP](zsHq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Regexp regexp0 = Parser.parse("8sD4?,y>ZA", 993);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("8sD4?,y>ZA", 993);
      assertNotNull(parser0);
      
      Regexp regexp1 = Parser.parse("8sD4?,y>ZA", 993);
      assertTrue(regexp1.equals((Object)regexp0));
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Regexp regexp0 = Parser.parse("/fUnT\u0018~\t@1W7?", 13);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:x00-x{1FFF}]", 8008);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Y", 2785);
      assertNotNull(regexp0);
      
      Parser parser0 = new Parser("Y", 2785);
      assertNotNull(parser0);
      
      Regexp regexp1 = Parser.parse("[:x00-x{10FFFF}]", 2785);
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:0-x{10FFFF}]", 1492);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p H{O(\":\u0006#)<=DX", (-1008));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{17nm+Sdt\u00028Nw", (-3188));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^pRCx00-x{10FFFF}]", 3864);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Regexp regexp0 = Parser.parse(",Jvb{1", 92);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      try { 
        Parser.parse("PL(zDHq", 997);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `PL(zDHq`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".|S3B%0yN", 1492);
      assertNotNull(regexp0);
      
      Regexp regexp1 = Parser.parse(".|S3B%0yN", (-4119));
      assertFalse(regexp1.equals((Object)regexp0));
      assertNotSame(regexp1, regexp0);
      assertNotNull(regexp1);
      
      Parser parser0 = new Parser("s", (-2101));
      assertNotNull(parser0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Regexp regexp0 = Parser.parse("$lk8xFm7", 1);
      assertNotNull(regexp0);
  }
}
