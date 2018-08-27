/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 20:11:09 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 0);
      jVCParserTokenManager0.defaultLexState = (-1438);
      jVCParserTokenManager0.curLexState = 0;
      jVCParserTokenManager0.input_stream = null;
      PrintStream printStream0 = jVCParserTokenManager0.debugStream;
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0);
      Locale locale0 = new Locale("\n", "W5gEA{-9Ry}_,u");
      mockPrintStream0.printf(locale0, "S.dx&2swe", (Object[]) jVCParserTokenManager0.lexStateNames);
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
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '4';
      charArray0[1] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 55);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 55. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginLine);
      assertEquals(6, token0.kind);
      assertEquals(1, token0.endLine);
      assertEquals("\n", token0.toString());
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[10];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      charArray0[2] = 's';
      charArray0[3] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals("X", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[10];
      charArray0[0] = 'X';
      charArray0[1] = '';
      charArray0[2] = 'j';
      charArray0[3] = 'c';
      charArray0[4] = 'g';
      charArray0[5] = 'G';
      charArray0[6] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      ByteArrayOutputStream byteArrayOutputStream0 = null;
      try {
        byteArrayOutputStream0 = new ByteArrayOutputStream((-694));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -694
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals("\n", token0.toString());
      assertEquals(6, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[7];
      charArray0[0] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.endLine);
      assertEquals(3, token1.endColumn);
      assertEquals(3, token1.beginColumn);
      assertEquals(1, token1.beginLine);
      assertEquals("\u0000", token1.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[7];
      charArray0[0] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curLexState = 4205;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(3, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[9];
      charArray0[1] = '';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[10];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      charArray0[2] = 'j';
      charArray0[3] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.getNextToken();
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
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals("\n", token0.toString());
      assertEquals(6, token0.kind);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte) (-80);
      byteArray0[2] = (byte)65;
      byteArray0[3] = (byte) (-100);
      byteArray0[5] = (byte)34;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)65;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 25, (byte) (-80));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\n", token0.toString());
      assertEquals((-80), token0.endColumn);
      assertEquals((-80), token0.beginColumn);
      assertEquals(6, token0.kind);
      assertEquals(25, token0.beginLine);
      assertEquals(25, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      charArray0[1] = '';
      charArray0[2] = 'j';
      charArray0[8] = 'X';
      charArray0[4] = 'j';
      charArray0[5] = '';
      charArray0[6] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      simpleCharStream0.line = (-1580);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 2);
      SimpleCharStream simpleCharStream1 = null;
      try {
        simpleCharStream1 = new SimpleCharStream(bufferedInputStream0, 1, (-4068), (-1580));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[7];
      charArray0[1] = '\u0000';
      charArray0[2] = 's';
      charArray0[3] = 'c';
      charArray0[6] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.jjmatchedKind = (-1);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager1.jjFillToken();
      assertEquals(0, token0.kind);
      assertEquals("", token0.toString());
      
      Token token1 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, token1.endLine);
      assertEquals(1, token1.endColumn);
      assertEquals(16, token1.kind);
      assertEquals(1, token1.beginLine);
      assertEquals("\u0000", token1.toString());
      assertEquals(1, token1.beginColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'X';
      charArray0[4] = '\u0088';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(5, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      charArray0[8] = 'X';
      charArray0[4] = 'y';
      charArray0[5] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3114);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 1702);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1702. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 1678, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(4, token0.beginColumn);
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1678, token1.endLine);
      assertEquals(5, token1.beginColumn);
      assertEquals(5, token1.endColumn);
      assertEquals(16, token1.kind);
      assertEquals(1678, token1.beginLine);
      assertEquals("\u0000", token1.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      charArray0[8] = 'X';
      charArray0[4] = 'y';
      charArray0[5] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3114);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.ReInit(simpleCharStream0);
      jVCParserTokenManager1.ReInit(simpleCharStream0);
      assertEquals(4, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      char[] charArray0 = new char[5];
      charArray0[0] = 'X';
      charArray0[1] = '\u0088';
      charArray0[2] = 'X';
      charArray0[3] = '\u0088';
      charArray0[4] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.jjnewStateCnt = 92;
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(5, token1.endColumn);
      assertEquals(4, token1.endLine);
      assertEquals(5, token1.beginColumn);
      assertEquals(4, token1.beginLine);
      assertEquals("\u0088", token1.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[12];
      charArray0[10] = '\u0088';
      charArray0[1] = '\u0088';
      charArray0[2] = '\u0088';
      charArray0[3] = '~';
      charArray0[4] = '\u0088';
      charArray0[5] = '\u0088';
      charArray0[6] = '\u0088';
      charArray0[7] = '\u0088';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 22, 11);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(12, simpleCharStream0.getColumn());
      
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(12, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals("X", token0.toString());
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\n", token0.toString());
      assertEquals(6, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[8];
      charArray0[1] = '';
      charArray0[2] = 'j';
      charArray0[4] = 'y';
      charArray0[2] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, 1, 34, 1);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[8];
      charArray0[1] = '';
      charArray0[2] = 'j';
      charArray0[4] = 'y';
      charArray0[2] = 'd';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      byte[] byteArray0 = new byte[12];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, 1, 34, 1);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(34, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      bufferedReader0.read();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '[';
      charArray0[1] = '?';
      charArray0[2] = '@';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 4, 103);
      simpleCharStream0.bufsize = 4;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 780);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 780. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '[';
      charArray0[1] = '?';
      charArray0[2] = '@';
      charArray0[3] = 'Z';
      charArray0[4] = '[';
      charArray0[5] = 'b';
      charArray0[6] = '9';
      charArray0[7] = 'Z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      BufferedReader bufferedReader1 = new BufferedReader(bufferedReader0, 1967);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager1.ReInit(simpleCharStream0, (-445));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -445. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      char[] charArray0 = new char[12];
      charArray0[10] = '\u0088';
      charArray0[1] = '\u0088';
      charArray0[2] = '\u0088';
      charArray0[3] = '~';
      charArray0[4] = '\u0088';
      charArray0[5] = '\u0088';
      charArray0[6] = '\u0088';
      charArray0[7] = '\u0088';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 22, 11);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(22, token1.endLine);
      assertEquals(22, token1.beginLine);
      assertEquals(13, token1.endColumn);
      assertEquals("\u0088", token1.toString());
      assertEquals(13, token1.beginColumn);
  }
}