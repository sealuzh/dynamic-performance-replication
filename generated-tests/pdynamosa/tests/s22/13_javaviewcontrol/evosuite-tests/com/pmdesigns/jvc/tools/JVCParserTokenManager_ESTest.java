/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:02:44 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.JVCParserTokenManager");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 6);
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
      StringReader stringReader0 = new StringReader("CZ&=Nn#MT");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup(99);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.endLine);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 3);
      simpleCharStream0.backup(2);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("=", token0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 5, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (-4742), (int) (byte)35, (int) (byte)63);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z[@MY");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curLexState = 1;
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(5, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".FD()}2o");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      simpleCharStream0.backup(63);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.endLine);
      assertEquals(0, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      simpleCharStream0.backup(2);
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.endColumn);
      assertEquals(0, token0.endLine);
      assertEquals("", token0.toString());
      assertEquals(0, token0.kind);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(366);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 366, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("{k-e%V");
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.JVCParserTokenManager");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 946, (byte)87);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)0, (byte)0, (byte)0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (int) (byte) (-6));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(366);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 366, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 366);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 366. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("F9e^>n|+:-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1290), 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      assertEquals((-1290), simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2429, (-55));
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 3609);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 3609. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 1);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("F9e^>n|+:-");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1290), 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-1290), simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2429, (-53));
      simpleCharStream0.BeginToken();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-53), simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DEFAULT");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 40, 34);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
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
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2429, 0);
      simpleCharStream0.BeginToken();
      int[] intArray0 = new int[1];
      simpleCharStream0.bufline = intArray0;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
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
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_CODE");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2429, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(43);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 43. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z[@MY");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(5, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-82));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -82. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[t");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, token0.kind);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-37);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) dataInputStream0, 2433, (int) (byte)121, 2122);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2433, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",(=W<MThT");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.endColumn);
      assertEquals(",", token0.toString());
      assertEquals(0, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 616, 4430);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4430, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-78);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) dataInputStream0, (int) (byte) (-123), (int) (byte)89, 48);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(89, token0.beginColumn);
      assertEquals(89, token0.endColumn);
      assertEquals((-123), token0.beginLine);
      assertEquals("\uFFFD", token0.toString());
      assertEquals((-123), token0.endLine);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A(0x%");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 41, 41);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      byte[] byteArray0 = new byte[15];
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) dataInputStream0, (int) (byte) (-71), (int) (byte)17, (int) (byte)22);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(5, simpleCharStream0.bufpos);
      assertEquals(22, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A(0x%");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token0.beginColumn);
      assertEquals("A", token0.toString());
      assertEquals(2, token0.endColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token1.kind);
      assertEquals(2, token1.beginLine);
      assertEquals(2, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 12, 1961);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-48);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, 1498, (-4742), 5);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1498, token1.endLine);
      assertEquals((-4741), token1.endColumn);
      assertEquals((-4741), token1.beginColumn);
      assertEquals("\uFFFD", token1.toString());
      assertEquals(1498, token1.beginLine);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 5, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-48);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (-4742), (int) (byte)35, (int) (byte)63);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(35, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token0.endColumn);
      assertEquals("i", token0.toString());
      
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token1 = jVCParserTokenManager1.getNextToken();
      assertEquals(16, token1.kind);
      assertEquals(3, token1.beginColumn);
      assertEquals(2, token1.beginLine);
      assertEquals(2, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("CZ&=Nn#MT");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1594, 3853);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3853, token0.beginColumn);
      assertEquals(1594, token0.endLine);
      assertEquals(1594, token0.beginLine);
      assertEquals(3853, token0.endColumn);
      assertEquals("C", token0.toString());
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".FD()}2o");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-37);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) dataInputStream0, (int) (byte)121, (int) (byte) (-37), 3685);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(121, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals((-37), token0.endColumn);
      assertEquals(121, token0.beginLine);
      assertEquals((-37), token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("i=(^5Z#+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("i", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(4, token0.endColumn);
      assertEquals(4, token0.endLine);
      assertEquals(4, token0.beginLine);
      assertEquals(4, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".FD()}2o");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 447);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 447. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)93, (byte)93, 13);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("]]", token0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-79);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 153);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (-2027), 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)2, (byte)93);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(2, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)93, (byte)93, 13);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals("]", token0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(4, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(5, token0.kind);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals("[[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z[@MY");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals("[", token0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 616, 4430);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.curLexState = 616;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      assertEquals(4431, simpleCharStream0.getBeginColumn());
      assertEquals(616, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(3, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("z[@MY");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }
}