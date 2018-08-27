/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 16:09:21 GMT 2018
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaCharStream_ESTest extends JavaCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      // Undeclared exception!
      try { 
        javaCharStream0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.ReInit((Reader) null);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.ReInit((Reader) charArrayReader0);
      assertEquals(1, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = JavaCharStream.hexval('A');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      try { 
        JavaCharStream.hexval('n');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 1, 1);
      javaCharStream0.backup(1);
      javaCharStream0.Done();
      assertEquals(4094, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ']';
      charArray0[2] = ']';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.Done();
      assertEquals(0, javaCharStream0.bufpos);
      
      javaCharStream0.ReInit((Reader) charArrayReader0, 60, 1);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
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
  public void test09()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0);
      char char0 = File.separatorChar;
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
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaCharStream javaCharStream0 = new JavaCharStream(mockFileInputStream0);
      javaCharStream0.AdjustBuffSize();
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
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
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
  public void test12()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.getBeginColumn();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0, 1555);
      JavaCharStream javaCharStream0 = new JavaCharStream(pushbackInputStream0, 1555, 72);
      javaCharStream0.ReInit((InputStream) pushbackInputStream0, 1555, 860);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.readChar();
      int int0 = javaCharStream0.getColumn();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.GetSuffix(65);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char char0 = 'S';
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      int int0 = JavaCharStream.hexval('e');
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.AdjustBuffSize();
      // Undeclared exception!
      try { 
        javaCharStream0.getEndColumn();
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
  public void test23()  throws Throwable  {
      JavaCharStream.hexval('9');
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0);
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
  public void test26()  throws Throwable  {
      char char0 = '[';
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
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[12];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = JavaCharStream.hexval('a');
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = JavaCharStream.hexval('1');
      assertEquals(1, int0);
      
      JavaCharStream.hexval('6');
      int int1 = JavaCharStream.hexval('6');
      assertEquals(6, int1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      JavaCharStream javaCharStream0 = new JavaCharStream(mockFileInputStream0);
      try { 
        javaCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.getBeginLine();
      assertEquals((-1), javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 1, 1);
      javaCharStream0.backup(1);
      javaCharStream0.BeginToken();
      javaCharStream0.GetSuffix(98);
      assertEquals(4095, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = JavaCharStream.hexval('C');
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)108;
      byteArray0[4] = (byte)108;
      int int1 = JavaCharStream.hexval('B');
      assertEquals(11, int1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = JavaCharStream.hexval('d');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      int int1 = JavaCharStream.hexval('7');
      assertEquals(7, int1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      JavaCharStream.hexval('f');
      int int1 = JavaCharStream.hexval('f');
      assertEquals(15, int1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = JavaCharStream.hexval('D');
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[19];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.ReadByte();
      assertEquals(0, javaCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[12];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.adjustBeginLineColumn(0, 739);
      assertEquals(739, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
      javaCharStream0.adjustBeginLineColumn(77, 1);
      assertEquals(1, javaCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.adjustBeginLineColumn(0, 0);
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 1, 1);
      javaCharStream0.backup(1);
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JavaCharStream.hexval('b');
      char[] charArray0 = new char[5];
      charArray0[0] = 'b';
      charArray0[1] = 'b';
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null);
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
  public void test57()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 1, 1);
      javaCharStream0.backup(1);
      javaCharStream0.BeginToken();
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JavaCharStream.hexval('4');
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      JavaCharStream.hexval('b');
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaCharStream.hexval('2');
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
  public void test61()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JavaCharStream.hexval('5');
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        dataInputStream0.readShort();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JavaCharStream.hexval('b');
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
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.backup(1);
      javaCharStream0.readChar();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      JavaCharStream.hexval('3');
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaCharStream.hexval('0');
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'r';
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test68()  throws Throwable  {
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
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
      javaCharStream0.GetImage();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      char[] charArray0 = new char[32];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream.hexval('E');
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0, 14, 14, 'E');
      javaCharStream0.prevCharIsCR = true;
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.close();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.GetImage();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JavaCharStream.hexval('F');
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream.hexval('2');
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0, (-4871), 2, 2);
      javaCharStream0.readChar();
      javaCharStream0.adjustBeginLineColumn((-4871), 2);
      javaCharStream0.adjustBeginLineColumn(2, (-4871));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
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
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      JavaCharStream.hexval('8');
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JavaCharStream.hexval('c');
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.reset();
      charArrayReader0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.prevCharIsLF = true;
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[12];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test80()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, 4, 4);
      javaCharStream0.backup(4);
      char char0 = Locale.UNICODE_LOCALE_EXTENSION;
      javaCharStream0.BeginToken();
      javaCharStream0.AdjustBuffSize();
      javaCharStream0.AdjustBuffSize();
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      javaCharStream0.BeginToken();
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
  public void test82()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      javaCharStream0.available = 1346;
      javaCharStream0.AdjustBuffSize();
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedReader0, 1, 1);
      javaCharStream0.inBuf = 1;
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      javaCharStream0.BeginToken();
      javaCharStream0.bufline = intArray0;
      javaCharStream0.backup(1);
      javaCharStream0.BeginToken();
      try { 
        javaCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      charArray0[3] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader0);
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      charArray0[3] = '';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      JavaCharStream javaCharStream0 = new JavaCharStream(charArrayReader1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      charArrayReader1.reset();
      javaCharStream0.ReInit((Reader) charArrayReader0, 1, 1);
      javaCharStream0.AdjustBuffSize();
      JavaCharStream javaCharStream1 = new JavaCharStream(charArrayReader0, 1, 60, 1);
      javaCharStream1.BeginToken();
      char[] charArray1 = new char[4];
      charArray1[0] = 'm';
      charArray1[1] = 'u';
      charArray1[2] = 'm';
      charArray1[3] = 'm';
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      CharArrayReader charArrayReader2 = new CharArrayReader(charArray1);
      JavaCharStream javaCharStream2 = new JavaCharStream(charArrayReader1);
      javaCharStream2.BeginToken();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
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
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[32];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)9;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      javaCharStream0.BeginToken();
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      char[] charArray0 = new char[32];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)83;
      byteArray0[4] = (byte) (-115);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-86);
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte) (-46);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      javaCharStream0.BeginToken();
      javaCharStream0.BeginToken();
      // Undeclared exception!
      try { 
        javaCharStream0.GetSuffix((byte) (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      charArray0[3] = '3';
      charArray0[4] = '\\';
      charArray0[5] = '\\';
      charArray0[6] = 'N';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)11;
      byteArray0[3] = (byte)94;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)11;
      byteArray0[6] = (byte)94;
      byteArray0[7] = (byte)54;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      javaCharStream0.BeginToken();
      javaCharStream0.getBeginColumn();
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
  }
}