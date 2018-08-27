/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:02:28 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.ReInit((Reader) inputStreamReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("_sb.append(\"\u0000\u0000\u0000\u0000\u0000\");", (Set<String>) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
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
      jVCParser0.getToken(1358);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.parse();
      jVCParser0.ReInit((JVCParserTokenManager) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.ReInit((InputStream) pipedInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.disable_tracing();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.enable_tracing();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      JVCParser jVCParser1 = new JVCParser(jVCParser0.token_source);
      // Undeclared exception!
      try { 
        jVCParser1.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "setCachedBlock(\"";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
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
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.getToken(100);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ")}a:";
      stringArray0[1] = "-debug";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.getToken(100);
      jVCParser0.getNextToken();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.getToken(100);
      char[] charArray0 = new char[0];
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = " (";
      stringArray0[2] = "";
      JVCParser.main(stringArray0);
      inputStreamReader0.read(charArray0);
      jVCParser0.getToken(38);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ',';
      charArray0[1] = '\"';
      charArray0[2] = 'P';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.parse();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.parse();
  }
}