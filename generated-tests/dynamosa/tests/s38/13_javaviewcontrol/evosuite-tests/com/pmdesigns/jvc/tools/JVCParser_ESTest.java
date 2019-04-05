/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:13:28 GMT 2019
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
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
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
      StringReader stringReader0 = new StringReader("setCachedBlock(\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"setCachedBlock(\\\"\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      jVCParser0.getToken(2700);
      jVCParser0.generateParseException();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      Token token0 = jVCParser0.getToken(0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" R_NNKm#Iv:>y");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-1));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      jVCParser0.ReInit((InputStream) pushbackInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("b^)H$MkSGQ#xVu");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      SimpleCharStream simpleCharStream0 = jVCParser0.jj_input_stream;
      simpleCharStream0.ReInit((Reader) stringReader0, 100, 100, 100);
      simpleCharStream0.inBuf = 100;
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("f (_cached = null) {\n");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0000");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "f (_cached = null) {\n";
      JVCParser.main(stringArray0);
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "f (_cached = null) {\n";
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
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("lhOB{4O=8");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      jVCParser0.getToken(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("usage: JVCParser <path to template file> [-debug]");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2265, 10, 2265);
      simpleCharStream0.available = (-2519);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(2265);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3019), 11);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.getToken((byte)107);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream0, "tERfgmn");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
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
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, set0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("Can't find include file: ", linkedHashSet0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(pipedInputStream0, "\"c[[!\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: \"c[[!\"
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((InputStream) null, ", line: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      jVCParser0.ReInit((InputStream) pushbackInputStream0, (String) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0, 2443);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      StringReader stringReader0 = new StringReader("lhO/B{4O=8");
      jVCParser0.ReInit((Reader) stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"lhO/B{4O=8\");", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" R_NNKm#Iv:>y");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Locale locale0 = Locale.US;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser(" R_NNKm#Iv:>y", set0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
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
  public void test30()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      Token token0 = jVCParser0.getToken(100);
      assertNotNull(token0);
      
      jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      Token token0 = jVCParser0.getToken(100);
      Token token1 = jVCParser0.getToken(1822);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token1);
      assertNotSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      Token token0 = jVCParser0.getToken(100);
      assertNotNull(token0);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertNotSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("UzR ~zZtQ#c");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
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
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2yUZzgQ");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "2yUZzgQ");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "2yUZzgQ";
      JVCParser.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" R_NNKm#Iv:>y");
      byte[] byteArray0 = new byte[17];
      byteArray0[2] = (byte)93;
      byteArray0[3] = (byte)93;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = " R_NNKm#Iv:>y";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced end tag in  R_NNKm#Iv:>y, line: 1
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("f (_cached = null) {\n");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "0000");
      Locale locale0 = Locale.KOREAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("f (_cached = null) {\n", set0, true);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JVCParser.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("]]'|Z#3kf$)i+f=]{,", linkedHashSet0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">[7;wf%T|");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
