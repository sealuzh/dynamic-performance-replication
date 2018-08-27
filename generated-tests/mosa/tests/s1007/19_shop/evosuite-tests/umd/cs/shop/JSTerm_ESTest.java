/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:45:42 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.leftBrac = (-1705);
      jSTerm0.isGround();
      jSTerm0.makeConstant();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("h#nl.\"fe");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".(tg{f<FK].h6?");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
      jSTerm0.makeConstant();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.spliterator();
      JSJshopVars.verticalL = 41;
      jSTerm0.makeVariable();
      JSJshopVars.apostrophe = 96;
      jSTerm0.isGround();
      jSTerm0.isVariable();
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
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("#0_");
      JSTerm jSTerm0 = new JSTerm();
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
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isFunction());
      
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("([(this Collection)] )", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".(tg{f<FK].h6?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      jSTerm0.toStr();
      assertEquals((-2), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "S(");
      JSJshopVars.backquote = (-842);
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      jSTerm0.makeVariable();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSTerm0.makeConstant();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.matches(jSTerm0, (JSSubstitution) null);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT((JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
  public void test11()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "%%%");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      assertTrue(jSTerm0.isVariable());
      
      jSTerm0.call();
      jSTerm0.isConstant();
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.add((Object) jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) jSTerm0);
      jSTerm0.clear();
      JSTerm jSTerm2 = new JSTerm();
      Object[] objectArray0 = new Object[0];
      jSTerm2.toArray(objectArray0);
      jSTerm1.toStr();
      jSTerm2.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution0.ensureCapacity((-1));
      jSSubstitution0.add((Object) jSTerm2);
      JSTerm jSTerm3 = new JSTerm();
      JSJshopVars.colon = 44;
      Object object0 = new Object();
      jSSubstitution0.addElement(object0);
      Object object1 = new Object();
      // Undeclared exception!
      try { 
        jSTerm2.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      jSTerm0.stream();
      assertTrue(jSTerm0.isConstant());
      
      jSTerm0.call();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.add((Object) jSTerm0);
      jSTerm1.isGround();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      assertEquals(1, jSTerm0.size());
      assertFalse(jSTerm2.equals((Object)jSTerm0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2fA:!$cdU)^");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.matches(jSTerm1);
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = 'r';
      charArray0[2] = 'r';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertFalse(jSTerm0.isEval());
      assertNotSame(jSSubstitution1, jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "S(");
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm1.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "?t;1");
      StringReader stringReader0 = new StringReader("Y");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertEquals(1, jSTerm1.size());
      assertFalse(jSTerm1.isEval());
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = 'T';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm2.isVariable());
      assertFalse(jSTerm2.isFunction());
      
      boolean boolean1 = jSTerm1.isEval();
      assertFalse(jSTerm1.isFunction());
      assertTrue(boolean1 == boolean0);
      assertEquals("[?%%%]", jSTerm1.toString());
      assertNotSame(jSTerm1, jSTerm2);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n(tg{f<^FK].h6?");
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "n(tg{f<^FK].h6?");
      JSTerm jSTerm1 = jSTerm0.call();
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm2.equals(jSTerm0);
      assertFalse(boolean0);
      assertFalse(jSTerm2.isEval());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.isVariable();
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.print();
      jSTerm0.makeVariable();
      assertFalse(jSTerm0.isFunction());
      
      jSTerm0.makeConstant();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(2820);
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
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[2];
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      StringReader stringReader0 = new StringReader("%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      Object object0 = new Object();
      Object object1 = new Object();
      jSTerm0.add(object1);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.add((Object) jSTerm0);
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertEquals("[[(this Collection)], [(this Collection)]]", jSTerm1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = 'T';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.equals(jSTerm0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("([(this Collection)] )", stringBuffer0.toString());
      
      StringReader stringReader0 = new StringReader("%D%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isEval());
      assertEquals("[%D]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = 'T';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm0, jSSubstitution1);
      assertEquals(1, jSSubstitution1.size());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
      assertEquals("[?%%%]", jSTerm1.toString());
      assertTrue(jSSubstitution2.fail());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "S(");
      JSTerm jSTerm1 = jSTerm0.call();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(boolean0);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "S(");
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSSubstitution1.fail());
      assertEquals(0, jSSubstitution1.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSTerm0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertEquals("[[(this Collection)], [(this Collection)]]", jSTerm1.toString());
      assertFalse(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".(tg{f<FK].h6?");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      assertTrue(jSTerm0.isFunction());
      
      FileSystemHandling.shouldAllThrowIOExceptions();
      System.setCurrentTimeMillis(0L);
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")j>W',U|'");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      jSTerm0.parseList(streamTokenizer0);
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
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.add((Object) "S(");
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  public void test41()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }
}