/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:39:14 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.PrintStream;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 47);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 47. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
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
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      PrintStream printStream0 = jVCParserTokenManager0.debugStream;
      jVCParserTokenManager0.setDebugStream(printStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.jjFillToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e+'T9G");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("", token0.toString());
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e+'T9G");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      stringReader0.read();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 0);
      JVCParserTokenManager jVCParserTokenManager2 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager1.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '^';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 16);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 16. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e+'T9G");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(4, token0.endColumn);
      assertEquals(4, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e+'T9G");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.getNextToken();
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.endLine);
      assertEquals(1, token1.beginLine);
      assertEquals("'", token1.toString());
      assertEquals(3, token1.beginColumn);
      assertEquals(3, token1.endColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '\u008A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.endLine);
      assertEquals(2, token1.endColumn);
      assertEquals("\u008A", token1.toString());
      assertEquals(1, token1.beginLine);
      assertEquals(2, token1.beginColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "I");
      char[] charArray0 = new char[4];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '[';
      charArray0[1] = '[';
      charArray0[2] = '[';
      charArray0[3] = '[';
      charArray0[4] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e+'T9G");
      char[] charArray0 = new char[11];
      charArray0[0] = 'v';
      charArray0[1] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '\u008A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '[';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      charArrayReader1.markSupported();
      BufferedReader bufferedReader1 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream1, 1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '\u008A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.markSupported();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 2, 2);
      charArrayReader0.reset();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.getNextToken();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)10, (byte)60, 45);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.jjFillToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 2254);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2254. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }
}