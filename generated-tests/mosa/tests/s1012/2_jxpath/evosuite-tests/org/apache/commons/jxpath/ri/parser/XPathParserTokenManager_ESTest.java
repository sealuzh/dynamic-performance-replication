/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:32:34 GMT 2018
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
import org.apache.commons.jxpath.ri.parser.Token;
import org.apache.commons.jxpath.ri.parser.XPathParserTokenManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      PipedReader pipedReader0 = new PipedReader();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedReader0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L.R1@m#t'HE#TBp6WcV");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '#';
      charArray0[1] = 'T';
      charArray0[1] = 'f';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'w';
      charArray0[1] = 'w';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"div\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '2';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '2';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[19];
      charArray0[0] = '2';
      charArray0[1] = '2';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("div");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("id");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'k';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)56;
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 35);
      Charset charset0 = Charset.defaultCharset();
      charset0.newDecoder();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("substring");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'f';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char[] charArray0 = new char[1];
      charArray0[0] = '_';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'g';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("r[TiQb]iPj.#j");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'b';
      charArray0[1] = 'b';
      charArray0[2] = 'b';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      simpleCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '^';
      charArray0[1] = '[';
      charArray0[2] = 'M';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '!';
      charArray0[1] = 'a';
      charArray0[2] = 'L';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '/';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '/';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[5];
      charArray0[0] = 'W';
      charArray0[1] = 'g';
      charArray0[2] = 'g';
      charArray0[3] = 'A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char[] charArray0 = new char[4];
      charArray0[0] = 'G';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'v';
      charArray0[1] = 'f';
      charArray0[2] = 'f';
      charArray0[3] = 'v';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader(". State unchanged.");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ". State unchanged.");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UPmUTM1");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'O';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'i';
      charArray0[1] = 'i';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("QhiWt,-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)35;
      char[] charArray0 = new char[3];
      charArray0[0] = 'e';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`h, N@]T{3NsK}zKJN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)23;
      char[] charArray0 = new char[5];
      charArray0[0] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("T9v'`]Q+a]^");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '2';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StringReader stringReader0 = new StringReader("x4Y]U4`]{");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '@';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V\u0003kz#KJ");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)23;
      byteArray0[2] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)23);
      char[] charArray0 = new char[8];
      charArray0[0] = 'a';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[17];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      charArray0[0] = '4';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)35;
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      StringReader stringReader0 = new StringReader("d<");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[12];
      charArray0[0] = '\'';
      charArray0[2] = '#';
      charArray0[3] = '#';
      charArray0[4] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6<x@y");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.prevCharIsLF = true;
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 35);
      char[] charArray0 = new char[3];
      charArray0[0] = '6';
      charArray0[1] = '.';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)24;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char[] charArray0 = new char[4];
      charArray0[0] = '$';
      charArray0[1] = 'M';
      charArray0[2] = '9';
      charArray0[3] = 'x';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("last");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)35;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      StringReader stringReader0 = new StringReader("d<");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '5';
      char[] charArray1 = new char[6];
      charArray1[0] = '5';
      charArray1[3] = '.';
      charArray1[2] = '.';
      charArray1[3] = '.';
      charArray1[4] = '$';
      charArray1[5] = '5';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader2, 121, (-1526));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("m5G9QdGS16?$f|U[`}D");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)35;
      StringReader stringReader0 = new StringReader("d<");
      StringReader stringReader1 = new StringReader("uXn-C;");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '3';
      charArray0[1] = 'D';
      charArray0[2] = 'D';
      charArray0[3] = 'D';
      charArray0[4] = 'D';
      charArray0[5] = 'D';
      charArray0[6] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'i';
      charArray0[1] = '=';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(lineNumberReader0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '1';
      charArray0[1] = 'X';
      charArray0[2] = '.';
      charArray0[3] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("QhiWt,-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BbfDj~)");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6)@p");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "fBtw}sYN");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jd");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      charArray0[1] = '.';
      StringReader stringReader0 = new StringReader("LQ:F*wi;yxK8nV$@");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)35;
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 35);
      char[] charArray0 = new char[7];
      charArray0[0] = '6';
      charArray0[1] = '6';
      charArray0[2] = '6';
      charArray0[3] = '6';
      charArray0[4] = '6';
      charArray0[5] = '6';
      charArray0[6] = '6';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StringReader stringReader0 = new StringReader("&=Tq*F&jP50h$Qzz\"jw");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("c>V|>&`S88^");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KV9]mp");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      char[] charArray0 = new char[9];
      charArray0[0] = '0';
      charArray0[1] = 'v';
      charArray0[2] = 'Y';
      charArray0[3] = 'M';
      charArray0[4] = '6';
      charArray0[5] = '?';
      charArray0[6] = '.';
      charArray0[7] = '%';
      charArray0[8] = '+';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      StringReader stringReader0 = new StringReader(" {=j*vlO}@6elo");
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-465), 107, 97);
      int int0 = (-4653);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0, 79, (-4653));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte)6;
      byteArray0[3] = (byte)124;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("I*YVC+_sS");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '/';
      charArray0[1] = '/';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'C';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("o4]U4`]{");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'q';
      charArray0[1] = ',';
      charArray0[2] = 'k';
      charArray0[1] = 'k';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      PushbackReader pushbackReader0 = new PushbackReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackReader0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)35;
      char[] charArray0 = new char[6];
      charArray0[0] = '\u0085';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StringReader stringReader0 = new StringReader("substig");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '+';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StringReader stringReader0 = new StringReader("yDycc");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StringReader stringReader0 = new StringReader("c>V|>&`S88^");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '|';
      charArray0[1] = '|';
      charArray0[3] = '|';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z+MaQ.t(QhF=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mod");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mod");
      StringReader stringReader1 = new StringReader("\"ancestor-or-self::\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader1);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      StringReader stringReader0 = new StringReader("NYsdSV9'!E[>6R$");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[1];
      charArray0[0] = 'O';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 35);
      char[] charArray0 = new char[7];
      charArray0[0] = 'R';
      charArray0[1] = 'D';
      charArray0[2] = ' ';
      charArray0[3] = '{';
      charArray0[4] = '6';
      charArray0[5] = 'L';
      charArray0[6] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, (byte)23, (byte)23, (byte)23);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)23;
      byteArray0[2] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)23);
      char[] charArray0 = new char[8];
      charArray0[0] = 'a';
      charArray0[1] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)23;
      byteArray0[2] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)23);
      char[] charArray0 = new char[8];
      charArray0[0] = 'a';
      charArray0[1] = 'n';
      charArray0[2] = '\u0083';
      charArray0[3] = '\u0083';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'P';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '7';
      charArray0[1] = 'H';
      charArray0[2] = '.';
      charArray0[3] = '4';
      charArray0[4] = 'g';
      charArray0[5] = '1';
      charArray0[6] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '~';
      charArray0[1] = 'L';
      charArray0[2] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte) (-93);
      byteArray0[2] = (byte) (-69);
      byteArray0[3] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      InputStreamReader inputStreamReader0 = new InputStreamReader(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(inputStreamReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(inputStreamReader0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)23;
      byteArray0[2] = (byte)23;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)23);
      char[] charArray0 = new char[8];
      charArray0[0] = 'a';
      charArray0[1] = 'n';
      charArray0[2] = 'n';
      charArray0[3] = 'n';
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'p';
      charArray0[1] = 'p';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
  }
}
