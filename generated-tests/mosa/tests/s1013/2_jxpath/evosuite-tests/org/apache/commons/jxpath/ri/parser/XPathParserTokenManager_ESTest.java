/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:38:15 GMT 2018
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.LineNumberReader;
import java.io.ObjectStreamConstants;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Locale;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
import org.apache.commons.jxpath.ri.parser.XPathParserTokenManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XPathParserTokenManager_ESTest extends XPathParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      XPathParserTokenManager xPathParserTokenManager0 = null;
      try {
        xPathParserTokenManager0 = new XPathParserTokenManager((SimpleCharStream) null, (-873));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -873. State unchanged.
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{6n{Xb).Z_*");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+mf %`");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uP8XFN");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      StringReader stringReader0 = new StringReader("B=xe)");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uG#");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      StringReader stringReader0 = new StringReader("do[");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancestor::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<=");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<CombiningChar>");
      int int0 = ObjectStreamConstants.baseWireHandle;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("A<,'lV|$(\"Ha'w!");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N\"<\"");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      StringReader stringReader0 = new StringReader("concat");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      StringReader stringReader0 = new StringReader("true");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0, (byte)9);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      StringReader stringReader0 = new StringReader("=xe)");
      StringReader stringReader1 = new StringReader("count");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^XJ");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"attribute::\"");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'O=2QX)'pLKy");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YK'z7N3");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'Y:TfEDZ{:");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(pushbackReader0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uK8XFN");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[5YBdmw");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<CombiningChar>");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      StringReader stringReader1 = new StringReader("following::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2rue");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = ';';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      StringReader stringReader0 = new StringReader("boolean");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte) (-29);
      char[] charArray0 = new char[6];
      charArray0[0] = 'P';
      charArray0[1] = 'K';
      charArray0[2] = '[';
      charArray0[3] = '6';
      charArray0[4] = 'K';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2rue");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(pushbackReader0);
      pushbackReader0.unread((-1));
      simpleCharStream1.FillBuff();
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0D@");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      StringReader stringReader0 = new StringReader("96mYQ;UMOFaW(");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'y';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      StringReader stringReader0 = new StringReader("96mYQ;UMOFaW(");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-18);
      char[] charArray0 = new char[2];
      charArray0[0] = 'Q';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'j';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      StringReader stringReader0 = new StringReader("number");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'S';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'H';
      charArray0[1] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("*d8A4y|*l~<-61");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&;g04)gn)6l");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'h';
      charArray0[1] = 'h';
      charArray0[2] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      StringReader stringReader0 = new StringReader("boolean");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      StringReader stringReader0 = new StringReader("comment");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '7';
      charArray0[1] = '(';
      charArray0[2] = '7';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0, (byte) (-14), '(');
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      StringReader stringReader0 = new StringReader("B=xe)");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@Xo*pO+Ng?`&Lb,.j");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      StringReader stringReader0 = new StringReader("boolean");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      stringReader0.read();
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.read();
      StringReader stringReader1 = new StringReader("HVdnCoAH_Hj\"]");
      stringReader0.read();
      stringReader1.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      StringReader stringReader0 = new StringReader("position");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 293, 1641);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      StringReader stringReader0 = new StringReader("attribute::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancestor-or-self::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R-Bas!97QaT2");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<CombiningChar>");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      StringReader stringReader0 = new StringReader("cmf %`");
      char[] charArray0 = new char[1];
      charArray0[0] = '8';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p.");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      StringReader stringReader0 = new StringReader("boolean");
      stringReader0.read();
      char[] charArray0 = new char[3];
      charArray0[0] = '.';
      charArray0[1] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0, 98, (byte)59);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p.");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kg Ia*;$TC9");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancestor-or-self::");
      char[] charArray0 = new char[2];
      charArray0[0] = 'd';
      charArray0[1] = 'e';
      stringReader0.read(charArray0);
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '1';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      StringReader stringReader0 = new StringReader("U:4$VI%");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, (-2780), (-2780));
      stringReader0.mark(13);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^XJ");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      StringReader stringReader0 = new StringReader("=xe)");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      StringReader stringReader0 = new StringReader("T9fU1_bZzSqi");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      StringReader stringReader0 = new StringReader("F");
      StringReader stringReader1 = new StringReader("child::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$MMNNkJ'UL3&,5");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+mf %`");
      StringReader stringReader1 = new StringReader("\"namespace-uri\"");
      stringReader0.read();
      stringReader1.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MQHn3PJp,.%'F4'T~");
      char[] charArray0 = new char[2];
      charArray0[0] = '/';
      charArray0[1] = '=';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      StringReader stringReader1 = new StringReader("._");
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      StringReader stringReader0 = new StringReader("=xe)");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '7';
      charArray0[1] = '.';
      charArray0[2] = '7';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0, (byte) (-14), '.');
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^XJ");
      stringReader0.read();
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<EOF>");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bolean");
      char[] charArray0 = new char[8];
      charArray0[0] = ']';
      charArray0[1] = '.';
      charArray0[2] = 'f';
      charArray0[3] = 'd';
      charArray0[4] = 'D';
      charArray0[5] = '[';
      charArray0[6] = '^';
      charArray0[7] = 'B';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v:Yg@<DAy`WaA+!");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uK8XFN");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)68;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[1] = (byte) (-55);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, 66, (byte)68, 2683);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("HD4|;f+I6$P)");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'O=2QX)'pLKy");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("ancestor::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kg Ia*;$TC9");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kg Ia*;$TC9");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'l';
      charArray0[1] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" lk#7pE-Ah^");
      StringReader stringReader1 = new StringReader(" lk#7pE-Ah^");
      stringReader1.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '*';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'S';
      StringReader stringReader0 = new StringReader("Gcq#5|nEaQ1n\"l");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 280, 2419);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancest?r::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'O=2QX)'pLKy");
      char[] charArray0 = new char[5];
      charArray0[0] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'O=2QX)'pLKy");
      char[] charArray0 = new char[5];
      charArray0[1] = '7';
      charArray0[2] = '7';
      charArray0[0] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'Z';
      charArray0[1] = '*';
      charArray0[2] = 'B';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qs;s^JbIe");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3mMfTiA9V<g");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      stringReader0.reset();
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancest?r::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`{: ");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      stringReader0.ready();
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mod");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uK8XFN");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      char[] charArray0 = new char[9];
      charArray0[0] = '-';
      charArray0[1] = 'g';
      charArray0[2] = 'h';
      charArray0[3] = 'D';
      charArray0[4] = 'c';
      charArray0[5] = 'b';
      charArray0[6] = '\u001F';
      charArray0[7] = '_';
      charArray0[8] = '*';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'O=2QX)'pLKy");
      char[] charArray0 = new char[5];
      charArray0[0] = '.';
      charArray0[1] = '/';
      charArray0[2] = '.';
      charArray0[2] = '.';
      charArray0[4] = '/';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uL8XF");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      StringReader stringReader0 = new StringReader("atPtribute::");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ancestor-or-self::");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      StringReader stringReader0 = new StringReader("anestoror-s\"lf::");
      stringReader0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`{: ");
      char[] charArray0 = new char[2];
      charArray0[0] = 'w';
      charArray0[1] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }
}