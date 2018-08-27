/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:43:27 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaCharStream_ESTest extends JavaCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.getBeginColumn();
      PipedReader pipedReader0 = new PipedReader();
      javaCharStream0.ReInit((Reader) pipedReader0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      PipedReader pipedReader0 = new PipedReader(3);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 3, 3);
      try { 
        javaCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.available = (-1);
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
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, (-739), (-739));
      javaCharStream0.ReInit((InputStream) pipedInputStream0, (-739), (-739), 0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(5);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.GetImage();
      javaCharStream0.getBeginLine();
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
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.readChar();
      int int0 = javaCharStream0.getEndColumn();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(0);
      assertEquals(4095, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = JavaCharStream.hexval('D');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      try { 
        JavaCharStream.hexval('i');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.backup(463);
      javaCharStream0.readChar();
      assertEquals(3633, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 12, 12);
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
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.ReInit((InputStream) pipedInputStream0, (-3311), 1);
      assertEquals(0, javaCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.getBeginColumn();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      try { 
        javaCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.ExpandBuff(false);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals(12, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      // Undeclared exception!
      try { 
        javaCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0, 26, 26);
      javaCharStream0.Done();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = JavaCharStream.hexval('C');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(6);
      javaCharStream0.BeginToken();
      javaCharStream0.Done();
      javaCharStream0.ReInit((Reader) null, 6, 4364);
      assertEquals(0, javaCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(1);
      JavaCharStream javaCharStream1 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.readChar();
      javaCharStream0.GetSuffix(1);
      javaCharStream0.UpdateLineColumn('\u0000');
      assertEquals(4095, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[34];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        javaCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
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
  public void test26()  throws Throwable  {
      int int0 = JavaCharStream.hexval('d');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.ReInit((Reader) null, (int) (byte)13, (int) (byte)13);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(1);
      javaCharStream0.BeginToken();
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JavaCharStream.hexval('f');
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      int int0 = JavaCharStream.hexval('b');
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char char0 = 'Z';
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byte[] byteArray1 = new byte[22];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray1);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
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
  public void test37()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.GetImage();
      javaCharStream0.AdjustBuffSize();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = JavaCharStream.hexval('8');
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char char0 = 'X';
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      int int0 = JavaCharStream.hexval('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = JavaCharStream.hexval('1');
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.adjustBeginLineColumn((-1), (-1));
      assertEquals((-1), javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3412);
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
  public void test46()  throws Throwable  {
      JavaCharStream.hexval('3');
      PipedReader pipedReader0 = new PipedReader(1968);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, (-2196), (-2196));
      javaCharStream0.ReInit((Reader) pipedReader0, (-2196), (-525), 3);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      JavaCharStream.hexval('B');
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0);
      javaCharStream0.GetSuffix(70);
      // Undeclared exception!
      try { 
        javaCharStream0.UpdateLineColumn('x');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      JavaCharStream.hexval('2');
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      JavaCharStream.hexval('A');
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char char0 = '=';
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
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      JavaCharStream javaCharStream1 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream1.adjustBeginLineColumn(0, 61);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)93;
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
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)92;
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
  public void test60()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
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
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      byte byte0 = (byte)93;
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
  public void test63()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3412);
      JavaCharStream.hexval('9');
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      byteArray0[7] = (byte)53;
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
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream1.markSupported();
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
  public void test66()  throws Throwable  {
      JavaCharStream.hexval('F');
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      JavaCharStream.hexval('4');
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JavaCharStream.hexval('c');
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      JavaCharStream.hexval('5');
      javaCharStream0.backup(5446);
      // Undeclared exception!
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1350
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      char char0 = '\\';
      try { 
        JavaCharStream.hexval('\\');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
  public void test72()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)73;
      byteArray0[3] = (byte)93;
      byteArray0[4] = (byte)93;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.BeginToken();
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
  public void test73()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      JavaCharStream.hexval('E');
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JavaCharStream.hexval('6');
      try { 
        JavaCharStream.hexval('*');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.readChar();
      javaCharStream0.GetImage();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.available = (-5085);
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
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      StringReader stringReader0 = new StringReader("2");
      JavaCharStream javaCharStream1 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.FillBuff();
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
  public void test78()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(1);
      javaCharStream0.adjustBeginLineColumn(1, 1);
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      JavaCharStream.hexval('0');
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream.hexval('7');
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.available = (-5085);
      javaCharStream0.AdjustBuffSize();
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.BeginToken();
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.adjustBeginLineColumn(1, (-3414));
      javaCharStream0.adjustBeginLineColumn(4065, 1);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.bufpos = 81;
      javaCharStream0.available = 81;
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.getColumn();
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      javaCharStream0.backup(1);
      JavaCharStream.hexval('e');
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.prevCharIsLF = true;
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.maxNextCharInd = 420;
      javaCharStream0.FillBuff();
      javaCharStream0.readChar();
      javaCharStream0.BeginToken();
      javaCharStream0.backup(1);
      javaCharStream0.readChar();
  }
}