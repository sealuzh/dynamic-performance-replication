/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:49:37 GMT 2018
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream1, (-1));
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
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 1153, 1153, 1002);
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
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, (-361), 2553, 8);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 5);
      jVCParserTokenManager0.getNextToken();
      charArrayReader0.close();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 3146, 3146, 2);
      charArrayReader0.reset();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.getNextToken();
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
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, (-361), 38, 12);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      charArrayReader0.close();
      MockFile mockFile0 = new MockFile("0+uEQ3u#J3 }@U^_LM");
      assertFalse(mockFile0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, (-352), 0, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.defaultLexState = (-1);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream("\u0000");
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)90;
      byteArray0[6] = (byte)90;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)90, (byte)90);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.BeginToken();
      jVCParserTokenManager0.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream(29);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[20];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-40);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream1 = null;
      CharArrayReader charArrayReader1 = null;
      try {
        charArrayReader1 = new CharArrayReader(charArray0, (-1024), (-1122));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[20];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 3146, 1, 2);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, (byte[]) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.curLexState = 32;
      jVCParserTokenManager0.getNextToken();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
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
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[2];
      FileSystemHandling.shouldAllThrowIOExceptions();
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(charArrayReader0, 1953, 3, 3);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      byteArrayInputStream0.read();
      jVCParserTokenManager0.getNextToken();
      MockFile mockFile0 = new MockFile("\r");
      MockFile mockFile1 = null;
      try {
        mockFile1 = new MockFile(mockFile0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      String string0 = "com.pmdesigns.jvc.tools.SimpleCharStream";
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-284), (-1), 17);
      int int0 = 3;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      int int1 = 2580;
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("c");
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
      char[] charArray0 = new char[1];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-24);
      byteArray0[0] = (byte)0;
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      byteArrayInputStream0.close();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)1);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      simpleCharStream0.setTabSize(43);
      MockURI.create("\uFFFD");
      jVCParserTokenManager0.defaultLexState = 15;
      MockFile mockFile0 = new MockFile("\u0000", "\u0000");
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
  public void test13()  throws Throwable  {
      boolean boolean0 = SimpleCharStream.staticFlag;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("com.phdesigns.jvc.tools.SimpleCharStrvam");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 90, 5, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      MockFile mockFile0 = new MockFile("kr:BC)tg/,E%?6yi&");
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.SwitchTo(5);
      jVCParserTokenManager0.SwitchTo(0);
      assertEquals(5, simpleCharStream0.getBeginColumn());
      assertEquals(90, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("(XI1ZwCB]LW^\"M6;Av<");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 62, 33);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      MockFile mockFile0 = new MockFile("(XI1ZwCB]LW^\"M6;Av<");
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(15);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 15. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-24);
      byteArray0[0] = (byte)1;
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      byteArrayInputStream0.close();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)1);
      simpleCharStream0.bufsize = (-1936);
      char[] charArray0 = new char[5];
      charArray0[0] = 'I';
      charArray0[1] = 'v';
      charArray0[3] = 'X';
      charArray0[4] = '3';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, (byte)1, 3);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(charArrayReader0, (byte)1, 830, (byte)1);
      jVCParserTokenManager0.input_stream = simpleCharStream1;
      jVCParserTokenManager0.getNextToken();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      jVCParserTokenManager0.getNextToken();
      SimpleCharStream simpleCharStream2 = null;
      try {
        simpleCharStream2 = new SimpleCharStream(byteArrayInputStream0, "\u0000");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }
}