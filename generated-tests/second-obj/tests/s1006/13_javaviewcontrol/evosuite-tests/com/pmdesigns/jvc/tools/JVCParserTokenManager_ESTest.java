/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:56:13 GMT 2018
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
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, (-1310));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1310. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(2147450880);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2147450880. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 156);
      simpleCharStream0.backup(156);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginLine);
      assertEquals(0, token0.endLine);
      assertEquals(0, token0.endColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 0);
      StringReader stringReader0 = new StringReader("x!ff");
      simpleCharStream0.ReInit((Reader) stringReader0, 156, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
      ByteArrayInputStream byteArrayInputStream0 = null;
      try {
        byteArrayInputStream0 = new ByteArrayInputStream((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 1);
      simpleCharStream0.backup(156);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(0, token0.beginLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 0);
      simpleCharStream0.backup(156);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        MockURI.create("\u0000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 0: \u0000
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 2);
      simpleCharStream0.backup(2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.curLexState = 4093;
      jVCParserTokenManager0.setDebugStream(jVCParserTokenManager0.debugStream);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, token0.endLine);
      assertEquals(0, token0.endColumn);
      assertEquals("", token0.toString());
      assertEquals(0, token0.beginColumn);
      assertEquals(0, token0.kind);
      assertEquals(0, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 0);
      StringReader stringReader0 = new StringReader("x!ff");
      simpleCharStream0.ReInit((Reader) stringReader0, 156, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "x");
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
      ByteArrayInputStream byteArrayInputStream0 = null;
      try {
        byteArrayInputStream0 = new ByteArrayInputStream((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 1, 12);
      StringReader stringReader0 = new StringReader("^dH:BI,");
      simpleCharStream0.ReInit((Reader) stringReader0, 1, 156);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream((String) null, "l`(^FfontC\u0001el3B");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = false;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      int int0 = (-1527);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-1527), 53);
      String string0 = "IN_CODE";
      StringReader stringReader0 = new StringReader("IN_CODE");
      simpleCharStream0.ReInit((Reader) stringReader0, (-1527), 15);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("I", "I");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // I
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-2821), 2);
      simpleCharStream0.backup((-2821));
      StringReader stringReader0 = new StringReader("7R`");
      stringReader0.markSupported();
      simpleCharStream0.ReInit((Reader) stringReader0, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      PrintStream printStream0 = null;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.getNextToken();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = null;
      try {
        byteArrayInputStream1 = new ByteArrayInputStream((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, (-1702));
      String string0 = "^dH:BI,";
      StringReader stringReader0 = new StringReader("^dH:BI,");
      simpleCharStream0.ReInit((Reader) stringReader0, 1696, 156);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, false);
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
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      int int0 = 20;
      int int1 = 2;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 20, 2);
      simpleCharStream0.backup(2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      boolean boolean0 = simpleCharStream0.prevCharIsCR;
      jVCParserTokenManager0.getNextToken();
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("bz07d')Om;", "com.pmdesigns.jvc.tools.Token");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // com.pmdesigns.jvc.tools.Token
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      boolean boolean0 = simpleCharStream0.prevCharIsCR;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.setDebugStream(jVCParserTokenManager0.debugStream);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-62);
      byteArray0[2] = (byte) (-62);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (int) (byte) (-62), 0, 17);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(objectOutputStream0, false);
      Locale locale0 = Locale.FRANCE;
      jVCParserTokenManager0.getNextToken();
      sequenceInputStream0.available();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-62));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -62. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 4);
      simpleCharStream0.maxNextCharInd = 4;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      boolean boolean0 = simpleCharStream0.prevCharIsCR;
      jVCParserTokenManager0.getNextToken();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte)14;
      byteArray0[4] = (byte)14;
      byteArray0[5] = (byte)14;
      byteArray0[6] = (byte)14;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 0, 4, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(jVCParserTokenManager0.debugStream);
      MockPrintStream mockPrintStream1 = new MockPrintStream(jVCParserTokenManager0.debugStream, false);
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 156, 0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      boolean boolean0 = simpleCharStream0.prevCharIsCR;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.setDebugStream(jVCParserTokenManager0.debugStream);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-62);
      byteArray0[2] = (byte) (-62);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (int) (byte) (-62), 0, 17);
      MockPrintStream mockPrintStream0 = new MockPrintStream(jVCParserTokenManager0.debugStream, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(objectOutputStream0, false);
      Locale locale0 = Locale.FRANCE;
      jVCParserTokenManager0.getNextToken();
      sequenceInputStream0.available();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-62));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -62. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-4429), 4299);
      StringReader stringReader0 = new StringReader("[[");
      stringReader0.ready();
      simpleCharStream0.ReInit((Reader) stringReader0, 94, 2796);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "[[");
      jVCParserTokenManager0.getNextToken();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      SimpleCharStream simpleCharStream1 = null;
      try {
        simpleCharStream1 = new SimpleCharStream(sequenceInputStream0, "(+7", 227, 2796);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }
}