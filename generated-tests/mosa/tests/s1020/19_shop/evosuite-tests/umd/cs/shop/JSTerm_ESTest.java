/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:32:40 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.ObjectStreamConstants;
import java.io.PushbackReader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Iterator;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.print();
      jSTerm0.makeConstant();
      jSTerm0.isFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.print();
      assertTrue(jSTerm0.isConstant());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[4];
      charArray0[1] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[4];
      charArray0[1] = ')';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.iterator();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.makeFunction();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(boolean0);
      
      jSTerm1.makeConstant();
      boolean boolean1 = jSTerm1.equals(jSTerm0);
      assertFalse(jSTerm1.isFunction());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "%%%");
      char[] charArray0 = new char[7];
      charArray0[1] = 'e';
      charArray0[2] = '\'';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(boolean0);
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.matches(jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.iterator();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeEval(false);
      assertFalse(jSTerm0.isEval());
      
      JSTerm jSTerm1 = jSTerm0.call();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.makeFunction();
      jSTerm0.equals(jSTerm1);
      jSTerm1.makeConstant();
      JSTerm jSTerm2 = jSTerm1.call();
      jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = ' ';
      charArray0[1] = 'D';
      charArray0[2] = '{';
      charArray0[3] = 'l';
      charArray0[4] = ' ';
      charArray0[5] = ' ';
      charArray0[6] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.skip((-1L));
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm0.isFunction();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertTrue(boolean0);
      
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm2);
      assertTrue(jSSubstitution0.fail());
      
      jSTerm0.makeConstant();
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm0.isVariable());
      assertTrue(jSTerm0.isConstant());
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.print();
      StringReader stringReader0 = new StringReader("%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertTrue(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      UnaryOperator.identity();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      jSTerm0.makeFunction();
      jSTerm0.isFunction();
      jSTerm0.makeFunction();
      StringReader stringReader0 = new StringReader("JSTerm: Error reading control parameters: ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.matches(jSTerm1);
      assertTrue(jSTerm0.isFunction());
      
      StringBuffer stringBuffer0 = jSTerm1.toStr();
      assertEquals(8, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isFunction();
      jSTerm0.makeFunction();
      jSTerm0.removeAllElements();
      jSTerm0.makeConstant();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isConstant());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSSubstitution0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("([] )", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement(jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[4];
      charArray0[1] = '<';
      charArray0[2] = 'b';
      charArray0[3] = 'b';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      charArrayReader0.skip(0L);
      streamTokenizer0.nextToken();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.setSize(60);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.print();
      JSTerm jSTerm1 = jSTerm0.call();
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeFunction();
      jSTerm0.matches(jSTerm0);
      assertTrue(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.clear();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0087';
      charArray0[1] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0087';
      charArray0[1] = '?';
      charArray0[2] = '\u0087';
      charArray0[3] = '\u0087';
      charArray0[6] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      boolean boolean0 = jSTerm0.isGround();
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isFunction());
      assertFalse(boolean0);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0087';
      charArray0[1] = '?';
      charArray0[2] = '\u0087';
      charArray0[3] = '\u0087';
      charArray0[4] = ' ';
      charArray0[6] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.nextToken();
      charArrayReader0.skip(0L);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      jSTerm2.isFunction();
      jSTerm1.matches(jSTerm2);
      jSTerm1.makeConstant();
      jSTerm2.print();
      jSTerm2.makeVariable();
      assertTrue(jSTerm2.isVariable());
      assertTrue(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(1306);
      jSTerm0.spliterator();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm0.makeFunction();
      jSTerm0.makeVariable();
      jSTerm0.parallelStream();
      jSTerm0.print();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeEval(true);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0087';
      charArray0[1] = '?';
      charArray0[2] = '\u0087';
      charArray0[3] = '\u0087';
      charArray0[6] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.nextToken();
      charArrayReader0.skip((-3L));
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.spliterator();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%0]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      Object object0 = new Object();
      jSTerm1.add(object0);
      jSTerm0.makeFunction();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertTrue(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) jSTerm0);
      Object object0 = new Object();
      jSTerm1.add(object0);
      char[] charArray0 = new char[7];
      charArray0[0] = '%';
      charArray0[6] = ' ';
      charArray0[2] = 'E';
      charArray0[3] = 'c';
      charArray0[4] = 'W';
      charArray0[5] = '/';
      charArray0[6] = 'G';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      PushbackReader pushbackReader0 = new PushbackReader(charArrayReader0);
      PushbackReader pushbackReader1 = new PushbackReader(pushbackReader0, 1306);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pushbackReader1);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.makeFunction();
      jSTerm0.matches(jSTerm2);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm1.add((Object) jSTerm0);
      boolean boolean0 = jSTerm1.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Iterator iterator0 = jSTerm0.iterator();
      jSTerm0.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm0.add((Object) iterator0);
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Vector$Itr cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      UnaryOperator.identity();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.equals(jSTerm1);
      char[] charArray0 = new char[8];
      charArray0[0] = '+';
      charArray0[1] = 'm';
      charArray0[2] = ' ';
      charArray0[3] = ')';
      charArray0[4] = '+';
      charArray0[5] = 'i';
      charArray0[6] = ' ';
      charArray0[7] = 't';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.nextToken();
      JSTerm jSTerm2 = new JSTerm();
      jSTerm1.parseList(streamTokenizer0);
      JSTerm jSTerm3 = null;
      try {
        jSTerm3 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeEval(true);
      jSTerm0.print();
      assertFalse(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm1.makeFunction();
      jSTerm1.makeVariable();
      jSTerm1.parallelStream();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      jSTerm1.makeConstant();
      assertTrue(jSTerm1.isConstant());
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm0.makeVariable();
      jSTerm0.makeEval(true);
      assertTrue(jSTerm0.isVariable());
      
      JSTerm jSTerm1 = jSTerm0.call();
      boolean boolean0 = jSTerm1.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "JSTerm: Error reading control parameters: ");
      jSTerm0.makeVariable();
      jSTerm0.parallelStream();
      assertFalse(jSTerm0.isConstant());
      
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm2, jSSubstitution0);
      assertFalse(jSTerm0.isFunction());
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.add((Object) "STerm: Error readig control parameters: ");
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[4];
      charArray0[0] = '(';
      charArray0[1] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[4];
      charArray0[0] = '(';
      charArray0[1] = '-';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[3];
      charArray0[0] = '(';
      charArray0[1] = '+';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.ready();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }
}
