/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:53:53 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
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
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        JVCParser.main((String[]) null);
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
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JVCParser jVCParser0 = new JVCParser(dataInputStream0);
      Token token0 = jVCParser0.getToken((-3989));
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token0);
      assertEquals(0, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<DIGIT>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ">f9b";
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
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<DIGIT>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 757);
      jVCParser0.ReInit((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(272);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(linkedList0);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("i{%k_UP7/%N|", linkedHashSet0, false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
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
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("y\b^$1u1D{diK6pz+");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(9);
      assertEquals(9, token0.endColumn);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"y\b^$1u1D{diK6pz+\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(403);
      Token token1 = jVCParser0.getToken(315);
      assertNotSame(token1, token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      Token token0 = jVCParser0.getToken(100);
      Token token1 = jVCParser0.getNextToken();
      assertNotSame(token1, token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<DIGIT>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getNextToken();
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)95, (-1));
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) byteArrayInputStream0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((Reader) stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M\"4_");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"M\\\"4_\");", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"\u0000\u0000\u0000\u0000\\r\");\r_sb.append(\"\u0000\u0000\");", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
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
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "~$bb?*K-'9E0Bt!_";
      stringArray0[1] = "-debug";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("~$bb?*K-'9E0Bt!_");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "com.pmdesigns.jvc.tools.ParseException");
      JVCParser.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "\\u";
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("\\u");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JVCParser jVCParser0 = new JVCParser(string0, set0, false);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JVCParser.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("{ risk4r_[gi}", set0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      jVCParser0.ReInit((InputStream) bufferedInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<DIGIT>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}