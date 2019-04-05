/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:07:23 GMT 2019
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
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.getNextToken();
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, token1.endColumn);
      assertEquals(1, token1.endLine);
      assertEquals(1, token1.beginLine);
      assertEquals(3, token1.beginColumn);
      assertEquals("2", token1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G}XW(,OkMo");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup(17);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(0, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">]4YsRLiPm~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup(37);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("!-l");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup(5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endLine);
      assertEquals(0, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">]4YsRLiPm~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals(">", token0.toString());
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(3, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 3354, 3354, 93);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("[[==");
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      jVCParserTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)14, (byte)14);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, (-122), 111);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, (-1187));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1187. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 61, 61);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 148, (-1775));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 1376);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1376. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-21), (-21));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-21));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -21. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      StringReader stringReader0 = new StringReader("c`?9?*OFCD&3%hbk");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2494), (-2494));
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\\");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(1177);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1177. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte)92;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (-3646), 1459);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(1461, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)92;
      byteArray0[2] = (byte)92;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (-3646), 1459);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(4, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-21), (-21));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 8;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-21), token0.endColumn);
      assertEquals((-21), token0.endLine);
      assertEquals((-21), token0.beginLine);
      assertEquals((-21), token0.beginColumn);
      assertEquals("", token0.toString());
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("![/spE0j'%s");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-793));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -793. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 8, 8);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(9, simpleCharStream0.getBeginColumn());
      assertEquals(9, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      simpleCharStream0.backup(3);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,CN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, '\u0000');
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\\");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 10, 10);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(10, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,YCN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]a9$OWQ*RaR1 *AG");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,CN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\n");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginLine);
      assertEquals(6, token0.kind);
      assertEquals("\n", token0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals("v", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]MLS4\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals("]", token0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("'", token0.toString());
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("!-l");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vd2$0iY>:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(5, token1.endColumn);
      assertEquals(16, token1.kind);
      
      Token token2 = jVCParserTokenManager0.getNextToken();
      assertEquals("i", token2.toString());
      assertEquals(6, token2.beginColumn);
      assertEquals(1, token2.endLine);
      assertEquals(1, token2.beginLine);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(2, token0.kind);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]MLS4\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals("]", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,CN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-103);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
      assertEquals(1, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">]4YsRLiPm~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token0.beginColumn);
      assertEquals(2, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals("]", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)13);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals("\r", token0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals("[[==", token0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 29, 29);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(29, simpleCharStream0.getBeginColumn());
      assertEquals(4, token0.kind);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(4, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("![/spE0j'%s");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      simpleCharStream0.backup(2);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(3, token0.kind);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,CN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[_?4{NsjEy&+z,YCN");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }
}
