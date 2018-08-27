/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:34:32 GMT 2018
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Locale;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
import org.apache.commons.jxpath.ri.parser.Token;
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
  public void test00()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathParserTokenManager xPathParserTokenManager0 = new XPathParserTokenManager((org.apache.commons.jxpath.ri.parser.SimpleCharStream) null);
      xPathParserTokenManager0.ReInit((org.apache.commons.jxpath.ri.parser.SimpleCharStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(xPathParserTokenManager0.debugStream, false);
      Locale locale0 = Locale.GERMAN;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "", (Object[]) xPathParserTokenManager0.lexStateNames);
      xPathParserTokenManager0.setDebugStream(printStream0);
      assertSame(mockPrintStream0, printStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-127);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2, (byte) (-127));
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '2';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)119;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 3, 78);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'I';
      charArray0[1] = 'I';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)89;
      byteArray0[1] = (byte)19;
      byteArray0[2] = (byte)48;
      byteArray0[3] = (byte)48;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)19, 58);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'b';
      charArray0[1] = 'b';
      charArray0[2] = 'b';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '<';
      charArray0[1] = '<';
      charArray0[2] = '6';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-118);
      byteArray0[0] = (byte)62;
      byteArray0[2] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)62);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)16;
      char[] charArray0 = new char[2];
      charArray0[0] = 't';
      charArray0[1] = 't';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '1';
      charArray0[1] = '1';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)96;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)96, (byte)96);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'M';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte) (-114);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 8, (byte)48);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte) (-76);
      byteArray0[3] = (byte) (-36);
      byteArray0[5] = (byte)16;
      byteArray0[6] = (byte) (-76);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)47, (byte)47);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'O';
      charArray0[1] = 'j';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 43, 64);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)109;
      byteArray0[1] = (byte)73;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)109, (byte)109);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)72;
      byteArray0[1] = (byte)124;
      byteArray0[2] = (byte)72;
      byteArray0[3] = (byte)124;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 114, (byte)124);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'R';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)109;
      byteArray0[1] = (byte)73;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)109, (byte)109);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?h*2U.)");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ',';
      charArray0[1] = ',';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '#';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-127);
      byteArray0[0] = (byte)78;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)78, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '(';
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte)70;
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)124;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      StringReader stringReader0 = new StringReader(".");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      BufferedReader bufferedReader0 = new BufferedReader(pushbackReader0, (byte)124);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 20, (byte)40);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'n';
      charArray0[1] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'd';
      charArray0[1] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("namespace-uri");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'c';
      charArray0[1] = 'g';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.read();
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ej0Iq");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '&';
      charArray0[1] = 'u';
      charArray0[2] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("//");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, (byte)106);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1566), (byte)106);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)70;
      char[] charArray0 = new char[1];
      charArray0[0] = 'G';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      BufferedReader bufferedReader1 = new BufferedReader(bufferedReader0, (byte)70);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 327, 327);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '[';
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)107;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)16, 1932);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ' ';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ',';
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)108;
      byteArray0[2] = (byte)121;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)108, (-2058));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)102;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 8, (byte)48);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[15];
      charArray0[0] = '7';
      charArray0[1] = '7';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      BufferedReader bufferedReader1 = new BufferedReader(bufferedReader0, 27);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader1, 25, 25);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6{Y\"QVS");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, (byte)124);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (byte)124, (-1293));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'U';
      charArray0[1] = ',';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '\'';
      charArray0[1] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)70;
      char[] charArray0 = new char[9];
      charArray0[0] = ']';
      charArray0[1] = ')';
      charArray0[2] = ']';
      charArray0[3] = '^';
      charArray0[4] = '^';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'Q';
      charArray0[1] = 'X';
      charArray0[2] = 'b';
      charArray0[3] = 'K';
      charArray0[4] = 'Q';
      charArray0[5] = 'K';
      charArray0[6] = 'C';
      charArray0[2] = 'Q';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      BufferedReader bufferedReader1 = new BufferedReader(charArrayReader0, 2099);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0, 549, 3103);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      char[] charArray0 = new char[7];
      charArray0[0] = '4';
      charArray0[1] = 'h';
      charArray0[2] = '_';
      charArray0[3] = 'r';
      charArray0[4] = 'V';
      charArray0[5] = 'w';
      charArray0[6] = 'I';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0, 63);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0, 63, 63);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '[';
      charArray0[2] = 't';
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'Z';
      charArray0[1] = 'K';
      charArray0[2] = 'E';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'i';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 654);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0, 76, 220);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'V';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ej0Iq");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)57;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0, (byte)59, (-113));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[8];
      charArray0[0] = 'v';
      charArray0[1] = 'v';
      charArray0[2] = 'v';
      charArray0[3] = 'v';
      charArray0[4] = 'v';
      charArray0[5] = 'v';
      charArray0[6] = 'v';
      charArray0[7] = 'v';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '0';
      charArray0[1] = '0';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '+';
      charArray0[1] = '+';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'u';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)124;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      StringReader stringReader0 = new StringReader("Sp");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      BufferedReader bufferedReader0 = new BufferedReader(pushbackReader0, (byte)124);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 20, (byte)40);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)106;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)106, (-1332));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'S';
      charArray0[1] = '!';
      charArray0[2] = '_';
      charArray0[3] = '\'';
      charArray0[4] = ']';
      charArray0[5] = '_';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)108;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6{Y\"QVS");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, (byte)124);
      char[] charArray0 = new char[1];
      charArray0[0] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'E';
      charArray0[1] = 'Z';
      charArray0[2] = 'Z';
      charArray0[4] = 'N';
      charArray0[5] = 'E';
      charArray0[6] = 'N';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 11, 103);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      char[] charArray0 = new char[1];
      charArray0[0] = '@';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = "8P~%R";
      StringReader stringReader0 = new StringReader("8P~%R");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(bufferedReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(lineNumberReader0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      charArray0[1] = '-';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)16;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (-1066), 3);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"child::\"");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2742, 2742);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ej0Iq");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)57;
      byteArray0[1] = (byte) (-112);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)59, (-113));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte)16;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte)16;
      byteArray0[6] = (byte)16;
      byteArray0[7] = (byte)15;
      byteArray0[8] = (byte)16;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)42, 1196);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2752);
      char[] charArray0 = new char[8];
      charArray0[0] = '_';
      charArray0[2] = '0';
      charArray0[4] = 'A';
      charArray0[5] = 'y';
      charArray0[6] = 'g';
      charArray0[7] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)115;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)115, (-1332));
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '5';
      charArray0[1] = '[';
      charArray0[2] = '[';
      charArray0[3] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)16;
      char[] charArray0 = new char[6];
      charArray0[0] = '.';
      charArray0[1] = ';';
      charArray0[2] = '\'';
      charArray0[3] = '^';
      charArray0[4] = '\'';
      charArray0[5] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'K';
      charArray0[1] = 'K';
      charArray0[2] = 'K';
      charArray0[4] = 'N';
      charArray0[5] = 'E';
      charArray0[6] = 'N';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'Sp3|GK>u\"F//mvO");
      int int0 = 2742;
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 193);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0, 193, 193);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ej0Iq");
      char[] charArray0 = new char[2];
      charArray0[0] = '3';
      charArray0[1] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      char[] charArray0 = new char[6];
      charArray0[0] = '3';
      charArray0[1] = '.';
      charArray0[2] = '5';
      charArray0[3] = '^';
      charArray0[4] = 'V';
      charArray0[5] = 'o';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'c';
      charArray0[1] = 'u';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '4';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 102, 126);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'c';
      charArray0[1] = 'g';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.ready();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)67;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte) (-126);
      byteArray0[5] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)2, (byte)2);
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayInputStream0, charsetDecoder0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(inputStreamReader0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y|JnD,0-X6ha6PbhJ");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2742);
      char[] charArray0 = new char[6];
      charArray0[0] = '3';
      charArray0[1] = '.';
      charArray0[2] = '5';
      charArray0[3] = '^';
      charArray0[4] = 'V';
      charArray0[5] = 'o';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'n';
      StringReader stringReader0 = new StringReader("node");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)99;
      char[] charArray0 = new char[7];
      charArray0[0] = 'n';
      charArray0[1] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      StringReader stringReader0 = new StringReader("node");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }
}