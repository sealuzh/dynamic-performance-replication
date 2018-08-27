/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:06:14 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      int int0 = 483;
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 483);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 483. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, true);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      byte byte0 = (byte)58;
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream1);
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
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (byte)10, (byte)59, 3861);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      MockFile mockFile0 = new MockFile("[[!");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)3);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("B~qI.Uw3%Cx=OM");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte) (-17);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-2675);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("oy>dO,}@JqiF$");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (byte)10, (byte)59, 3861);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      MockFile mockFile0 = new MockFile("o");
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-109);
      byteArray0[1] = (byte)58;
      byteArray0[2] = (byte)58;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream4 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream4);
      jVCParserTokenManager0.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream4, (-682));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -682. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)125;
      byteArray0[3] = (byte) (-109);
      byteArray0[4] = (byte)59;
      byteArray0[5] = (byte)93;
      byteArray0[4] = (byte) (-109);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("]]", "]]");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ]]
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)58;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 4);
      PrintStream printStream0 = jVCParserTokenManager1.debugStream;
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      MockFileReader mockFileReader0 = null;
      try {
        mockFileReader0 = new MockFileReader("\n");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager1.getNextToken();
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("[[==");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-109);
      byteArray1[1] = (byte) (-109);
      byteArray1[2] = (byte) (-109);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)3);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)58;
      byteArray0[1] = (byte)6;
      byteArray0[4] = (byte) (-116);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      simpleCharStream2.prevCharIsCR = false;
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream3, (int) (byte)58);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 58. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream1);
      ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream2);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream4 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream1);
      jVCParserTokenManager0.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream1, (-1741));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1741. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-109);
      byteArray0[4] = (byte)59;
      byteArray0[5] = (byte)93;
      byteArray0[6] = (byte) (-109);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      try { 
        simpleCharStream1.ReInit((InputStream) byteArrayInputStream0, "]");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)58;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      PrintStream printStream0 = jVCParserTokenManager0.debugStream;
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream4 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream5 = null;
      try {
        simpleCharStream5 = new SimpleCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte) (-6);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager2 = new JVCParserTokenManager(simpleCharStream1);
      ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager3 = new JVCParserTokenManager(simpleCharStream1);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager4 = new JVCParserTokenManager(simpleCharStream1);
      jVCParserTokenManager4.ReInit(simpleCharStream2, 2);
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream4 = new SimpleCharStream(byteArrayInputStream2);
      SimpleCharStream simpleCharStream5 = new SimpleCharStream(byteArrayInputStream2, 1, 1565);
      JVCParserTokenManager jVCParserTokenManager5 = new JVCParserTokenManager(simpleCharStream5, 1);
      jVCParserTokenManager4.getNextToken();
      SimpleCharStream simpleCharStream6 = new SimpleCharStream(byteArrayInputStream2);
      jVCParserTokenManager3.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)125;
      byteArray0[0] = (byte)59;
      byteArray0[5] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      jVCParserTokenManager0.getNextToken();
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, (int) (byte)59);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 59. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte) (-6);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager2 = new JVCParserTokenManager(simpleCharStream1);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager3 = new JVCParserTokenManager(simpleCharStream1);
      JVCParserTokenManager jVCParserTokenManager4 = new JVCParserTokenManager(simpleCharStream1);
      jVCParserTokenManager4.ReInit(simpleCharStream2, 1);
      SimpleCharStream simpleCharStream3 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream4 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream5 = new SimpleCharStream(byteArrayInputStream0, 1, 1565);
      JVCParserTokenManager jVCParserTokenManager5 = new JVCParserTokenManager(simpleCharStream5, 0);
      jVCParserTokenManager4.getNextToken();
      SimpleCharStream simpleCharStream6 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream7 = new SimpleCharStream(byteArrayInputStream1);
      SimpleCharStream simpleCharStream8 = new SimpleCharStream(byteArrayInputStream1);
      JVCParserTokenManager jVCParserTokenManager6 = new JVCParserTokenManager(simpleCharStream4);
      jVCParserTokenManager6.getNextToken();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)3;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)0;
      byteArray0[1] = (byte)10;
      byteArray0[4] = (byte) (-127);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, (int) (byte)0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream1, (byte)0);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager0.getNextToken();
      InputStream inputStream0 = null;
      SimpleCharStream simpleCharStream3 = null;
      try {
        simpleCharStream3 = new SimpleCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }
}