/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:36:16 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserConstants;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.ParseException;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.enable_tracing();
      // Undeclared exception!
      try { 
        jVCParser0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add((String) null);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      Token token0 = jVCParser0.getToken((-390));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.enable_tracing();
      Token token0 = jVCParser0.getToken((-9));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "`qpGJS}|");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.enable_tracing();
      // Undeclared exception!
      try { 
        jVCParser0.getToken(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      PipedReader pipedReader0 = new PipedReader();
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("u");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      JVCParser jVCParser1 = new JVCParser(jVCParser0.token_source);
      jVCParser1.enable_tracing();
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"u\");", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      JVCParser jVCParser1 = new JVCParser(jVCParser0.token_source);
      jVCParser1.enable_tracing();
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\\x4d");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      PipedWriter pipedWriter0 = new PipedWriter();
      ByteArrayInputStream byteArrayInputStream0 = null;
      try {
        byteArrayInputStream0 = new ByteArrayInputStream((byte[]) null, 100, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.enable_tracing();
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/;LJ8/r<&+*ey2AXFlh");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      String[] stringArray0 = new String[2];
      stringArray0[0] = ";LJ8/r<&+*ey2AXFlh";
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      JVCParser.main(stringArray0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(";LJ8/r<&+*ey2AXFlh");
      boolean boolean1 = mockFileInputStream0.markSupported();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "U$N9vQyl[bfZb");
      StringReader stringReader0 = new StringReader("_");
      stringReader0.reset();
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      String[] stringArray0 = new String[10];
      stringArray0[0] = ".31i6f%0CqBrbt9aK1c";
      Token token0 = jVCParser0.getToken(100);
      assertEquals(1, token0.endLine);
      
      stringArray0[8] = "\r";
      stringArray0[2] = "U$N9vQyl[bfZb";
      Token token1 = jVCParser0.getNextToken();
      assertEquals(16, token1.kind);
      assertNotSame(token1, token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token1.endColumn);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      JVCParser jVCParser1 = new JVCParser(stringReader0);
      JVCParser jVCParser2 = new JVCParser(jVCParser1.token_source);
      jVCParser0.parse();
      Token token0 = jVCParser2.getToken(1955);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[0] = "";
      stringArray0[3] = "";
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)32;
      token0.beginColumn = (int) (byte)100;
      byteArray0[3] = (byte) (-14);
      jVCParser2.getToken(95);
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.getToken(721);
      jVCParser0.parse();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("\n");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Unbalanced cache block in ");
      stringReader0.markSupported();
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      jVCParser0.disable_tracing();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      jVCParser0.enable_tracing();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/;LJ8/r<&+*ey2AXFlh");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ";LJ8/r<&+*ey2AXFlh";
      FileSystemHandling.createFolder(evoSuiteFile0);
      JVCParser jVCParser1 = new JVCParser(jVCParser0.token_source);
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser2 = new JVCParser(";LJ8/r<&+*ey2AXFlh", set0, true);
      jVCParser2.ReInit((Reader) pipedReader0);
      // Undeclared exception!
      try { 
        jVCParser0.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[+\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[.\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.getNextToken();
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = (-213);
      StringReader stringReader0 = new StringReader("\"[[==\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("\n");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      StringReader stringReader1 = new StringReader("[[!");
      stringReader1.markSupported();
      JVCParser jVCParser0 = new JVCParser(stringReader1);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }
}