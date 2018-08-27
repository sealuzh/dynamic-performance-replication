/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 07:30:26 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("::=pG%=$4I|cVOW_", (-668));
      char[] charArray0 = new char[5];
      charArray0[0] = 'G';
      charArray0[1] = '>';
      charArray0[2] = 's';
      charArray0[3] = '[';
      charArray0[4] = 'E';
      jSONReaderScanner0.scanFieldInt(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanFieldSymbol((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner");
      jSONReaderScanner0.scanType((String) null);
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('c', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!0;_O&&q@*");
      char[] charArray0 = new char[0];
      jSONReaderScanner0.scanFieldDate(charArray0);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals((-1), jSONReaderScanner0.matchStat);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ' ';
      charArray0[1] = 'S';
      charArray0[2] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      Locale locale0 = Locale.KOREAN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      jSONReaderScanner0.setLocale(locale0);
      int int0 = 0;
      jSONReaderScanner0.charAt(0);
      jSONReaderScanner0.close();
      int int1 = (-1323);
      int int2 = 34;
      SymbolTable symbolTable0 = null;
      try {
        symbolTable0 = new SymbolTable(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1185263
         //
         verifyException("com.alibaba.fastjson.parser.SymbolTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
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
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[9];
      charArray0[0] = '|';
      charArray0[1] = '/';
      charArray0[2] = '_';
      charArray0[3] = '_';
      charArray0[4] = 'Y';
      charArray0[5] = '0';
      charArray0[6] = 'e';
      charArray0[7] = 'f';
      charArray0[8] = 'T';
      jSONReaderScanner0.scanFieldDecimal(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.floatValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("qLA1)fcI[09Sz?Qk");
      jSONReaderScanner0.isBlankInput();
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
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-132), (-132));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -132
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      
      jSONReaderScanner0.close();
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      assertNull(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO", (-1832));
      char[] charArray0 = new char[3];
      charArray0[0] = 's';
      charArray0[1] = 'u';
      charArray0[2] = '.';
      jSONReaderScanner0.scanFieldLong(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1832), 34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.alibaba.fastjson.parser.JSONReaderScanner");
      jSONReaderScanner0.stringVal();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-2903), 70);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("pSH7SHj-U");
      char[] charArray0 = new char[6];
      charArray0[0] = 'w';
      charArray0[1] = 'q';
      charArray0[2] = '5';
      charArray0[3] = 'j';
      charArray0[4] = 'w';
      charArray0[5] = 'X';
      jSONReaderScanner0.scanFieldSymbol(charArray0);
      jSONReaderScanner0.charAt(119);
      jSONReaderScanner0.close();
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(b|[n;o#a^zHC#$", 2006);
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.bp = 2006;
      jSONReaderScanner0.isEOF();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('{', 2006);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'Y';
      charArray0[1] = 'B';
      charArray0[2] = 'u';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 0);
      jSONReaderScanner0.sp = 25;
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'Q';
      charArray0[1] = 'U';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2018);
      int int0 = 0;
      jSONReaderScanner0.copyTo(2018, 0, charArray0);
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
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":");
      jSONReaderScanner0.pos = (-10);
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
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(",b");
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
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[0];
      int int0 = 1311;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1311);
      Locale locale0 = Locale.ENGLISH;
      jSONReaderScanner0.locale = locale0;
      jSONReaderScanner0.scanFieldFloatArray(charArray0);
      int int1 = 0;
      int int2 = (-550);
      int int3 = 0;
      SymbolTable symbolTable0 = null;
      try {
        symbolTable0 = new SymbolTable(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1185263
         //
         verifyException("com.alibaba.fastjson.parser.SymbolTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '~';
      charArray0[1] = 'G';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 972);
      jSONReaderScanner0.matchStat = 972;
      jSONReaderScanner0.tokenName();
      Locale locale0 = Locale.ENGLISH;
      jSONReaderScanner0.locale = locale0;
      jSONReaderScanner0.scanDecimal('j');
      jSONReaderScanner0.bytesValue();
      assertEquals('~', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('G', char0);
      
      int int0 = jSONReaderScanner0.indexOf('0', 972);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(b|[n;o#a^zHC#$", 2006);
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.next();
      assertFalse(jSONReaderScanner0.isEOF());
      
      int int0 = jSONReaderScanner0.indexOf('w', 2006);
      assertEquals('b', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      int int0 = jSONReaderScanner0.indexOf('E', 775);
      assertEquals((-1), int0);
      
      jSONReaderScanner0.close();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("08Z");
      assertEquals('0', jSONReaderScanner0.getCurrent());
      
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner("");
      String string0 = jSONReaderScanner1.subString(56, 119);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('\u0000', jSONReaderScanner1.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '~';
      charArray0[1] = 'G';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 972);
      jSONReaderScanner0.matchStat = 972;
      jSONReaderScanner0.tokenName();
      Locale locale0 = Locale.ENGLISH;
      jSONReaderScanner0.locale = locale0;
      jSONReaderScanner0.scanDecimal('j');
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
      
      jSONReaderScanner0.close();
      assertEquals('~', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-S-$!u|dD9fhEAF");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
      
      jSONReaderScanner0.close();
      assertEquals('-', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = 'G';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 972);
      jSONReaderScanner0.tokenName();
      BigDecimal bigDecimal0 = new BigDecimal(972);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 2006);
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.pos = 0;
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.close();
      char[] charArray0 = new char[3];
      charArray0[0] = 'r';
      charArray0[1] = 'E';
      charArray0[2] = 'E';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-1), 0, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '~';
      charArray0[1] = 'G';
      int int0 = 972;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 972);
      jSONReaderScanner0.matchStat = 972;
      char char0 = 'j';
      jSONReaderScanner0.tokenName();
      Locale locale0 = Locale.ENGLISH;
      jSONReaderScanner0.locale = locale0;
      SymbolTable symbolTable0 = null;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanSymbol((SymbolTable) null, 'G');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal stat, textLength is zero");
      long long0 = JSONLexerBase.MULTMIN_RADIX_TEN;
      jSONReaderScanner0.stringVal();
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
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(b|[n;o#a^zHC#$", 2006);
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.isEOF();
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
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 2006);
      char[] charArray0 = new char[1];
      charArray0[0] = '/';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 3);
      jSONReaderScanner0.tokenName();
      Locale locale0 = Locale.ENGLISH;
      JSONReaderScanner jSONReaderScanner2 = new JSONReaderScanner(charArray0, 2);
      jSONReaderScanner2.scanDecimal('/');
      jSONReaderScanner2.bytesValue();
      jSONReaderScanner2.next();
      jSONReaderScanner2.indexOf('C', 0);
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
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      assertTrue(jSONReaderScanner0.isEOF());
      
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner("unclosed str", 0);
      byte[] byteArray0 = jSONReaderScanner1.bytesValue();
      assertArrayEquals(new byte[] {}, byteArray0);
      
      boolean boolean0 = jSONReaderScanner1.isEOF();
      assertFalse(boolean0);
      
      jSONReaderScanner0.close();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner1.stringVal();
      assertEquals('u', jSONReaderScanner1.getCurrent());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '~';
      charArray0[1] = 'G';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 972);
      jSONReaderScanner0.matchStat = 972;
      jSONReaderScanner0.tokenName();
      int int0 = jSONReaderScanner0.indexOf('G', 303);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('~', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Hd1\"QcH", 2006);
      char[] charArray0 = new char[8];
      charArray0[0] = 'y';
      charArray0[1] = '+';
      charArray0[2] = 'S';
      charArray0[3] = 'O';
      charArray0[4] = 'I';
      charArray0[5] = '>';
      charArray0[6] = 'd';
      charArray0[7] = 'f';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-1), charArray0, (-1), 930);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 960, 79);
      jSONReaderScanner0.putChar('\u0000');
      jSONReaderScanner0.bytesValue();
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(b|[n;o#a^zHC#$", 2006);
      jSONReaderScanner0.putChar('e');
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.isEOF();
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
      char[] charArray0 = new char[6];
      charArray0[0] = 'F';
      charArray0[1] = 'F';
      charArray0[2] = 'F';
      charArray0[3] = 'F';
      charArray0[4] = 'F';
      charArray0[5] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 960, 79);
      jSONReaderScanner0.putChar('F');
      jSONReaderScanner0.bytesValue();
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
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("(b|[n;o#a^zHC#$", 2006);
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.bp = 2006;
      jSONReaderScanner0.isEOF();
      char char0 = '/';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanDecimal('/');
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      char[] charArray0 = new char[9];
      charArray0[0] = 'O';
      charArray0[1] = 'L';
      charArray0[2] = 'i';
      charArray0[3] = 'i';
      charArray0[4] = 'j';
      charArray0[5] = 'j';
      charArray0[6] = 'w';
      charArray0[7] = ',';
      charArray0[8] = ',';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 68);
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 0, 358);
      jSONReaderScanner0.putChar('i');
      jSONReaderScanner1.bytesValue();
      assertEquals('\u0000', jSONReaderScanner1.getCurrent());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("O", string0);
      assertEquals('O', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.putChar('q');
      jSONReaderScanner0.bytesValue();
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      int int0 = 23;
      char[] charArray0 = new char[5];
      charArray0[0] = 'L';
      charArray0[1] = 'L';
      charArray0[2] = 'L';
      charArray0[3] = 'L';
      charArray0[4] = 'V';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23, (-169));
      jSONReaderScanner0.putChar('L');
      jSONReaderScanner0.bytesValue();
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
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Q1n>c~+\nM\"");
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanString();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "com.alibaba.fastjson.parser.JSONReaderScanner");
      char[] charArray0 = new char[6];
      charArray0[0] = 'L';
      charArray0[1] = 'L';
      charArray0[2] = 'L';
      charArray0[3] = 'O';
      charArray0[4] = 'O';
      charArray0[5] = 'M';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 2894);
      assertEquals('L', jSONReaderScanner0.getCurrent());
      
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 1215, (-710));
      jSONReaderScanner1.putChar('L');
      byte[] byteArray0 = jSONReaderScanner1.bytesValue();
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = jSONReaderScanner1.numberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'B';
      charArray0[1] = 't';
      charArray0[3] = 'A';
      charArray0[4] = 'B';
      charArray0[5] = 'L';
      charArray0[6] = 't';
      charArray0[7] = 'A';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 861, 44);
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 1400, 755);
      jSONReaderScanner0.putChar('t');
      JSONReaderScanner jSONReaderScanner2 = new JSONReaderScanner("gEE@lam?+f3:.S<tWw");
      jSONReaderScanner1.bytesValue();
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
  public void test44()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("w_RPLx]");
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.indexOf('E', 775);
      jSONReaderScanner0.close();
      assertEquals('w', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte) (-7);
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte) (-41);
      byteArray0[4] = (byte)108;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-122);
      byteArray0[7] = (byte)28;
      byteArray0[8] = (byte) (-121);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("B");
      jSONReaderScanner0.putChar('w');
      jSONReaderScanner0.bytesValue();
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
      
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('B', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" ");
      SymbolTable symbolTable0 = new SymbolTable(450);
      String string0 = jSONReaderScanner0.addSymbol(631, 450, 3, symbolTable0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      
      jSONReaderScanner0.close();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\u001A';
      charArray0[2] = '\u001A';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279);
      jSONReaderScanner0.scanFieldSymbol(charArray0);
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.bytesValue();
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("]!E^%DIKS187Kj.\"");
      jSONReaderScanner0.putChar('\'');
      jSONReaderScanner0.bytesValue();
      char[] charArray0 = new char[8];
      charArray0[0] = '';
      charArray0[1] = '';
      charArray0[0] = '\'';
      charArray0[4] = '\'';
      charArray0[5] = '';
      charArray0[6] = '\'';
      charArray0[0] = '\'';
      jSONReaderScanner0.scanFieldBigInteger(charArray0);
      jSONReaderScanner0.putChar('\'');
      jSONReaderScanner0.numberString();
      assertEquals(']', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanString();
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "(b|[n;o#a^zHC$");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("SortField", (-193));
      jSONReaderScanner0.putChar('F');
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.numberString();
      jSONReaderScanner0.putChar('+');
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner("XqAv'{u{J04k(", 0);
      jSONReaderScanner1.bytesValue();
      jSONReaderScanner0.numberString();
      PipedReader pipedReader0 = null;
      try {
        pipedReader0 = new PipedReader(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe size <= 0
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("F");
      jSONReaderScanner0.scanInt('/');
      jSONReaderScanner0.putChar('/');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
      assertFalse(jSONReaderScanner0.isEOF());
  }
}