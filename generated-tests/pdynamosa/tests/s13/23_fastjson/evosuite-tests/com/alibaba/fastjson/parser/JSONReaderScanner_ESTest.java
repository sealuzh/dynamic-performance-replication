/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:42:44 GMT 2019
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 983);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("vW");
      jSONReaderScanner0.close();
      assertEquals('v', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'V';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 509, (-284));
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
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("T&");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
      assertEquals('&', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2786, 2786);
      jSONReaderScanner0.np = (-3137);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3138
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 290, 26);
      jSONReaderScanner0.setToken(1431);
      jSONReaderScanner0.bytesValue();
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 19, 19);
      charArray0[0] = 'b';
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(", ", 2357);
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
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(";I;");
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('v', 849);
      assertEquals('I', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 20);
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("coM{N`m<Ml");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.stringVal();
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("@");
      jSONReaderScanner0.np = 1838;
      String string0 = jSONReaderScanner0.numberString();
      assertFalse(jSONReaderScanner0.isEOF());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*4~$!uo)@]");
      assertEquals('*', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('4', char0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      assertEquals('T', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('O', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 89);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" /ZejO@u");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 264);
      assertEquals('6', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.decimalValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+_:1*)bH%$B`;]", (-3725));
      char char0 = jSONReaderScanner0.charAt(3);
      assertEquals('+', jSONReaderScanner0.getCurrent());
      assertEquals('1', char0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("com.google.common.collect.", 9);
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('c', jSONReaderScanner0.getCurrent());
      assertEquals('c', char0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("coM{N`m<Ml");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals('{', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@v(_^8nzEtf2'j4i");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 45);
      SymbolTable symbolTable0 = new SymbolTable(3);
      String string0 = jSONReaderScanner0.addSymbol(3088, 9, 3822, symbolTable0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('@', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+_:1*)bH%$B`;]", (-2200));
      char[] charArray0 = jSONReaderScanner0.sub_chars(423, 0);
      assertEquals(0, charArray0.length);
      assertEquals('+', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("vW");
      String string0 = jSONReaderScanner0.subString(79, 79);
      assertEquals('v', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("XvX");
      int int0 = jSONReaderScanner0.indexOf('\"', 0);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('X', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 0);
      int int0 = jSONReaderScanner0.indexOf('4', 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(40, 13, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("@", (-88));
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('@', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 16384, 794);
      char[] charArray1 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray1);
      assertFalse(jSONReaderScanner0.isEOF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(";0O.");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, 684, 76);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 0);
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-18), charArray0, (-2231), (-725));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!");
      SymbolTable symbolTable0 = new SymbolTable(1362);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(1863, (-2197), 1863, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 20);
      SymbolTable symbolTable0 = new SymbolTable(85);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-396), 3, 0, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+_:1*)bH%$B`;]");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1), 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 20);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("[i4Sgx)8D|Ujf|UZ");
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
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.next();
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
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONException");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('O', (-404));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -404
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(65536, (-902), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2047, (-491));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-106), (-106), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("U", 13);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 270);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt(3863);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("@");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-3314));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3314
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Feature.AllowSingleQuotes is false");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 0);
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
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 39, 39);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(68, charArray0, 300, 118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      SymbolTable symbolTable0 = new SymbolTable(21);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(21, (-753), (-753), symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 254);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      char[] charArray0 = new char[0];
      jSONReaderScanner0.matchField(charArray0);
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" /ZejO@u");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("SP9)");
      jSONReaderScanner0.putChar('_');
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
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 290, 26);
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
  public void test51()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("VL");
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2141, 509);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanDecimal('p');
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("XvX");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(0, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char[] charArray0 = jSONReaderScanner0.sub_chars(2784, 2784);
      assertEquals('@', jSONReaderScanner0.getCurrent());
      assertEquals(2784, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+_:1*)bH%$B`;]", (-2200));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1682), (-2200));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2200
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1), 83);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 270, 2);
      jSONReaderScanner0.nextIdent();
      assertEquals(0, jSONReaderScanner0.pos());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      int int0 = jSONReaderScanner0.indexOf('Z', 44);
      assertEquals('T', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("java.wt.Point");
      int int0 = jSONReaderScanner0.indexOf('P', 6);
      assertEquals(8, int0);
      assertEquals('j', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 270);
      jSONReaderScanner0.scanIdent();
      char char0 = jSONReaderScanner0.charAt(3863);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '!', 746);
      jSONReaderScanner0.scanFieldDate(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.matchField(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 254, 794);
      jSONReaderScanner0.matchField(charArray0);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals(20, jSONReaderScanner0.token());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '\u0093';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0093', 26);
      jSONReaderScanner0.matchField(charArray0);
      jSONReaderScanner0.next();
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.bytesValue();
      assertEquals(20, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L;^z)");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.putChar('1');
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
  public void test65()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(19, (-113), (-113), (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("XvX");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, (char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[0];
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }
}
