/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:38:09 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaCharStream_ESTest extends JavaCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jC}Yp!B_b#^M?<C");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1797, 1797);
      char char0 = javaCharStream0.readChar();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals('j', char0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte) (-117), (-1428));
      javaCharStream0.readChar();
      int int0 = javaCharStream0.getEndLine();
      assertEquals((-117), javaCharStream0.getBeginLine());
      assertEquals((-117), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jC}Yp!B_b#^M?<C");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1797, 1797);
      char char0 = javaCharStream0.ReadByte();
      assertEquals('j', char0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)92, (byte)11);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)5, (byte)5, 0);
      javaCharStream0.backup(0);
      javaCharStream0.adjustBeginLineColumn((byte)5, (byte) (-1));
      assertEquals(4095, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)92, (byte)11);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)5, (byte)5, 0);
      javaCharStream0.adjustBeginLineColumn((byte)5, (byte) (-1));
      assertEquals(6, javaCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 77, 77);
      javaCharStream0.ReInit((InputStream) pipedInputStream0, 85, 65, 77);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2916, (-2541), 4019);
      javaCharStream0.ExpandBuff(false);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      // Undeclared exception!
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 99, 99);
      javaCharStream0.Done();
      // Undeclared exception!
      try { 
        javaCharStream0.getColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 2499, (-2358), 3481);
      // Undeclared exception!
      try { 
        javaCharStream0.ReadByte();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 65, (-1654));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, 1, (byte) (-24));
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.Done();
      // Undeclared exception!
      try { 
        javaCharStream0.AdjustBuffSize();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Jt}=EfOAa]");
      JavaCharStream javaCharStream0 = null;
      try {
        javaCharStream0 = new JavaCharStream(stringReader0, (-1990), (-1990), (-1990));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("T+5");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 4053, 3454, 13);
      javaCharStream0.ReInit((Reader) stringReader0, 3454, (-1917), 576);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      // Undeclared exception!
      try { 
        javaCharStream0.ReInit((InputStream) null, 1, 6, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte) (-117), (-1428));
      int[] intArray0 = new int[7];
      intArray0[2] = (int) (byte)57;
      javaCharStream0.bufline = intArray0;
      // Undeclared exception!
      try { 
        javaCharStream0.adjustBeginLineColumn(11, (byte)98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 65, (-1654));
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, 1, (byte) (-24));
      javaCharStream0.tokenBegin = (int) (byte)74;
      javaCharStream0.adjustBeginLineColumn(95, (byte)1);
      assertEquals(1, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte) (-117), (-1428));
      javaCharStream0.readChar();
      javaCharStream0.adjustBeginLineColumn(11, (byte)98);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(11, javaCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.GetSuffix(0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jC}Yp!B_b#^M?<C");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1797, 1797);
      char[] charArray0 = javaCharStream0.GetSuffix(1797);
      assertEquals(1797, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.backup(285);
      javaCharStream0.GetImage();
      assertEquals(3810, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1127, 1127);
      javaCharStream0.GetImage();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 2499, (-2358), 3481);
      javaCharStream0.Done();
      javaCharStream0.ReInit((Reader) null, (-2358), 83);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("FV97m-00__");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 87, 87, 87);
      javaCharStream0.backup((-1591));
      // Undeclared exception!
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1591
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Invalid escape character at line ");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.prevCharIsLF = true;
      char char0 = javaCharStream0.BeginToken();
      assertEquals(2, javaCharStream0.getBeginLine());
      assertEquals('I', char0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("ci4)W|Fs{+#HVp_bZ");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.available = 99;
      javaCharStream0.AdjustBuffSize();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 99, 99);
      javaCharStream0.inBuf = 81;
      javaCharStream0.BeginToken();
      assertEquals(0, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 14, 92, 6130);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      javaCharStream0.ReInit((InputStream) sequenceInputStream0);
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
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 0, 0);
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
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte) (-117), (-1428));
      javaCharStream0.readChar();
      javaCharStream0.BeginToken();
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2916, (-2541), 4019);
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
  public void test31()  throws Throwable  {
      try { 
        JavaCharStream.hexval('r');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = JavaCharStream.hexval('f');
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = JavaCharStream.hexval('e');
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = JavaCharStream.hexval('d');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = JavaCharStream.hexval('b');
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = JavaCharStream.hexval('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      try { 
        JavaCharStream.hexval('_');
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      try { 
        JavaCharStream.hexval('W');
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
  public void test43()  throws Throwable  {
      try { 
        JavaCharStream.hexval('U');
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
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
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
        JavaCharStream.hexval('M');
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
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      try { 
        JavaCharStream.hexval('I');
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
      try { 
        JavaCharStream.hexval('H');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      int int0 = JavaCharStream.hexval('E');
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = JavaCharStream.hexval('D');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = JavaCharStream.hexval('C');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = JavaCharStream.hexval('B');
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = JavaCharStream.hexval('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
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
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      try { 
        JavaCharStream.hexval('>');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
      int int0 = JavaCharStream.hexval('8');
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = JavaCharStream.hexval('6');
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      int int0 = JavaCharStream.hexval('5');
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = JavaCharStream.hexval('2');
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = JavaCharStream.hexval('1');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      int int0 = JavaCharStream.hexval('c');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      int int0 = JavaCharStream.hexval('0');
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.soops.CEN4010.JMCA.JParser.JavaCharStream");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte)110, (byte)110);
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
  public void test74()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      javaCharStream0.getBeginLine();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.backup(285);
      javaCharStream0.readChar();
      assertEquals(3811, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringReader stringReader0 = new StringReader("St0s,yOQRW*L.ND");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 10, 10);
      javaCharStream0.ReInit((Reader) stringReader0, 10, (-558));
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte) (-117), (-1428));
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
  public void test78()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 10, 1666, 1182);
      javaCharStream0.getBeginColumn();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 1, (-1));
      javaCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 77, 77);
      javaCharStream0.ReInit((InputStream) pipedInputStream0, 1, 1268);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      StringReader stringReader0 = new StringReader("St0s,yOQRW*L.ND");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 10, 10);
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
  public void test82()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaCharStream javaCharStream0 = new JavaCharStream(mockFileInputStream0);
      javaCharStream0.prevCharIsCR = true;
      // Undeclared exception!
      try { 
        javaCharStream0.UpdateLineColumn('3');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }
}