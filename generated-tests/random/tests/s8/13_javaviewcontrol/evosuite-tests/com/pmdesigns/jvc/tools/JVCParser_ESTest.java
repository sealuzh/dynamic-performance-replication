/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 16:26:44 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JVCParser jVCParser0 = new JVCParser(mockFileInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^nSF0x][O0[[vU");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      jVCParser0.getToken(1274);
      jVCParser0.generateParseException();
      assertEquals(13, simpleCharStream0.bufpos);
      assertEquals(14, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^nSF0x][O0[[vU");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      Token token0 = jVCParser0.getToken(0);
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9kT<oF,Js-");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-1620));
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.endColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1t\"th:(CFBS";
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
      StringReader stringReader0 = new StringReader("Jk*x8z");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.token_source = null;
      // Undeclared exception!
      try { 
        jVCParser0.getToken(867);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9kT<oF,Js-");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) byteArrayInputStream0, "A)eB}ckE`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: A)eB}ckE`
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("if (_cached == null) {\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null, "GQw232Q#hNc5^^np");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("6GK.$kM?|`muWKM", set0, false);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(byteArrayInputStream0, "6U=");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 6U=
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^nSF0x][O0[[vU");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
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
      StringReader stringReader0 = new StringReader("if (_cached == null) {\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(10);
      assertEquals(10, token0.beginColumn);
      assertNotNull(token0);
      
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"if (_cached == null) {\\n\");\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^nSF0x][O0[[vU");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      Token token0 = jVCParser0.getToken(1274);
      Token token1 = jVCParser0.getToken(1);
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertNotSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^nSF0x][O0[[vU");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      jVCParser0.getToken(1274);
      jVCParser0.getNextToken();
      assertEquals(13, simpleCharStream0.bufpos);
      assertEquals(14, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("9kT<oF,Js-");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("if (_cached == null) {\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((Reader) stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0GC&hO\"Ml");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"0GC&hO\\\"Ml\");", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\u0000\\r\");\r_sb.append(\"\u0000\u0000\u0000\u0000\u0000\u0000\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";{ PH{>]]P24ksW>/;");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced end tag in null, line: 1
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[9];
      JVCParser.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("Qyn&c;s", linkedHashSet0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@?!T/4{1dv`;7wda5x");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@?!T/4{1dv`;7wda5x");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
