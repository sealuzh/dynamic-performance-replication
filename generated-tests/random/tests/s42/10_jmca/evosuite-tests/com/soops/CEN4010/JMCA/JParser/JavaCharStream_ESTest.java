/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:22:26 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaCharStream_ESTest extends JavaCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 0, 0, 0);
      javaCharStream0.adjustBeginLineColumn(4, (-1764));
      assertEquals(5, javaCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, 101);
      javaCharStream0.bufsize = (-527);
      javaCharStream0.adjustBeginLineColumn((-1490), (-1490));
      assertEquals(0, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.bufpos = 4084;
      javaCharStream0.adjustBeginLineColumn(4059, 4059);
      int int0 = javaCharStream0.getLine();
      assertEquals(4059, javaCharStream0.getBeginLine());
      assertEquals(4059, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.soops.CEN4010.JMCA.JParser.JavaCharStream");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4, 4);
      javaCharStream0.backup(0);
      javaCharStream0.getColumn();
      assertEquals(4095, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1447, 2081);
      javaCharStream0.ReInit((Reader) stringReader0, (-1073), (-1073), 2081);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Vi~Kv.Ugma4l");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.ReInit((Reader) null, 66, 88, 346);
      javaCharStream0.ReInit((Reader) stringReader0, 89, 88);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-864), 117, (-2564));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      javaCharStream0.ReInit((InputStream) dataInputStream0, 92, (-373));
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 94, 12);
      // Undeclared exception!
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = null;
      try {
        javaCharStream0 = new JavaCharStream(stringReader0, 4, 4, (-2454));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, 1, 1);
      javaCharStream0.ReInit((Reader) stringReader0, 13, 13, 1);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.bufpos = 4084;
      javaCharStream0.adjustBeginLineColumn(4059, 4059);
      int int0 = javaCharStream0.getEndColumn();
      assertEquals(4059, javaCharStream0.getBeginLine());
      assertEquals(4059, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-864), 117, (-2564));
      javaCharStream0.adjustBeginLineColumn((-373), (-864));
      javaCharStream0.adjustBeginLineColumn(1587, 65);
      assertEquals(65, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PI0gC+LXdGR=ke");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4661, 4661, 4661);
      char[] charArray0 = javaCharStream0.GetSuffix(0);
      assertEquals(0, charArray0.length);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-864), 117, (-2564));
      char[] charArray0 = javaCharStream0.GetSuffix(1);
      assertEquals(1, charArray0.length);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"q`=3+'&gpaX?,?H7D");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.GetImage();
      assertEquals(1, javaCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":v/U9AmA");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.GetImage();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.bufpos = 4084;
      javaCharStream0.backup(4059);
      assertEquals(25, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PI0gC+LXdGR=ke");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4661, 4661, 4661);
      javaCharStream0.ReInit((Reader) stringReader0, 4661, 4661, 0);
      char char0 = javaCharStream0.BeginToken();
      assertEquals(4661, javaCharStream0.getBeginLine());
      assertEquals('P', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$#qgf',4!N_{B");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1104), (-1104));
      javaCharStream0.inBuf = 2672;
      char char0 = javaCharStream0.readChar();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.prevCharIsCR = true;
      // Undeclared exception!
      try { 
        javaCharStream0.UpdateLineColumn('O');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, 101);
      javaCharStream0.prevCharIsLF = true;
      // Undeclared exception!
      try { 
        javaCharStream0.UpdateLineColumn(']');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.bufsize = 803;
      javaCharStream0.AdjustBuffSize();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.backup(4059);
      javaCharStream0.BeginToken();
      assertEquals(37, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader(":v/U9AmA");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.readChar();
      char char0 = javaCharStream0.readChar();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals('v', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1871), 63);
      try { 
        javaCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 5, (-2));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      javaCharStream0.inputStream = (Reader) stringReader0;
      char char0 = javaCharStream0.ReadByte();
      assertEquals('I', char0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ZaX!(uY)G6Uu(b|m(");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        JavaCharStream.hexval('j');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = JavaCharStream.hexval('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = JavaCharStream.hexval('d');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = JavaCharStream.hexval('c');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = JavaCharStream.hexval('b');
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = JavaCharStream.hexval('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      try { 
        JavaCharStream.hexval('`');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        JavaCharStream.hexval('^');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        JavaCharStream.hexval(']');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        JavaCharStream.hexval('[');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        JavaCharStream.hexval('Z');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      try { 
        JavaCharStream.hexval('Y');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        JavaCharStream.hexval('X');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        JavaCharStream.hexval('V');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        JavaCharStream.hexval('T');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        JavaCharStream.hexval('S');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        JavaCharStream.hexval('R');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        JavaCharStream.hexval('Q');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        JavaCharStream.hexval('P');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        JavaCharStream.hexval('O');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        JavaCharStream.hexval('N');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      try { 
        JavaCharStream.hexval('L');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      try { 
        JavaCharStream.hexval('K');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        JavaCharStream.hexval('J');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        JavaCharStream.hexval('G');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = JavaCharStream.hexval('F');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = JavaCharStream.hexval('E');
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = JavaCharStream.hexval('C');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = JavaCharStream.hexval('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      try { 
        JavaCharStream.hexval('@');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      try { 
        JavaCharStream.hexval('?');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      try { 
        JavaCharStream.hexval('=');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      try { 
        JavaCharStream.hexval(';');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      try { 
        JavaCharStream.hexval(':');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = JavaCharStream.hexval('9');
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = JavaCharStream.hexval('8');
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = JavaCharStream.hexval('6');
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = JavaCharStream.hexval('5');
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = JavaCharStream.hexval('4');
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = JavaCharStream.hexval('3');
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = JavaCharStream.hexval('1');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      try { 
        JavaCharStream.hexval('<');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 1, 1);
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringReader stringReader0 = new StringReader("YOd<iO@;\"VAG+g{");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.Done();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0, (-1), 1169, (int) (byte)59);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$#qgf',4!N_{B");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-1104), (-1104));
      // Undeclared exception!
      try { 
        javaCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.soops.CEN4010.JMCA.JParser.JavaCharStream");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4, 4);
      javaCharStream0.getBeginLine();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, (-938), (-938));
      // Undeclared exception!
      try { 
        javaCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 5, (-2));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      try { 
        javaCharStream0.ReadByte();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      javaCharStream0.ReInit((InputStream) bufferedInputStream0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.soops.CEN4010.JMCA.JParser.JavaCharStream");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4, 4);
      // Undeclared exception!
      try { 
        javaCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.getBeginColumn();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 0, 0, 0);
      StringReader stringReader0 = new StringReader("HXTDDcw^XrM9p@5");
      javaCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Vi~Kv.Ugma4l");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 0, 0, 0);
      javaCharStream0.ReInit((InputStream) pipedInputStream0, (-1764), (-1764));
      assertEquals((-1), javaCharStream0.bufpos);
  }
}
