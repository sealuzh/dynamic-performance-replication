/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 03:00:44 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isBlankInput();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-724), 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '/';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      int int0 = 2118;
      jSONReaderScanner0.sub_chars(2118, 2118);
      jSONReaderScanner0.stringVal();
      int int1 = 0;
      SymbolTable symbolTable0 = new SymbolTable(65279);
      // Undeclared exception!
      try { 
        symbolTable0.addSymbol(">z.", 0, (-2615), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.SymbolTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      int int0 = 55232;
      char char0 = '$';
      jSONReaderScanner0.scanDate('$');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanTrue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse true
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '`';
      charArray0[1] = 'r';
      charArray0[2] = 'm';
      charArray0[3] = '4';
      charArray0[4] = 'G';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      jSONReaderScanner0.arrayCopy(0, charArray0, 0, 0);
      assertArrayEquals(new char[] {'`', 'r', 'm', '4', 'G'}, charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '0';
      charArray0[1] = '9';
      charArray0[2] = 'I';
      charArray0[3] = 'y';
      charArray0[4] = 'J';
      charArray0[5] = 's';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26, 26);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("gG!CrQ&NHA#5Wy:");
      jSONReaderScanner0.setToken(357);
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('g', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      int int0 = 91;
      PushbackReader pushbackReader0 = new PushbackReader(pipedReader0, 91);
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pushbackReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 72, 9);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      boolean boolean1 = jSONReaderScanner0.isBlankInput();
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO", 716);
      char char0 = jSONReaderScanner0.charAt(716);
      assertFalse(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', char0);
      assertEquals('T', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("fastjson.properties");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char[] charArray0 = new char[7];
      charArray0[0] = ')';
      charArray0[1] = '/';
      charArray0[2] = 'Z';
      charArray0[3] = '1';
      charArray0[4] = 'r';
      charArray0[5] = 'J';
      charArray0[6] = ' ';
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertEquals('f', jSONReaderScanner0.getCurrent());
      assertArrayEquals(new char[] {')', '/', 'Z', '1', 'r', 'J', ' '}, charArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[0];
      int int0 = 0;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      Feature feature0 = Feature.UseObjectArray;
      jSONReaderScanner0.scanFieldString(charArray0);
      jSONReaderScanner0.config(feature0, false);
      jSONReaderScanner0.matchStat = 0;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-471), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 76, 76);
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.bytesValue();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 42);
      char[] charArray1 = new char[9];
      charArray1[0] = '\\';
      charArray1[1] = '%';
      charArray1[2] = 'J';
      charArray1[3] = '%';
      jSONReaderScanner0.matchField(charArray0);
      charArray1[4] = 'X';
      charArray1[5] = '^';
      jSONReaderScanner0.scanFieldUUID(charArray1);
      charArray1[6] = 't';
      charArray1[7] = '^';
      charArray1[8] = 'J';
      jSONReaderScanner0.scanFieldUUID(charArray1);
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.next();
      jSONReaderScanner0.stringVal();
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '4';
      charArray0[1] = '9';
      charArray0[2] = '*';
      charArray0[3] = 'n';
      charArray0[4] = 'h';
      charArray0[5] = 'v';
      charArray0[6] = ';';
      charArray0[7] = 'N';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      SymbolTable symbolTable0 = new SymbolTable(1006);
      jSONReaderScanner0.addSymbol(0, 2762, 0, symbolTable0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      assertTrue(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.nextIdent();
      boolean boolean0 = jSONReaderScanner0.hasSpecial;
      int int0 = jSONReaderScanner0.indexOf('o', 62);
      assertEquals((-1), int0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      char[] charArray0 = new char[6];
      charArray0[0] = 'v';
      charArray0[1] = 'v';
      charArray0[2] = 'b';
      charArray0[3] = 'p';
      charArray0[4] = '|';
      charArray0[5] = '^';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 5010, 20);
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      char char0 = jSONReaderScanner0.next();
      assertEquals('v', char0);
      
      jSONReaderScanner0.isEOF();
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 5010);
      jSONReaderScanner1.bytesValue();
      int int0 = jSONReaderScanner1.indexOf('|', 0);
      assertEquals(4, int0);
      
      boolean boolean1 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("G!CrQNHA#5Wy:");
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.charAt(502);
      assertEquals(18, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '8';
      charArray0[1] = '_';
      charArray0[2] = ';';
      charArray0[3] = '.';
      charArray0[4] = 'Z';
      charArray0[5] = 'v';
      char[] charArray1 = new char[7];
      charArray1[0] = '_';
      charArray1[1] = 'Z';
      charArray1[2] = ';';
      charArray1[3] = '.';
      charArray1[4] = 'B';
      charArray1[5] = '8';
      charArray1[6] = '8';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray1, 103, 0);
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.next();
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.indexOf('.', 5010);
      jSONReaderScanner0.next();
      char char0 = jSONReaderScanner0.next();
      assertEquals('Z', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'p';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 3, 0);
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      assertEquals('p', jSONReaderScanner0.getCurrent());
      
      char[] charArray1 = new char[5];
      charArray1[0] = 'Y';
      charArray1[1] = 'Y';
      charArray1[2] = 'Y';
      charArray1[3] = 'B';
      charArray1[4] = 'b';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray1, 0);
      jSONReaderScanner1.isBlankInput();
      jSONReaderScanner0.next();
      jSONReaderScanner1.isEOF();
      jSONReaderScanner1.bytesValue();
      int int0 = jSONReaderScanner0.indexOf('k', 0);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 76, 9);
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
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("g");
      jSONReaderScanner0.nextIdent();
      boolean boolean0 = jSONReaderScanner0.hasSpecial;
      int int0 = jSONReaderScanner0.indexOf('o', 62);
      assertEquals(18, jSONReaderScanner0.token());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("get", 3601);
      char[] charArray0 = new char[1];
      SymbolTable symbolTable0 = new SymbolTable(5015);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanSymbol(symbolTable0, 'j');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed.str
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" e-* ");
      jSONReaderScanner0.putChar('E');
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
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("gG!CrQ&NHA#5Wy:");
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.bytesValue();
      char[] charArray0 = new char[1];
      jSONReaderScanner0.nextIdent();
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 0);
      char[] charArray1 = new char[8];
      charArray1[0] = ':';
      charArray1[1] = '~';
      charArray1[2] = ':';
      charArray1[3] = ':';
      charArray1[4] = 's';
      charArray1[5] = ':';
      charArray1[6] = ':';
      charArray1[7] = ':';
      jSONReaderScanner0.scanFieldUUID(charArray1);
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
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '8';
      charArray0[2] = '_';
      charArray0[2] = ';';
      charArray0[3] = '.';
      charArray0[4] = 'Z';
      charArray0[6] = 'v';
      charArray0[6] = '5';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 6, 86);
      jSONReaderScanner0.putChar('v');
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      jSONReaderScanner0.isBlankInput();
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("8", string0);
      
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('8', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("_");
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("_", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 9);
      jSONReaderScanner0.scanFieldDate(charArray0);
      assertEquals((-1), jSONReaderScanner0.matchStat);
      
      jSONReaderScanner0.scanFieldIntArray(charArray0);
      jSONReaderScanner0.setToken(9);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSONReaderScanner0.close();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = 76;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 76, 9);
      jSONReaderScanner0.bp = 936;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanFieldSymbol(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal stat, textLength is zero");
      char[] charArray0 = new char[7];
      charArray0[0] = 'J';
      charArray0[1] = 'g';
      charArray0[2] = 'B';
      charArray0[3] = '\'';
      charArray0[4] = 'W';
      charArray0[5] = 'z';
      charArray0[6] = '`';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 81, 0);
      jSONReaderScanner1.nextIdent();
      jSONReaderScanner1.numberString();
      assertEquals('\'', jSONReaderScanner1.getCurrent());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableASM");
      jSONReaderScanner0.charAt(1318);
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("DisableA", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("EOF error");
      jSONReaderScanner0.nextIdent();
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
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" -> ");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L");
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableAS");
      int int0 = 145;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "DisableAS");
      jSONReaderScanner0.bp = 145;
      jSONReaderScanner0.nextIdent();
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
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L");
      jSONReaderScanner0.nextIdent();
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
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'c';
      charArray0[1] = 'F';
      charArray0[2] = '%';
      charArray0[3] = '+';
      charArray0[4] = 'Q';
      charArray0[5] = 'j';
      charArray0[6] = 'n';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4, 4);
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("c", string0);
  }
}
