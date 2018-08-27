/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:46:38 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedReader0, 0, 0);
      simpleCharStream0.ReInit((Reader) pipedReader0, 0, (-1));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      simpleCharStream0.bufpos = simpleCharStream0.bufpos;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-402), 1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockFile mockFile0 = new MockFile("[[!");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockFile0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals((-402), token0.endLine);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-422), (-422), 30);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("N", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals((-422), token0.endColumn);
      assertEquals((-422), token0.endLine);
      assertEquals((-422), token0.beginColumn);
      assertEquals((-422), token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\u0004DIIa$Q X15ZYBEh");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2304), 801);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(801);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 801. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 3672, 21);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      PipedWriter pipedWriter0 = null;
      try {
        pipedWriter0 = new PipedWriter((PipedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-929), 30, 14);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 105);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 105. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\u0004DIIa$Q X15ZYBEh");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2304), 801);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      stringReader0.read();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-2304));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2304. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 71, 21);
      int int0 = 2;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      stringReader0.markSupported();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curLexState = (-1101);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(23);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 23. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_EXPR2");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 71, 2332);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleCharStream0.inBuf = 2378;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(23);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 23. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 1455, 14);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals((-1101), token0.endLine);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 71, 71);
      int int0 = 2;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(71);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 71. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_EXPR2");
      int int0 = (-1101);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 65, 2350);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      PipedWriter pipedWriter0 = new PipedWriter();
      jVCParserTokenManager0.getNextToken();
      PipedReader pipedReader0 = new PipedReader(2);
      SimpleCharStream simpleCharStream1 = null;
      try {
        simpleCharStream1 = new SimpleCharStream(pipedReader0, (-1101), (-4126), (-4126));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = "[-";
      StringReader stringReader0 = new StringReader("[-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 3672, 21);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      stringReader0.markSupported();
      jVCParserTokenManager0.getNextToken();
      PipedWriter pipedWriter0 = null;
      try {
        pipedWriter0 = new PipedWriter((PipedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[C[");
      int int0 = 30;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-402), (-402), 30);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream((InputStream) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[l");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 59, 21);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      stringReader0.markSupported();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curLexState = (-1101);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H9TBusEL>!#Ulh4");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 71, 71, 21);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 0);
      stringReader0.markSupported();
      jVCParserTokenManager1.getNextToken();
      JVCParserTokenManager jVCParserTokenManager2 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager1.SwitchTo(71);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 71. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_EXPR2");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1101), 71, 2332);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      simpleCharStream0.inBuf = 2378;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0, 2378, 0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream1);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      PipedWriter pipedWriter0 = new PipedWriter();
      jVCParserTokenManager1.getNextToken();
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      PipedWriter pipedWriter1 = new PipedWriter();
      jVCParserTokenManager0.getNextToken();
      PipedReader pipedReader0 = new PipedReader(2378);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JVCParserTokenManager jVCParserTokenManager2 = new JVCParserTokenManager(simpleCharStream1, 1);
      jVCParserTokenManager2.SwitchTo(0);
      MockFile mockFile0 = new MockFile("*A", "\u0000");
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager2.getNextToken();
      assertEquals(1, simpleCharStream1.bufpos);
      
      jVCParserTokenManager0.jjFillToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"\u0004DIIa$Q X15ZYBEh");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2304), 22);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      stringReader0.read();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-2304));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2304. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"4DII$Q X5ZYBEh");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2304), 22);
      simpleCharStream0.backup(22);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      stringReader0.read();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      jVCParserTokenManager0.SwitchTo(0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(16);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 16. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }
}