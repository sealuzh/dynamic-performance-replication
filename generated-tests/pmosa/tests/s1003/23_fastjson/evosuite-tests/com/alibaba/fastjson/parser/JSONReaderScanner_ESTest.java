/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 23:34:31 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.CharArrayReader;
import java.io.StringReader;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("WriteMapNullValue");
      jSONReaderScanner0.next();
      jSONReaderScanner0.next();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-1618), charArray0, 82, 70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 0);
      char[] charArray0 = new char[9];
      charArray0[0] = 'v';
      charArray0[1] = 'u';
      charArray0[2] = 'A';
      charArray0[3] = 'Z';
      charArray0[4] = 'X';
      charArray0[5] = 'N';
      charArray0[6] = 'u';
      charArray0[7] = 'Z';
      charArray0[8] = '9';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(0, (-893), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '$';
      charArray0[1] = '3';
      charArray0[2] = '=';
      int int0 = 0;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      jSONReaderScanner0.charAt(0);
      jSONReaderScanner0.bytesValue();
      int int1 = 0;
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
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.bytesValue();
      int int0 = jSONReaderScanner0.indexOf('u', 653);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
      jSONReaderScanner0.stringVal();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-3495), 71);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'X';
      charArray0[1] = '(';
      charArray0[2] = '6';
      charArray0[3] = '8';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2727);
      jSONReaderScanner0.sub_chars(2727, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue(false);
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
      jSONReaderScanner0.pos = (-3495);
      jSONReaderScanner0.intValue();
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
      jSONReaderScanner0.scanFieldDate(charArray0);
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      int int0 = 1814;
      int int1 = (-722);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1814, (-722));
      int int2 = 3;
      jSONReaderScanner0.matchField(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(1814, charArray0, (-722), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("SortFeidFastMatch", 0);
      char[] charArray0 = new char[9];
      charArray0[0] = 'f';
      charArray0[1] = 'U';
      charArray0[2] = 'T';
      charArray0[3] = 'C';
      charArray0[4] = 's';
      charArray0[5] = 'i';
      charArray0[6] = '[';
      charArray0[7] = 'p';
      charArray0[8] = '\"';
      jSONReaderScanner0.scanFieldFloatArray(charArray0);
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.subString(0, 182);
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
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.isBlankInput();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(44, (-2402));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2402
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
      jSONReaderScanner0.isBlankInput();
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      
      jSONReaderScanner0.close();
      assertEquals('n', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'l';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(3165, (-2317));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2317
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
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
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-2415));
      char[] charArray0 = new char[4];
      charArray0[0] = 'V';
      charArray0[1] = 'H';
      jSONReaderScanner0.scanLong('H');
      charArray0[2] = '=';
      charArray0[3] = 'L';
      jSONReaderScanner0.scanFieldFloat(charArray0);
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
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'E';
      charArray0[1] = 'E';
      charArray0[2] = 'E';
      stringReader0.read(charArray0);
      jSONReaderScanner0.scanDecimal('E');
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("mLQ=s1rLGT");
      jSONReaderScanner0.isBlankInput();
      jSONReaderScanner0.stringVal();
      char char0 = jSONReaderScanner0.charAt(1842);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      SymbolTable symbolTable0 = new SymbolTable(16384);
      String string0 = jSONReaderScanner0.addSymbol(0, 3, 0, symbolTable0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("xbN7dj20=/sd[");
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.longValue();
      int int0 = (-2014);
      jSONReaderScanner0.scanBoolean('B');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.doubleValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Si:Z");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      boolean boolean1 = jSONReaderScanner0.isEOF();
      assertTrue(boolean1 == boolean0);
      
      byte[] byteArray0 = jSONReaderScanner0.bytesValue();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals('S', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.putChar(' ');
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
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[1];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "|+ab+EZ");
      charArray0[0] = '(';
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)114;
      byteArray0[1] = (byte) (-22);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-60);
      byteArray0[4] = (byte)98;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.ready();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArrayReader0);
      jSONReaderScanner0.sp = 16;
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.sub_chars(16, 16);
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
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26);
      jSONReaderScanner0.scanFieldDate(charArray0);
      jSONReaderScanner0.close();
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
      jSONReaderScanner0.nextToken(122);
      jSONReaderScanner0.stringVal();
      assertEquals(9, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Ws:p.Se4gl\"");
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONReaderScanner0.putChar('[');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('W', jSONReaderScanner0.getCurrent());
      assertEquals("W", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("7");
      jSONReaderScanner0.nextToken((-1));
      assertEquals(2, jSONReaderScanner0.token());
      
      jSONReaderScanner0.decimalValue();
      assertTrue(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '4';
      charArray0[1] = '#';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 1522);
      jSONReaderScanner0.nextToken(1);
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.sub_chars(2945, 1);
      assertEquals(2, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("new", (-3495));
      char[] charArray0 = new char[8];
      charArray0[0] = 'i';
      jSONReaderScanner0.sbuf = charArray0;
      charArray0[1] = '`';
      charArray0[2] = 'C';
      charArray0[3] = '[';
      charArray0[4] = '*';
      charArray0[5] = 'b';
      charArray0[6] = 'U';
      charArray0[7] = '{';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 362, 122);
      jSONReaderScanner1.nextToken(362);
      assertEquals(1, jSONReaderScanner1.token());
      
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.sub_chars(1662, 158);
      jSONReaderScanner0.indexOf('u', 1662);
      assertTrue(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("9#SZh6)}M^<");
      jSONReaderScanner0.nextToken(42);
      int int0 = jSONReaderScanner0.indexOf('r', 16);
      assertEquals(2, jSONReaderScanner0.token());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '4';
      charArray0[1] = '#';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 741, 1522);
      jSONReaderScanner0.scanFieldUUID(charArray0);
      jSONReaderScanner0.nextToken(741);
      jSONReaderScanner0.scanFieldDate(charArray0);
      jSONReaderScanner0.numberString();
      jSONReaderScanner0.stringVal();
      SymbolTable symbolTable0 = new SymbolTable(741);
      jSONReaderScanner0.addSymbol(741, 1522, 1, symbolTable0);
      jSONReaderScanner0.bytesValue();
      char char0 = jSONReaderScanner0.charAt(1522);
      assertEquals('#', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'g';
      int int0 = 2426;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2426);
      jSONReaderScanner0.hasSpecial = true;
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.next();
      char[] charArray1 = new char[9];
      charArray1[0] = 'g';
      jSONReaderScanner0.nextIdent();
      charArray1[1] = '\u001A';
      charArray1[2] = '\u001A';
      charArray1[3] = 'g';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.integerValue();
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
      char[] charArray0 = new char[2];
      charArray0[0] = '!';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '!');
      jSONReaderScanner0.scanDouble('K');
      jSONReaderScanner0.matchField(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.nextToken((int) '!');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // EOF error
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO : ");
      jSONReaderScanner0.scanBoolean('^');
      jSONReaderScanner0.nextToken(760);
      Locale locale0 = Locale.KOREAN;
      jSONReaderScanner0.locale = locale0;
      jSONReaderScanner0.charAt(77);
      char[] charArray0 = new char[1];
      charArray0[0] = '\u001A';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 2280, 163);
      jSONReaderScanner1.nextToken((-1));
      assertEquals("", jSONReaderScanner1.info());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("UseISO8601DateFormat");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      char[] charArray0 = new char[8];
      charArray0[0] = 'L';
      charArray0[1] = 'L';
      charArray0[2] = 'L';
      charArray0[3] = 'L';
      charArray0[4] = '|';
      charArray0[5] = 'L';
      charArray0[6] = 'L';
      charArray0[7] = 'L';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 1129);
      jSONReaderScanner1.nextToken(0);
      assertEquals(1, jSONReaderScanner1.token());
      
      jSONReaderScanner1.scanIdent();
      MockDate mockDate0 = new MockDate(1129, 0, 1129);
      String string0 = jSONReaderScanner1.numberString();
      assertEquals("LL", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Ws:p.Se4gl\"");
      jSONReaderScanner0.bp = 2;
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONReaderScanner0.putChar('[');
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanString();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("4eQFC2@AIrTQM%si,;");
      jSONReaderScanner0.nextToken(2699);
      jSONReaderScanner0.charAt(2721);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("4e,FC(@AIr5QM%si,;");
      jSONReaderScanner0.nextToken(2686);
      jSONReaderScanner0.charAt(2721);
      jSONReaderScanner0.numberString();
      char char0 = jSONReaderScanner0.next();
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("N.6lpC%%Zwz~FQc4");
      char[] charArray0 = new char[3];
      charArray0[0] = 'N';
      charArray0[1] = 'L';
      charArray0[2] = ',';
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 39, (-1408));
      jSONReaderScanner1.nextToken((-1408));
      // Undeclared exception!
      try { 
        jSONReaderScanner1.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" '\"UWO@");
      jSONReaderScanner0.isBlankInput();
      char[] charArray0 = new char[8];
      charArray0[0] = '4';
      charArray0[1] = '/';
      charArray0[2] = ']';
      charArray0[3] = 'Y';
      charArray0[4] = '^';
      charArray0[5] = 'V';
      charArray0[6] = '+';
      charArray0[7] = '*';
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(381, 381, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}