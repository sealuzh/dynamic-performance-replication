/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:14:00 GMT 2018
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
import java.io.CharArrayReader;
import java.io.DataInputStream;
import java.io.FileDescriptor;
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
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("YGg_`", linkedHashSet0);
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
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
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
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[3];
      JVCParser.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = SimpleCharStream.staticFlag;
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
      
      jVCParser0.disable_tracing();
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      charArray0[1] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
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
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(dataInputStream0);
      jVCParser0.disable_tracing();
      PipedReader pipedReader0 = new PipedReader(100);
      jVCParser0.ReInit((Reader) pipedReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)56;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1292), (byte)56);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0, (String) null);
      jVCParser0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'l';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray0);
      charArrayReader2.markSupported();
      JVCParser jVCParser0 = new JVCParser(charArrayReader2);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"l\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/K8`");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K8`");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("K8`", set0, false);
      jVCParser0.parse();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
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
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/K8`");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K8`");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "K8`";
      JVCParser.main(stringArray0);
      StringReader stringReader0 = new StringReader("N{e:CcqcP");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/K8`");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)92;
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[1] = (byte)92;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "K8`";
      JVCParser.main(stringArray0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFile mockFile0 = new MockFile("K8`", "K8`");
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
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '^';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      Token token0 = jVCParser0.getToken(8);
      assertNotNull(token0);
      assertEquals(1, token0.endLine);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertNotSame(token1, token0);
      assertEquals(1, token1.beginColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/K8`");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K8`");
      byte[] byteArray0 = new byte[16];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[0] = (byte)0;
      byteArray0[2] = (byte)96;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale locale0 = Locale.CHINA;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = new JVCParser("K8`", linkedHashSet0, true);
      jVCParser0.disable_tracing();
      Token token0 = jVCParser0.getNextToken();
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/13_javaviewcontrol/K8`");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K8`");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("K8`", set0, true);
      jVCParser0.parse();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.markSupported();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.getToken(74);
      jVCParser0.parse();
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JVCParser jVCParser0 = new JVCParser(charArrayReader0);
      Token token0 = jVCParser0.getToken(12);
      jVCParser0.getToken(1);
      Token token1 = token0.next;
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\")");
      char[] charArray0 = new char[2];
      charArray0[0] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      Charset.defaultCharset();
      PipedReader pipedReader0 = new PipedReader(9972);
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.markSupported();
      stringReader0.mark(9972);
      pipedInputStream0.mark((-1590));
      jVCParser0.parse();
  }
}
