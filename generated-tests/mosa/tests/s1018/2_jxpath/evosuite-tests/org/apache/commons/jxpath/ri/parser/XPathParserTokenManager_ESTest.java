/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:21:06 GMT 2018
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.DataInputStream;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.StringReader;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
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
      XPathParserTokenManager xPathParserTokenManager0 = null;
      try {
        xPathParserTokenManager0 = new XPathParserTokenManager((SimpleCharStream) null, (-2048));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2048. State unchanged.
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XPathParserTokenManager xPathParserTokenManager0 = null;
      try {
        xPathParserTokenManager0 = new XPathParserTokenManager((SimpleCharStream) null, 3);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 3. State unchanged.
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(pipedInputStream0, 101, 101);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">=");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'T';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"descendant::\"");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'E';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y^");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'N';
      charArray0[0] = 'N';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'c';
      charArray0[0] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<oy^");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'b';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      charArray0[1] = '-';
      charArray0[2] = '-';
      charArray0[0] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'P';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'Y';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'W';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '\'';
      charArray0[2] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)106, (byte)123, (-4063));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = 'X';
      charArray0[0] = 'X';
      charArray0[3] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      boolean boolean0 = org.apache.commons.jxpath.ri.parser.SimpleCharStream.staticFlag;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'c';
      charArray0[1] = 'c';
      charArray0[2] = '4';
      charArray0[3] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'S';
      charArray0[1] = 'S';
      charArray0[2] = 'S';
      charArray0[3] = 'S';
      charArray0[4] = 'S';
      charArray0[5] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'O';
      charArray0[1] = 'O';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream2 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '<';
      charArray0[0] = '<';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("LjgSf/4'bVpn&");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 5, 5);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      charArrayReader1.read(charArray0, 0, 0);
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray0);
      char[] charArray1 = new char[5];
      charArray1[0] = '4';
      charArray1[1] = 'H';
      charArray1[2] = 'u';
      charArray1[3] = '\"';
      charArray1[4] = 'f';
      CharArrayReader charArrayReader3 = new CharArrayReader(charArray1);
      CharArrayReader charArrayReader4 = new CharArrayReader(charArray1, 0, 27);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader4);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      charArrayReader0.skip((-1));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)113;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)113, (byte)113, (-3914));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)113;
      byteArray0[1] = (byte)113;
      byteArray0[2] = (byte)113;
      byteArray0[3] = (byte) (-108);
      byteArray0[4] = (byte)113;
      byteArray0[5] = (byte)113;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)113, 3645, (-3517));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)106;
      byteArray0[2] = (byte)106;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)3, 1666, (byte)106);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'B';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'c';
      charArray0[0] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)54;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)54, (byte)54, 5);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      StringReader stringReader0 = new StringReader("6vC~b$8]IS0r");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 5, (-1434));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)44;
      byteArray0[1] = (byte)44;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, 90, 1986, (-696));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[4];
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      StringReader stringReader0 = new StringReader("K>VPwrO D+IQ9mVE\"c");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, (-1005), 90);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/!\u0006d+SJE4gSbX?v[");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, (-3511), (-3511));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'N';
      charArray0[0] = 'N';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)48;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, 78, (byte)116, (-1613));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      charArray0[1] = '1';
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)115;
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte)94;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)94, (-1313), 14);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '-';
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)115;
      byteArray0[1] = (byte)115;
      byteArray0[2] = (byte)94;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream1, (byte)0, (byte)115, (-1595));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'I';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("c*");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, (-1), (-819));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '\'';
      charArray0[2] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StringReader stringReader0 = new StringReader("uVTbw2[54Osk");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 5, '\'');
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("LjgSf/4'bVpn&");
      char[] charArray0 = new char[3];
      charArray0[0] = '0';
      charArray0[1] = '0';
      charArray0[2] = '#';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte)115;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(dataInputStream0, (byte)101, 123, (byte)101);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)64;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (-3517), 112, 4);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      charArrayReader1.read(charArray0, 0, 0);
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)107;
      byteArray0[1] = (byte) (-119);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)14;
      byteArray0[4] = (byte)108;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)108, 11, (byte)108);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)101;
      char[] charArray0 = new char[3];
      charArray0[0] = '3';
      charArray0[1] = '1';
      charArray0[2] = '0';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'S';
      charArray0[1] = 'S';
      charArray0[2] = 'S';
      charArray0[3] = 'S';
      charArray0[4] = 'S';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      char[] charArray1 = new char[6];
      charArray1[0] = 'x';
      charArray1[1] = 'S';
      charArray1[2] = '(';
      charArray1[3] = '(';
      charArray1[4] = 'S';
      charArray1[5] = 'S';
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray1);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader1);
      charArrayReader1.mark((-1));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{;3ivNs}0RSh");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, (-1374), 5);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      char[] charArray0 = new char[6];
      charArray0[0] = '=';
      charArray0[1] = '!';
      charArray0[2] = '\\';
      charArray0[3] = '3';
      charArray0[4] = ',';
      charArray0[5] = ',';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[37];
      charArray0[0] = 'f';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = '?';
      charArray0[0] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '\\';
      charArray0[1] = ']';
      charArray0[2] = 'Z';
      charArray0[3] = 'Q';
      charArray0[4] = ' ';
      charArray0[5] = ':';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte)108;
      byteArray0[2] = (byte)108;
      byteArray0[3] = (byte)122;
      byteArray0[4] = (byte)108;
      byteArray0[5] = (byte)108;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)122, (byte)108, (byte)108);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'c';
      charArray0[0] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)54;
      byteArray0[1] = (byte) (-18);
      byteArray0[2] = (byte)99;
      byteArray0[4] = (byte) (-18);
      byteArray0[6] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (-1974), (byte)0, (-32));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'C';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)101;
      StringReader stringReader0 = new StringReader("{;3ivNs}0RSh");
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0, 5, (byte)101);
      simpleCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'W';
      char[] charArray1 = new char[9];
      charArray1[0] = 'B';
      charArray1[1] = 'W';
      charArray1[2] = 'W';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray1);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray1);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)82;
      byteArray0[1] = (byte) (-59);
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte)111;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)82, 702, 1073741824);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'S';
      charArray0[1] = 'S';
      charArray0[2] = 'S';
      charArray0[3] = 'S';
      charArray0[4] = 'S';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      char[] charArray1 = new char[6];
      charArray1[0] = 'x';
      charArray1[1] = 'S';
      charArray1[2] = '(';
      charArray1[3] = '(';
      charArray1[4] = 'S';
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)50;
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte)55;
      byteArray0[4] = (byte) (-47);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, (byte)7, (-26), 73);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      boolean boolean0 = org.apache.commons.jxpath.ri.parser.SimpleCharStream.staticFlag;
      char[] charArray0 = new char[2];
      charArray0[0] = 'G';
      charArray0[1] = 'G';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'F';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      char[] charArray0 = new char[6];
      charArray0[0] = 'r';
      charArray0[1] = 'r';
      charArray0[2] = 'q';
      charArray0[3] = 'r';
      charArray0[4] = 'q';
      charArray0[5] = 'q';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'S';
      charArray0[1] = 'S';
      charArray0[2] = 'S';
      charArray0[3] = 'S';
      StringReader stringReader0 = new StringReader("D+)>Ba");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)101;
      byteArray0[2] = (byte)115;
      char[] charArray0 = new char[3];
      charArray0[0] = '#';
      charArray0[1] = '1';
      charArray0[2] = '0';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-=Bwb/5_R7zml#Cro");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y^");
      char[] charArray0 = new char[7];
      charArray0[0] = 'p';
      charArray0[1] = '`';
      charArray0[2] = 'v';
      charArray0[3] = '6';
      charArray0[4] = '\'';
      charArray0[5] = '?';
      charArray0[6] = 'I';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '1';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      StringReader stringReader0 = new StringReader("-i6-$");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'b';
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)122;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(byteArrayInputStream0, 10, 10, (byte)122);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ZJjM`k#7)sXc");
      stringReader0.reset();
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream0 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
      org.apache.commons.jxpath.ri.parser.SimpleCharStream simpleCharStream1 = new org.apache.commons.jxpath.ri.parser.SimpleCharStream(stringReader0);
  }
}