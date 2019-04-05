/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 23:37:35 GMT 2019
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
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e3XL3/[}g|JuO\"J");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"e3XL3/[}g|JuO\\\"J\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("DEFAULT");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "DEFAULT");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "DEFAULT";
      JVCParser.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" at line ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(41);
      assertNotNull(token0);
      assertEquals(1, token0.endLine);
      
      jVCParser0.ReInit(jVCParser0.token_source);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.getToken(9);
      assertEquals(0, byteArrayInputStream0.available());
      
      jVCParser0.generateParseException();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" at line ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v@");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-2048));
      assertEquals(0, token0.beginColumn);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(691);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.ReInit((InputStream) pushbackInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\" at line ";
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
  public void test10()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) mockFileInputStream0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null, "\" at line ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, linkedHashSet0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("U!+ )_|O+G\bk=", set0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(2409, 116.0F);
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
  public void test15()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(bufferedInputStream0, "x%3LBZKrCSK>#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: x%3LBZKrCSK>#
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
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
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" at line ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(1411);
      assertEquals(10, token0.beginColumn);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\\" at line \");", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("F.)3");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(1);
      assertEquals(1, token0.beginColumn);
      
      Token token1 = jVCParser0.getToken(1872);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token1.beginLine);
      assertEquals(4, token1.endColumn);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" at line ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(1411);
      assertEquals(10, token0.endColumn);
      assertNotNull(token0);
      assertEquals(0, token0.kind);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token1.endColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("F.)3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<ESCAPED_CHAR>");
      Locale locale0 = Locale.UK;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("F.)3", set0);
      Token token0 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token0);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((Reader) stringReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.ReInit((Reader) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("F.)3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<ESCAPED_CHAR>");
      Locale locale0 = Locale.UK;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("F.)3", set0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 5);
      jVCParser0.ReInit((InputStream) bufferedInputStream0, (String) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
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
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("F.)3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<ESCAPED_CHAR>");
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("F.)3", set0, true);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("F.)3");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "<ESCAPED_CHAR>");
      Locale locale0 = Locale.UK;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("F.)3", set0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"<ESCAPED_CHAR>\\n\");\n", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "-debug";
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
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JVCParser.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\" at line ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
