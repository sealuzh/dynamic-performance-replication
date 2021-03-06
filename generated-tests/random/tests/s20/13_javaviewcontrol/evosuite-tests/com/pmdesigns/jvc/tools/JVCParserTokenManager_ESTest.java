/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:50:35 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[I[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 16, 16, 16);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uciZ9K<iKb");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("u", token0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 24, 2305, 24);
      simpleCharStream0.ReInit((Reader) stringReader0, (-1), 2630);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
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
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(16);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.backup(16);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
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
  public void test05()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4039, (-705));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 24, 2305, 24);
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
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(39);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 10);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 10. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<START_CACHE_BLOCK>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1908874353, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1888), (-1888));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1888), simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 125, 125, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-597));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -597. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<START_CACHE_BLOCK>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1908874353, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uciZ9K<iKb");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("s");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 524, 524);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("s", token0.toString());
      assertEquals(16, token0.kind);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(524, token1.endColumn);
      assertEquals(524, token1.beginColumn);
      assertEquals("", token1.toString());
      assertEquals(524, token1.beginLine);
      assertEquals(524, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]wfTa.3");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-3214), (-3214));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("]", token0.toString());
      assertEquals((-3214), token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals((-3214), token0.beginLine);
      assertEquals((-3214), token0.beginColumn);
      assertEquals((-3214), token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\f");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals("\f", token0.toString());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":mR|m5tjgH");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2669, 282);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-109);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (int) (byte) (-25), (int) (byte) (-1), 2799);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-1), token0.beginColumn);
      assertEquals((-1), token0.endColumn);
      assertEquals((-25), token0.endLine);
      assertEquals((-25), token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[I[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 16, 16, 16);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(16, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":mR|m5tjgH");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2669, 282);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(282, token0.endColumn);
      assertEquals(282, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(2669, token0.endLine);
      assertEquals(2669, token0.beginLine);
      assertEquals(":", token0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 125, 125, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(128, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("=", token0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 16, 16, 16);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, simpleCharStream0.getBeginColumn());
      assertEquals("[[!", token0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4039, (-705));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("uciZ9K<iKb");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endColumn);
  }
}
