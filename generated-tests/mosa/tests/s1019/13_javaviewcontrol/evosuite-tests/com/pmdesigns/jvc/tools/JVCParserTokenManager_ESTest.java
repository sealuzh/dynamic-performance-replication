/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:29:54 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.LineNumberReader;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals("r", token0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[10];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (int) '\u0000';
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\u0000", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[5];
      charArray0[0] = '\u0083';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals("\u0083", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[3];
      charArray0[0] = '~';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.skip((byte)0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals("~", token0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 2;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '\u0083';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'l';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '\u0080';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals("\u0080", token0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'Z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      charArrayReader0.markSupported();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals("Z", token0.toString());
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, '[', '[');
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(91, token0.beginColumn);
      assertEquals("[", token0.toString());
      assertEquals(91, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(91, token0.beginLine);
      assertEquals(91, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '^';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, '^', '^');
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(16, token0.kind);
      assertEquals("^", token0.toString());
      assertEquals(94, token0.endLine);
      assertEquals(94, token0.beginLine);
      assertEquals(94, token0.endColumn);
      assertEquals(94, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '\u0083';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.skip((byte) (-84));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals("\u0083", token0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '[';
      charArray0[1] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(4);
      jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals("]", token0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '[';
      charArray0[1] = '[';
      charArray0[2] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      charArrayReader1.skip((byte) (-84));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("[[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[17];
      charArray0[0] = '[';
      charArray0[1] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      charArray0[1] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '[';
      charArray0[1] = '[';
      charArray0[2] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-634));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -634. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[17];
      charArray0[0] = ']';
      charArray0[1] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[17];
      charArray0[0] = '[';
      charArray0[1] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(4);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, "DEFAULT", (byte)10, (byte)10);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[17];
      charArray0[1] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '\u0083';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.skip((byte) (-97));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      charArrayReader0.ready();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DEFAULT");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0, (byte)11);
      char[] charArray0 = new char[3];
      charArray0[0] = '[';
      charArray0[1] = '-';
      charArray0[2] = '~';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 1086, 2503);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = ']';
      charArray0[1] = ']';
      charArray0[2] = ']';
      charArray0[3] = ']';
      charArray0[4] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, "DEFAULT", (byte)10, (byte)10);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager1.getNextToken();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      StringReader stringReader0 = new StringReader("DEFAULT");
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(3);
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte)10;
      StringReader stringReader0 = new StringReader("[[");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0, (byte)10);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(lineNumberReader0, 70, 1680);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, "DEFAULT", (byte)10, (byte)10);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 9;
      byteArrayInputStream0.close();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '[';
      charArray0[1] = '[';
      charArray0[2] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      char[] charArray1 = new char[5];
      charArray1[0] = '[';
      charArrayReader1.mark(829);
      charArrayReader1.reset();
      charArray1[1] = '[';
      charArray1[2] = '[';
      charArray1[3] = '[';
      charArray1[4] = '[';
      charArrayReader1.read(charArray1);
      charArrayReader1.skip((byte) (-84));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-84);
      byteArray0[1] = (byte) (-84);
      byteArray0[2] = (byte) (-84);
      byteArray0[3] = (byte) (-84);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.close();
      charArrayReader0.read();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(1106);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1106. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }
}