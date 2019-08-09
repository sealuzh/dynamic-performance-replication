/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 23:41:05 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
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
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)47, (byte)22);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 6);
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
      StringReader stringReader0 = new StringReader("IN?CODB");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("?", token0.toString());
      assertEquals(2, token0.beginColumn);
      assertEquals(2, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)59;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)22, 2833);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(22, token0.endLine);
      assertEquals(22, token0.beginLine);
      assertEquals(2833, token0.endColumn);
      assertEquals(";", token0.toString());
      assertEquals(2833, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, token0.endColumn);
      assertEquals("!", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals(3, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = 4;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endColumn);
      assertEquals(0, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)4, (byte)0);
      StringReader stringReader0 = new StringReader("3ZU_ [?_6@");
      simpleCharStream0.inputStream = (Reader) stringReader0;
      char[] charArray0 = new char[9];
      stringReader0.read(charArray0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(4, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals("[", token0.toString());
      assertEquals(1, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endLine);
      assertEquals("[", token0.toString());
      assertEquals(2, token0.endColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 9);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.readChar();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals("", token0.toString());
      assertEquals(1082, token0.beginLine);
      assertEquals(9, token0.endColumn);
      assertEquals(9, token0.beginColumn);
      assertEquals(1082, token0.endLine);
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 2858);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)47, (byte)22);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = 4;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 20);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 20. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BNms@P%z[nO$b_R~MQf");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1105), (-1105));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-3683));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -3683. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.inBuf = 4;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)13, (byte)0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1100, (byte) (-11), 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-11), simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(12);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 34, 12, 12);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-1), (byte)0);
      simpleCharStream0.available = (int) (byte) (-1);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1079, 1079);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.bufline = jVCParserTokenManager0.jjnewLexState;
      simpleCharStream0.backup(74);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, (-186));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -186. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 9);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(1082);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1082. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)92;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (byte)92, 33, (byte)20);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(34, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 2858);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2858, token0.beginColumn);
      assertEquals("", token0.toString());
      assertEquals(1082, token0.beginLine);
      assertEquals(1082, token0.endLine);
      assertEquals(2858, token0.endColumn);
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)22, 2833);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-2948));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2948. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-1), (byte)0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1), token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)13, (byte)0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(13, token0.endLine);
      assertEquals(0, token0.endColumn);
      assertEquals(0, token0.beginColumn);
      assertEquals(13, token0.beginLine);
      assertEquals("\r", token0.toString());
      assertEquals(6, token0.kind);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("I", token0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1079, 1079);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1080, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-11);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1100, (byte) (-11), 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-11), token0.endColumn);
      assertEquals(1100, token0.beginLine);
      assertEquals(1100, token0.endLine);
      assertEquals("\uFFFD", token0.toString());
      assertEquals((-11), token0.beginColumn);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(6, token0.kind);
      assertEquals("\n", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%?}@a,+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.endLine);
      assertEquals(2, token1.beginColumn);
      assertEquals(1, token1.beginLine);
      assertEquals("?", token1.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 2858);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2858, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)22, 2833);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2833, token0.endColumn);
      assertEquals(2833, token0.beginColumn);
      assertEquals(22, token0.endLine);
      assertEquals(22, token0.beginLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-39);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-39), (byte) (-39));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals((-39), token0.beginLine);
      assertEquals((-39), token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
      assertEquals((-39), token0.endColumn);
      assertEquals((-39), token0.endLine);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)47, (byte)4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\u0000", token0.toString());
      assertEquals(47, token0.endLine);
      assertEquals(47, token0.beginLine);
      assertEquals(4, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(4, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-9);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-9), 3, 28);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\uFFFD", token0.toString());
      assertEquals(3, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(3, token0.endColumn);
      assertEquals((-9), token0.endLine);
      assertEquals((-9), token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<END_TAG>");
      char[] charArray0 = new char[4];
      stringReader0.read(charArray0);
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, token1.endColumn);
      
      Token token2 = jVCParserTokenManager0.getNextToken();
      assertEquals(">", token2.toString());
      assertEquals(4, token2.beginColumn);
      assertEquals(1, token2.beginLine);
      assertEquals(16, token2.kind);
      assertEquals(1, token2.endLine);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(3, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<[ut}9C}s*");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]dCYXYGYg");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-24);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-24), (byte)102, 34);
      byteArrayInputStream0.read();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals(6, token0.kind);
      assertEquals(1, token0.endColumn);
      assertEquals("\r", token0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)15, (byte)15, 15);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      StringReader stringReader0 = new StringReader("_]3JB(`R");
      simpleCharStream0.ReInit((Reader) stringReader0, (int) (byte)15, 15);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(15, token0.endColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token1.endColumn);
      assertEquals("]", token1.toString());
      assertEquals(16, token1.kind);
      assertEquals(16, token1.beginColumn);
      assertEquals(15, token1.endLine);
      assertEquals(15, token1.beginLine);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals("[[==", token0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 92, (-858));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-858), simpleCharStream0.getBeginColumn());
      assertEquals(4, token0.kind);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 9);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.readChar();
      simpleCharStream0.readChar();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals("[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 9);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.readChar();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(10, simpleCharStream0.getBeginColumn());
      assertEquals(1082, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(4, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JXa1JO");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1082, 2858);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)22, 2833);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, (int) (byte)47);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 47. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }
}