/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:51:25 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.lessT = 2394;
      jSTerm0.isGround();
      jSTerm0.makeFunction();
      jSTerm0.makeVariable();
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
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.colon = 1153;
      JSJshopVars.lessT = 124;
      jSTerm0.makeConstant();
      System.setCurrentTimeMillis(1644L);
      System.setCurrentTimeMillis(1644L);
      boolean boolean0 = jSTerm0.isFunction();
      assertTrue(jSTerm0.isConstant());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("- ");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0, 37);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pushbackReader0);
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
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSTerm1.print();
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      jSTerm0.isEval();
      jSTerm0.print();
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'z';
      charArray0[1] = 'Y';
      charArray0[2] = 'z';
      charArray0[3] = 'A';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isFunction());
      assertEquals("[%%%]", jSTerm1.toString());
      assertFalse(jSTerm1.isEval());
      assertTrue(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.interrogation = 60;
      StringReader stringReader0 = new StringReader("|l&gwQHmfH");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '1';
      charArray0[1] = '`';
      charArray0[2] = 'e';
      charArray0[3] = 'a';
      charArray0[4] = 'L';
      charArray0[5] = 'I';
      charArray0[6] = 'X';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm0.isEval());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\"';
      charArray0[1] = 'C';
      charArray0[0] = 'g';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jSTerm0.makeVariable();
      jSTerm0.makeConstant();
      System.setCurrentTimeMillis((-1));
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSJshopVars.whiteSpace = (-1121);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = jSTerm0.call();
      Predicate<JSSubstitution> predicate0 = Predicate.isEqual((Object) jSTerm0);
      Predicate<JSSubstitution> predicate1 = predicate0.negate();
      Predicate<JSSubstitution> predicate2 = predicate1.or(predicate0);
      predicate0.or(predicate2);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "uN^i> q7/;l");
      Predicate<JSSubstitution> predicate3 = predicate2.and(predicate1);
      jSTerm1.removeIf(predicate3);
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
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSTerm0.makeFunction();
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
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
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.makeEval(false);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = null;
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSTerm) null, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.makeEval(true);
      assertTrue(jSTerm1.isEval());
      
      boolean boolean0 = jSTerm0.isFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Integer integer0 = new Integer((-2));
      char[] charArray0 = new char[1];
      charArray0[0] = 'B';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(charArrayReader0);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer3 = new StreamTokenizer(charArrayReader0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertNotSame(jSTerm0, jSTerm1);
      assertEquals("[3.0]", jSTerm0.toString());
      assertEquals("3.0 ", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.matches(jSTerm0, jSSubstitution0);
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
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm1.makeEval(true);
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertTrue(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.ordinaryChars((-2577), 2147483645);
      Integer integer0 = new Integer((-4455));
      JSJshopVars.exclamation = 1;
      jSSubstitution0.add((Object) integer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.nextToken();
      streamTokenizer0.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jSTerm0.makeFunction();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSTerm0.toStr();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      boolean boolean0 = jSTerm0.isEval();
      assertTrue(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      char[] charArray0 = new char[5];
      charArray0[0] = 'D';
      charArray0[1] = 'C';
      charArray0[2] = '';
      charArray0[3] = 'G';
      charArray0[4] = 'O';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add(object0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      Consumer<InputStream> consumer0 = (Consumer<InputStream>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSSubstitution1.forEach(consumer0);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
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
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "#\"w");
      StringReader stringReader0 = new StringReader("%%%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.markSupported();
      streamTokenizer0.sval = streamTokenizer0.sval;
      streamTokenizer0.quoteChar(748);
      jSTerm0.isGround();
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
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      char[] charArray0 = new char[7];
      charArray0[0] = '?';
      charArray0[1] = '?';
      charArray0[2] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      jSTerm0.makeFunction();
      jSTerm0.isFunction();
      charArrayReader0.mark(960);
      jSTerm0.isGround();
      assertTrue(jSTerm0.isFunction());
      
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[4];
      charArray0[0] = '(';
      charArray0[1] = '?';
      charArray0[2] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.mark((-1163));
      charArrayReader0.ready();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
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
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      jSTerm0.makeEval(false);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("5F");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.isGround();
      JSTerm jSTerm2 = new JSTerm();
      StringReader stringReader1 = new StringReader("5F");
      PushbackReader pushbackReader0 = null;
      try {
        pushbackReader0 = new PushbackReader(stringReader1, (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add(object0);
      jSTerm1.makeFunction();
      jSTerm1.standardizerTerm();
      jSTerm1.makeEval(true);
      jSTerm1.print();
      MockFileReader mockFileReader0 = null;
      try {
        mockFileReader0 = new MockFileReader("notequal");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "#\"w");
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashStarComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.slash = (-2);
      JSJshopVars.equalT = (-2);
      streamTokenizer0.lowerCaseMode(false);
      jSTerm0.isEval();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSJshopVars.apostrophe = (-1903);
      UnaryOperator<JSSubstitution> unaryOperator0 = UnaryOperator.identity();
      Function.identity();
      jSTerm1.replaceAll(unaryOperator0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      streamTokenizer0.nextToken();
      streamTokenizer0.pushBack();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm0.print();
      // Undeclared exception!
      try { 
        jSTerm1.parseList(streamTokenizer0);
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
      Object object0 = new Object();
      Object object1 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*");
      StringReader stringReader0 = new StringReader("l>ZnP6=1=$<N4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.isGround();
      assertFalse(jSTerm1.isEval());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'p';
      charArray0[1] = 'Z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(bufferedReader0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      streamTokenizer0.ordinaryChar((-1880));
      streamTokenizer0.slashSlashComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
      jSTerm0.isFunction();
      jSTerm0.call();
      System.setCurrentTimeMillis((-865L));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Xo^;");
      StringReader stringReader0 = new StringReader(" Expecting word as term");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
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
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object object0 = new Object();
      jSTerm0.add((Object) null);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.makeEval(false);
      jSTerm0.equals(jSTerm1);
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm0.isEval();
      assertTrue(jSTerm0.isVariable());
      
      jSTerm2.print();
      assertFalse(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "#\"w");
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.slashStarComments(false);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSJshopVars.slash = (-2);
      JSJshopVars.equalT = (-2);
      streamTokenizer0.lowerCaseMode(false);
      streamTokenizer0.resetSyntax();
      jSTerm0.makeEval(true);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1);
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
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      streamTokenizer0.pushBack();
      jSSubstitution0.standarizerSubs();
      streamTokenizer0.pushBack();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.print();
      jSTerm1.makeVariable();
      jSTerm0.makeFunction();
      jSTerm0.equals(jSTerm0);
      streamTokenizer0.eolIsSignificant(true);
      JSTerm jSTerm2 = new JSTerm();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      StreamTokenizer streamTokenizer2 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm3 = null;
      try {
        jSTerm3 = new JSTerm(streamTokenizer2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Integer integer0 = new Integer((-2));
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer1.nextToken();
      streamTokenizer1.pushBack();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSTerm0.sort(comparator0);
      JSTerm jSTerm2 = null;
      try {
        jSTerm2 = new JSTerm(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      Object object1 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "*");
      StringReader stringReader0 = new StringReader("%%%");
      jSTerm0.makeEval(false);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm1.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      Object object1 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[4];
      charArray0[0] = '(';
      charArray0[1] = '-';
      charArray0[2] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
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
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[3];
      charArray0[0] = '(';
      charArray0[1] = '>';
      charArray0[2] = '(';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      streamTokenizer0.quoteChar(460);
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
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.trimToSize();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSTerm0.add((Object) null);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.makeEval(true);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "#\"w");
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Integer integer0 = new Integer(4434);
      jSSubstitution0.add((Object) null);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nextToken();
      streamTokenizer0.pushBack();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm2 = new JSTerm(streamTokenizer1);
      jSTerm2.print();
      JSTerm jSTerm3 = null;
      try {
        jSTerm3 = new JSTerm(streamTokenizer1);
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
      Object object0 = new Object();
      jSTerm0.add(object0);
      Object object1 = new Object();
      jSTerm0.add(object1);
      jSTerm0.clone();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[1];
      charArray0[0] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JSTerm jSTerm1 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      // Undeclared exception!
      try { 
        jSTerm1.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.add(object0);
      char[] charArray0 = new char[6];
      jSTerm0.stream();
      jSTerm0.add(0, (Object) charArray0);
      jSTerm0.isFunction();
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "#\"w");
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Integer integer0 = new Integer((-4455));
      jSSubstitution0.add((Object) integer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
      streamTokenizer1.pushBack();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      jSTerm0.makeVariable();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm1 = jSTerm0.call();
      JSTerm jSTerm2 = new JSTerm(streamTokenizer0);
      jSTerm2.matches(jSTerm0);
      jSTerm1.makeFunction();
      assertFalse(jSTerm0.isConstant());
      assertFalse(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("3e+q]M4'KCWN4s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Integer integer0 = new Integer((-4455));
      jSSubstitution0.add((Object) integer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader0);
      streamTokenizer1.nextToken();
      jSTerm1.print();
      jSTerm1.makeFunction();
      char[] charArray0 = new char[2];
      charArray0[0] = ' ';
      charArray0[1] = ' ';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      jSTerm2.toStr();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      Object object1 = new Object();
      char[] charArray0 = new char[3];
      charArray0[0] = '(';
      charArray0[1] = 'I';
      charArray0[2] = 'i';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      jSTerm0.clear();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
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
      Object object0 = new Object();
      jSTerm0.add(object0);
      jSTerm0.add(object0);
      jSTerm0.makeFunction();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeEval(true);
      jSTerm1.containsAll(jSTerm0);
      jSTerm0.matches((JSPredicateForm) jSTerm1);
      jSTerm1.parallelStream();
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }
}