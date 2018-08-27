/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:06:47 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserConstants;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
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
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("", linkedHashSet0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null);
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
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(dataInputStream0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      // Undeclared exception!
      try { 
        jVCParser0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.ReInit((Reader) pipedReader0);
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
  public void test09()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2017);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      Token token0 = jVCParser0.getToken((-2237));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-deg");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.getToken(35);
      jVCParser0.generateParseException();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
      
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      Token token0 = jVCParser0.getToken(1700);
      assertEquals("", token0.toString());
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(2, token0.endColumn);
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals(2, token0.beginColumn);
      assertNotNull(token0);
      
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
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/+4.");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "ty:");
      assertTrue(boolean0);
      
      stringArray0[0] = "+4.";
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" \"");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[1];
      int int0 = stringReader0.read(charArray0);
      assertEquals(1, int0);
      assertArrayEquals(new char[] {' '}, charArray0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      int int1 = JVCParserConstants.ID;
      assertFalse(int1 == int0);
      assertEquals(14, int1);
      
      Token token0 = jVCParser0.getToken(14);
      assertEquals("", token0.toString());
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertNotNull(token0);
      
      Token token1 = jVCParser0.getToken(1);
      assertFalse(token1.equals((Object)token0));
      assertNotSame(token1, token0);
      assertEquals("\"", token1.toString());
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token1.endLine);
      assertEquals(1, token1.endColumn);
      assertEquals(16, token1.kind);
      assertEquals(1, token1.beginLine);
      assertEquals(1, token1.beginColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("d>");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      Token token0 = jVCParser0.getToken(126);
      assertEquals("", token0.toString());
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(2, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(2, token0.beginColumn);
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertNotNull(token0);
      
      Token token1 = jVCParser0.getNextToken();
      assertFalse(token1.equals((Object)token0));
      assertNotSame(token1, token0);
      assertEquals("d", token1.toString());
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token1.beginColumn);
      assertEquals(16, token1.kind);
      assertEquals(1, token1.beginLine);
      assertEquals(1, token1.endLine);
      assertEquals(1, token1.endColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("after : \"");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"after : \\\"\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/13_javaviewcontrol/+4.");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "ty:");
      assertTrue(boolean0);
      
      stringArray0[0] = "+4.";
      Locale locale0 = Locale.ITALY;
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertNotNull(locale0);
      
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
      
      JVCParser jVCParser0 = new JVCParser("+4.", set0, true);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      jVCParser0.enable_tracing();
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
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
      StringReader stringReader0 = new StringReader("\"[[+\"");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
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
      Charset charset0 = Charset.defaultCharset();
      assertTrue(charset0.isRegistered());
      assertTrue(charset0.canEncode());
      assertEquals("US-ASCII", charset0.toString());
      assertEquals("US-ASCII", charset0.name());
      assertEquals("US-ASCII", charset0.displayName());
      assertNotNull(charset0);
      
      StringReader stringReader0 = new StringReader("\r");
      assertNotNull(stringReader0);
      
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 4000);
      assertNotNull(bufferedReader0);
      
      JVCParser jVCParser0 = new JVCParser(bufferedReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("yT9/1jA~9");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"yT9/1jA~9\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      assertNotNull(stringReader0);
      
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(jVCParser0);
      
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