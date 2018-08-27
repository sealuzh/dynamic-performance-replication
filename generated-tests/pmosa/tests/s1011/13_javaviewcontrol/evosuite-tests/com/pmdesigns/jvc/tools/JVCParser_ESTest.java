/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:23:46 GMT 2018
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.ParseException;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Enumeration;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("=", set0);
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
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("EUE Ly$+v!Z|#YjRv?");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 30);
      JVCParser jVCParser0 = new JVCParser(bufferedReader0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-78);
      byteArray0[5] = (byte)10;
      byteArray0[6] = (byte)49;
      byteArray0[7] = (byte) (-45);
      byteArray0[8] = (byte) (-90);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      jVCParser0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0);
      jVCParser0.debugColumn = 42;
      jVCParser0.ReInit((InputStream) sequenceInputStream0);
      assertEquals(42, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ".=eiiHqw40s}H.d[";
      stringArray0[1] = " \"";
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
      String[] stringArray0 = new String[2];
      stringArray0[1] = stringArray0[0];
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
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(100);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      Token token0 = null;
      jVCParserTokenManager0.defaultLexState = 2331;
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      jVCParser0.token = null;
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
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(7);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0, (String) null);
      jVCParser0.enable_tracing();
      Token token0 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("AuQ311PFjSM~");
      char[] charArray0 = new char[1];
      charArray0[0] = 'X';
      stringReader0.read(charArray0);
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((Reader) stringReader0);
      stringReader0.read();
      Token token0 = jVCParser0.getNextToken();
      jVCParser0.token = token0;
      Token token1 = jVCParser0.token_source.jjFillToken();
      jVCParser0.token = token1;
      jVCParser0.token.endColumn = 1;
      jVCParser0.enable_tracing();
      jVCParser0.disable_tracing();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Q";
      stringArray0[1] = "AuQ311PFjSM~";
      String string0 = "";
      stringArray0[2] = "";
      stringArray0[3] = "\n";
      stringArray0[4] = "Q";
      stringArray0[5] = "AuQ311PFjSM~";
      stringArray0[6] = "AuQ311PFjSM~";
      stringArray0[7] = "Q";
      JVCParser.main(stringArray0);
      SequenceInputStream sequenceInputStream0 = null;
      try {
        sequenceInputStream0 = new SequenceInputStream((Enumeration<? extends InputStream>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JVCParser jVCParser0 = new JVCParser(pipedReader0);
      jVCParser0.parse();
      jVCParser0.ReInit((Reader) pipedReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\r\n";
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(7);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(7);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
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
  public void test14()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      InputStreamReader inputStreamReader0 = new InputStreamReader(mockFileInputStream0, charsetDecoder0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.parse();
      JVCParser jVCParser1 = new JVCParser(mockFileInputStream0);
      String string0 = jVCParser1.parse();
      assertEquals("", string0);
      
      jVCParser0.ReInit(jVCParser1.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "^N2";
      stringArray0[1] = "^N2";
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charsetDecoder0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      JVCParser.main(stringArray0);
      jVCParser0.enable_tracing();
      Token token0 = jVCParser0.getToken((-4980));
      assertNotNull(token0);
      
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0);
      Token token0 = jVCParser0.getToken((-546));
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      StringReader stringReader1 = new StringReader("Encountered \"");
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("D@lZy^S");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      InputStream inputStream0 = null;
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
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\" \");", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamReader inputStreamReader0 = new InputStreamReader(pipedInputStream0, charsetDecoder0);
      JVCParser jVCParser0 = new JVCParser(inputStreamReader0);
      jVCParser0.enable_tracing();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(inputStreamReader0);
      jVCParser0.getToken(413);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "D@lZy^S";
      stringArray0[1] = "";
      stringArray0[2] = "JFfe";
      stringArray0[3] = " ";
      stringArray0[4] = "";
      JVCParser.main(stringArray0);
      PipedInputStream pipedInputStream1 = new PipedInputStream();
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream1, " ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException:  
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-210));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@9fa.r}m.&$Y");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      char[] charArray0 = new char[3];
      char[] charArray1 = new char[4];
      charArray1[1] = '<';
      charArray1[2] = '&';
      charArray1[3] = '&';
      stringReader0.read(charArray1);
      charArray0[0] = '&';
      charArray0[1] = 'T';
      charArray0[2] = '0';
      stringReader0.read(charArray0);
      jVCParser0.parse();
      jVCParser0.ReInit((Reader) stringReader0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@9fa.r}m.H$Y");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(58);
      assertEquals(13, token0.beginColumn);
      assertNotNull(token0);
      
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"@9fa.r}m.H$Y\");", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
      stringReader0.reset();
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
  public void test26()  throws Throwable  {
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
}