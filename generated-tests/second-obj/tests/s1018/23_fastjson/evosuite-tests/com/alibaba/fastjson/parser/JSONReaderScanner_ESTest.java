/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:52:47 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.BufferedReader;
import java.io.File;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Oe!]`L*#{`", 0);
      String string0 = jSONReaderScanner0.subString(0, 34);
      assertEquals("Oe!]`L*#{`\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('O', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("?9`Fi(V");
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23, 23);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(93, 93, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ybR0;lpez7z^OJ&sL", 68);
      char[] charArray0 = jSONReaderScanner0.sub_chars(68, 11);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('y', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 59);
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
  public void test06()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      pipedWriter0.append((CharSequence) null);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(pipedReader0);
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
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isEOF();
      SymbolTable symbolTable0 = new SymbolTable(2221);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1890), (-1890), 38, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 35);
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      jSONReaderScanner0.stringVal();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isEOF();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1892), (-2611));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2611
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 13);
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.charArrayCompare(charArray0);
      jSONReaderScanner0.subString(13, 13);
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
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("h~6K'Jbd}r''`'0[");
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.scanLong('r');
      jSONReaderScanner0.sub_chars(1094, 118);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("38CEL$");
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
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("IRUw ", 3079);
      jSONReaderScanner0.close();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-oDz#t1~P)gi?EJ!!5", 34);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('x', 65536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65536
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[2] = 'g';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'g', 'g');
      jSONReaderScanner0.indexOf('o', 636);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("38CEL$");
      jSONReaderScanner0.isEOF();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[15];
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)99;
      byteArray0[5] = (byte)0;
      SymbolTable symbolTable0 = new SymbolTable(54);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, (byte)8);
      jSONReaderScanner0.bytesValue();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("_38CEL$");
      jSONReaderScanner0.isEOF();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1244), (-208));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -208
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ".2Burm:JaFl|,9p'! ");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.hasSpecial = false;
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.indexOf('d', 1731);
      JSONReaderScanner jSONReaderScanner1 = null;
      try {
        jSONReaderScanner1 = new JSONReaderScanner(charArray0, (-996), 1731);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = ';';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, ';');
      int int0 = (-223);
      jSONReaderScanner0.nextIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(';', charArray0, ';', (-223));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("7Vq5w-5UdIt(f", 52);
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.decimalValue();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      BigDecimal bigDecimal0 = new BigDecimal(43);
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 43, 43);
      jSONReaderScanner0.next();
      jSONReaderScanner0.scanUUID('$');
      jSONReaderScanner0.scanNumber();
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.charAt(794);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(">,d=={;7BTPh[UfI$]");
      jSONReaderScanner0.scanIdent();
      BigDecimal bigDecimal0 = new BigDecimal(0);
      jSONReaderScanner0.numberString();
      char char0 = Locale.PRIVATE_USE_EXTENSION;
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.charAt(0);
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.indexOf('\u001A', 34);
      char[] charArray0 = new char[2];
      charArray0[0] = '\u001A';
      charArray0[1] = '\u001A';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(34, charArray0, 34, 71);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4360));
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.isBlankInput();
      boolean boolean0 = jSONReaderScanner0.hasSpecial;
      char[] charArray0 = new char[2];
      charArray0[0] = ' ';
      jSONReaderScanner0.scanFieldFloatArray2(charArray0);
      jSONReaderScanner0.matchField(charArray0);
      JSONReaderScanner jSONReaderScanner1 = null;
      try {
        jSONReaderScanner1 = new JSONReaderScanner(charArray0, (-4360), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"", (-492));
      jSONReaderScanner0.scanIdent();
      char[] charArray0 = new char[5];
      Locale locale0 = Locale.CHINA;
      locale0.clone();
      SymbolTable symbolTable0 = new SymbolTable(250);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      // Undeclared exception!
      try { 
        symbolTable0.addSymbol("\"", 250, 0, 2170);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1022);
      jSONReaderScanner0.matchField(charArray0);
      jSONReaderScanner0.bytesValue();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Ss-58:DgN92H_dfv2");
      int int0 = Calendar.UNDECIMBER;
      System.setCurrentTimeMillis(1022);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("c{^:j[.#Gjv!1;");
      jSONReaderScanner0.hasSpecial = true;
      jSONReaderScanner0.setToken(130);
      jSONReaderScanner0.stringVal();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "\"jM~5l";
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L`:Ub>;h0DZaZ?l", (-1683));
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
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("`iQIV4B_mcd", 52);
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
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4360));
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.scanDecimal('N');
      jSONReaderScanner0.close();
      char[] charArray0 = new char[3];
      charArray0[0] = 'N';
      jSONReaderScanner0.np = (-362);
      charArray0[1] = 'N';
      jSONReaderScanner0.indexOf('N', 4);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[5];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String string0 = "iM4";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "iM4");
      charArray0[2] = 'i';
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "iM4");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 224);
      int int0 = Calendar.UNDECIMBER;
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.scanUUID('D');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.floatValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Feature.AllowSingleQuotes is false");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 23);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(bufferedReader0);
      jSONReaderScanner0.scanIdent();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "AllowSingleQuotes");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[3];
      charArray0[0] = 'p';
      charArray0[1] = '<';
      charArray0[2] = 't';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 26, 26);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONReaderScanner jSONReaderScanner2 = new JSONReaderScanner(charArray0, 3);
      jSONReaderScanner2.longValue();
      jSONReaderScanner2.close();
      jSONReaderScanner1.isEOF();
      SymbolTable symbolTable0 = new SymbolTable(2650);
      symbolTable0.addSymbol(charArray0, 0, 0, 0);
      jSONReaderScanner1.scanSymbolUnQuoted(symbolTable0);
      jSONReaderScanner0.charAt(36);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.doubleValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }
}