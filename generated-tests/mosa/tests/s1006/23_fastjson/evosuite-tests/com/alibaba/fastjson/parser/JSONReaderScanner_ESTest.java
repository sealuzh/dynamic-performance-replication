/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:57:48 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("f~v{o61");
      jSONReaderScanner0.scanType("springfox.documentation.spring.web.json.Json");
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
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 34);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
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
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("iK@");
      char char0 = jSONReaderScanner0.ch;
      assertEquals('i', char0);
      
      int int0 = jSONReaderScanner0.indexOf('i', 'i');
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("q7S7+F");
      jSONReaderScanner0.close();
      assertEquals('', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("QC&$&?9X'YJp)vX");
      assertEquals('Q', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state, textLe_gth is zero");
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
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[12];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2018);
      jSONReaderScanner0.sub_chars(0, 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2018);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(99999, 99999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-4617), (-4617));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4617
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("qld7Sc7+?f");
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
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 85);
      jSONReaderScanner0.scanFieldSymbol(charArray0);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isEOF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("X2ZV");
      char[] charArray0 = new char[0];
      jSONReaderScanner0.charArrayCompare(charArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("iK@");
      jSONReaderScanner0.next();
      jSONReaderScanner0.indexOf('K', 'K');
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("M?6kx'-c");
      jSONReaderScanner0.next();
      jSONReaderScanner0.indexOf('?', 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-S-$!u|dD9fhEAF");
      jSONReaderScanner0.bytesValue();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("qd7S7+Ff");
      jSONReaderScanner0.subString(13, 13);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 3);
      SymbolTable symbolTable0 = new SymbolTable(32);
      jSONReaderScanner0.addSymbol(32, 32, 32, symbolTable0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C#hD-e&N");
      jSONReaderScanner0.nextToken(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state, textLe_gth is zero");
      jSONReaderScanner0.isBlankInput();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#=~3W:&=");
      jSONReaderScanner0.bp = 118;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('{', 118);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[17];
      charArray0[4] = 'Q';
      charArray0[1] = 'Q';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 85);
      jSONReaderScanner0.scanFieldString(charArray0);
      jSONReaderScanner0.scanFieldSymbol(charArray0);
      char[] charArray1 = new char[2];
      charArray1[0] = 'Q';
      charArray1[1] = 'Q';
      jSONReaderScanner0.scanFieldSymbol(charArray1);
      jSONReaderScanner0.charAt(85);
      jSONReaderScanner0.close();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-2578), (-2578));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2578
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1599, 1599);
      jSONReaderScanner0.nextIdent();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L*yQ[$ex\"");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2018);
      int int0 = 26;
      jSONReaderScanner0.setToken(26);
      BigDecimal bigDecimal0 = new BigDecimal(2018);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TODO
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L*zQ[$ex\"");
      jSONReaderScanner0.scanString();
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
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[12];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-1777), charArray0, (-1777), (-1777));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("1%}=\"SM:nn1Dq6jJp@");
      jSONReaderScanner0.scanString();
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("WRITE_MAP_NULL_FEATURES");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal state, textLength is zero");
      jSONReaderScanner0.pos = (-11);
      jSONReaderScanner0.np = (-11);
      jSONReaderScanner0.resetStringPosition();
      char[] charArray0 = new char[7];
      charArray0[0] = '1';
      charArray0[1] = 'u';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner("illegal state, textLength is zero");
      jSONReaderScanner1.sbuf = null;
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L*[$ex\"");
      jSONReaderScanner0.scanString();
      jSONReaderScanner0.stringVal();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L*zQ[$ex\"");
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
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("SP\"/rq;B:^2-");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
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
      char[] charArray0 = new char[10];
      charArray0[0] = ' ';
      charArray0[1] = 'n';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 85);
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.close();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      char[] charArray0 = new char[5];
      charArray0[0] = 'X';
      charArray0[1] = 'X';
      charArray0[2] = 'r';
      charArray0[3] = 'F';
      charArray0[4] = '\\';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2576, 1217);
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
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("xD)%m3m");
      jSONReaderScanner0.intValue();
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
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
}