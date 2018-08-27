/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:26:43 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      char[] charArray0 = new char[2];
      charArray0[0] = 'K';
      charArray0[1] = '<';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      LineNumberReader lineNumberReader0 = new LineNumberReader(charArrayReader0, 44);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(lineNumberReader0);
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
      char[] charArray0 = new char[3];
      charArray0[1] = ')';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, ')');
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("()j`AWp0;dM9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
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
      Object object0 = new Object();
      StringReader stringReader0 = new StringReader("member");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(jSTerm1.isConstant());
      assertEquals("[%%%]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.isGround();
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
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = locale0.stripExtensions();
      locale1.getDisplayLanguage();
      locale1.getUnicodeLocaleAttributes();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      Set<String> set0 = locale1.getUnicodeLocaleKeys();
      jSTerm0.removeAll(set0);
      JSJshopVars.minus = 0;
      jSTerm0.isGround();
      jSTerm0.makeFunction();
      jSTerm0.isEval();
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
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      jSTerm0.print();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT((JSSubstitution) null);
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      jSTerm0.print();
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Comparator<JSTerm> comparator0 = (Comparator<JSTerm>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSTerm0.sort(comparator0);
      jSSubstitution0.iterator();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      jSTerm0.print();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) jSTerm0);
      Predicate<Object> predicate1 = predicate0.negate();
      Predicate<Object> predicate2 = predicate0.or(predicate1);
      Predicate<Object> predicate3 = predicate2.and(predicate1);
      Object object1 = new Object();
      predicate1.test(object1);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.removeIf(predicate3);
      jSTerm1.makeVariable();
      jSTerm0.isFunction();
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
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      jSTerm0.print();
      jSTerm0.print();
      jSTerm0.isFunction();
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSTerm jSTerm2 = new JSTerm();
      JSJshopVars.percent = (-815);
      jSTerm2.equals(jSTerm0);
      jSTerm2.makeFunction();
      JSTerm jSTerm3 = null;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.add((Object) null);
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSSubstitution2.add((Object) null);
      jSSubstitution0.add((Object) null);
      JSTerm jSTerm4 = new JSTerm();
      jSTerm4.matches(jSTerm1, jSSubstitution0);
      jSTerm0.makeVariable();
      jSTerm4.makeEval(false);
      jSTerm0.makeEval(true);
      jSTerm1.isConstant();
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm2.matches((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSJshopVars.colon = 4169;
      char[] charArray0 = new char[9];
      charArray0[0] = '\\';
      charArray0[1] = '\\';
      charArray0[2] = '\\';
      charArray0[3] = '\\';
      charArray0[4] = '\\';
      charArray0[5] = '\\';
      charArray0[6] = '\\';
      charArray0[7] = '\\';
      charArray0[8] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
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
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = '?';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      assertTrue(jSTerm0.isVariable());
      
      jSTerm0.call();
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = '\\';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSSubstitution1.retainAll(jSSubstitution0);
      assertFalse(jSTerm0.isConstant());
      
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1, jSSubstitution1);
      assertFalse(jSTerm0.isEval());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSSubstitution2.isEmpty());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals(27, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.removeElement(object0);
      jSTerm0.insertElementAt(object0, 0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      
      jSTerm1.makeVariable();
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isConstant());
      
      JSTerm jSTerm2 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm2.isEval());
      assertFalse(jSTerm2.isVariable());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.insertElementAt(jSSubstitution0, 0);
      jSTerm0.print();
      Object object0 = new Object();
      jSTerm0.insertElementAt(object0, 0);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSJshopVars.minus = (-1);
      jSTerm0.matches(jSTerm1, jSSubstitution0);
      jSTerm1.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm1.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = new Object();
      jSTerm0.insertElementAt(object0, 0);
      jSTerm0.insertElementAt(object0, 0);
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
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSJshopVars.minus = (-1);
      JSTerm jSTerm2 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm2.isEmpty());
      
      boolean boolean0 = jSTerm2.equals(jSTerm0);
      assertFalse(jSTerm2.isFunction());
      assertTrue(boolean0);
      assertFalse(jSTerm2.isVariable());
      
      jSTerm0.isFunction();
      assertFalse(jSTerm0.isEval());
      assertNotSame(jSTerm0, jSTerm2);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("xZ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = ')';
      StringReader stringReader0 = new StringReader("% ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      JSSubstitution jSSubstitution3 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution3.fail());
      
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm2.makeConstant();
      JSSubstitution jSSubstitution4 = jSTerm0.matches(jSTerm2);
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSSubstitution4.fail());
      assertTrue(jSTerm2.isConstant());
      assertFalse(jSTerm2.isEval());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'D';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution2.fail());
      
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm2.makeConstant();
      JSSubstitution jSSubstitution3 = jSTerm0.matches(jSTerm2);
      assertFalse(jSSubstitution3.fail());
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm2.isEval());
      assertFalse(jSTerm2.isVariable());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("$(rLOdgO{7>P");
      char[] charArray0 = new char[1];
      charArray0[0] = ':';
      stringReader0.read(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("%e[RGpl");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.isEval();
      jSTerm1.makeConstant();
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEval());
      assertTrue(jSTerm1.isConstant());
      assertEquals("[%e]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = ',';
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("//)z4qs?P0Hbl5W0", 0);
      JSTerm jSTerm1 = jSTerm0.call();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("//)z4qs?P0Hbl5W0", 0);
      JSTerm jSTerm1 = jSTerm0.call();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertFalse(boolean0);
      
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      assertFalse(jSSubstitution0.fail());
      assertFalse(jSTerm1.isConstant());
      assertTrue(jSSubstitution0.isEmpty());
  }
}
