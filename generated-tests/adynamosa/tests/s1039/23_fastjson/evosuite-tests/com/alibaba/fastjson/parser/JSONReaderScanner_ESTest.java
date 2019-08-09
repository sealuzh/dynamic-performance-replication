/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 15:34:41 GMT 2019
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.np = (-1256);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1257
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      jSONReaderScanner0.putChar('\'');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('a', jSONReaderScanner0.getCurrent());
      assertEquals("a", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-.w\"", (-19));
      jSONReaderScanner0.np = (-19);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -20
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 51);
      jSONReaderScanner0.setToken(51);
      jSONReaderScanner0.bytesValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[4];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 51);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed string : \u001A
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('\u001A', 57344);
      assertEquals('?', jSONReaderScanner0.getCurrent());
      assertEquals(57344, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('F', 27);
      assertEquals('?', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("noOtkp{oO :teLY@uH0", 123);
      jSONReaderScanner0.next();
      char char0 = jSONReaderScanner0.charAt(3657);
      assertEquals('o', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.putChar(',');
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1571);
      jSONReaderScanner0.putChar('9');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '+';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 965, 3);
      jSONReaderScanner0.nextToken(5);
      assertEquals(2, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("25MZ*$3");
      assertEquals('2', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1571);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8$'l,tdP");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 123);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
      assertEquals('8', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 267, (-3133));
      int int0 = jSONReaderScanner0.indexOf('D', 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '0');
      jSONReaderScanner0.putChar('c');
      jSONReaderScanner0.decimalValue();
      assertEquals('0', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8$'l,tdP");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 123);
      jSONReaderScanner0.putChar('-');
      jSONReaderScanner0.decimalValue();
      assertEquals('8', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '1';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 267, (-3133));
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner", 2);
      char char0 = jSONReaderScanner0.charAt(7);
      assertEquals('c', jSONReaderScanner0.getCurrent());
      assertEquals('b', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("noOtkp{oO :teLY@uH0", 10);
      jSONReaderScanner0.putChar('|');
      jSONReaderScanner0.putChar('|');
      byte[] byteArray0 = jSONReaderScanner0.bytesValue();
      assertArrayEquals(new byte[] {(byte) (-96)}, byteArray0);
      assertEquals('n', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("`0.hFD$x$.RrsWO");
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals('`', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      String string0 = jSONReaderScanner0.subString(0, 9);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      int int0 = jSONReaderScanner0.indexOf('C', 0);
      assertEquals('a', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1571);
      int int0 = jSONReaderScanner0.indexOf('3', 1571);
      assertEquals((-1), int0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1571);
      int int0 = jSONReaderScanner0.indexOf('z', 76);
      assertEquals((-1), int0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner", 2);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(1750, 38, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 267, (-3133));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-3133), (-135), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("illegal state, textLength is zero");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char[] charArray0 = new char[0];
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertEquals('i', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R(~");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(66, (char[]) null, 66, (-1126));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 0);
      char[] charArray1 = jSONReaderScanner0.sub_chars(2, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray1, 2, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.serializer.SerializerFeature");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 0);
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, (-1651), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-.w\"", (-19));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(0, 4160, 83, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("`0.hFD$x$.RrsWO");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-248), 88);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("zF", 1571);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-2372), 122);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isBlankInput();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R(~");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      stringReader0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('F', 27);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stream closed
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('#', (-1758));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1758
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Ur", 123);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, (-1766));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-2549));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2549
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.serializer.SerializerFeature");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charArrayCompare((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      jSONReaderScanner0.putChar('\'');
      jSONReaderScanner0.putChar('J');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":lO,o8r15FEe1qc5");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-17), (char[]) null, (-17), 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, (-1766));
      SymbolTable symbolTable0 = new SymbolTable(56);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1766), 56, (-1766), symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1571);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(123, (-1758), 2721, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-2986), 68);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, (-120));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.scanString('.');
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23, 4);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23, 4);
      jSONReaderScanner0.charAt(76);
      jSONReaderScanner0.scanDate('>');
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.close();
      char char0 = 'o';
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 267, (-3133));
      jSONReaderScanner0.putChar('$');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("zF", 1571);
      jSONReaderScanner0.putChar('9');
      jSONReaderScanner0.putChar('9');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("BrowserSecure");
      jSONReaderScanner0.putChar('5');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("SU,*7U4{S:QdL%dF");
      jSONReaderScanner0.putChar('#');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[3] = '9';
      charArray0[4] = '9';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 5, (-2081));
      jSONReaderScanner0.nextToken(2048);
      assertEquals(3, jSONReaderScanner0.pos());
      
      Number number0 = jSONReaderScanner0.decimalValue(false);
      assertEquals(99.0, number0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("AllSingleQuotes");
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 16);
      assertEquals(16384, charArray0.length);
      assertEquals('A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-.w\"", (-19));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-19), (-1329));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1329
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1090);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(1, (-2894));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2894
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("8(", 1571);
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23, 4);
      jSONReaderScanner0.scanFieldFloatArray(charArray0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("8(", 1571);
      char[] charArray0 = new char[0];
      jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '>';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 180);
      jSONReaderScanner0.isBlankInput();
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.nextTokenWithChar('>');
      jSONReaderScanner0.charArrayCompare(charArray0);
      jSONReaderScanner0.isBlankInput();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("illegal state, textLength is zero");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.scanIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("a?>", 3738);
      SymbolTable symbolTable0 = new SymbolTable(1713);
      jSONReaderScanner0.addSymbol(3859, 1713, 1345, symbolTable0);
      assertEquals('a', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!qH.`kGMW*\"L", 1492);
      char[] charArray0 = new char[7];
      jSONReaderScanner0.arrayCopy(1492, charArray0, 0, 0);
      assertEquals('!', jSONReaderScanner0.getCurrent());
  }
}