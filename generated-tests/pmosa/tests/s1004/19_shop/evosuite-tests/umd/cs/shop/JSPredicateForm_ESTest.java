/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 00:18:56 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.PushbackReader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "umd.cs.shop.JSPredicateForm";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("umd.cs.shop.JSPredicateForm");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      int int0 = (-1);
      char[] charArray0 = new char[8];
      charArray0[0] = '|';
      charArray0[1] = 'I';
      charArray0[2] = '?';
      charArray0[3] = 'k';
      charArray0[4] = '3';
      charArray0[5] = 'l';
      charArray0[6] = 'h';
      charArray0[7] = 'c';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      PushbackReader pushbackReader0 = new PushbackReader(charArrayReader0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pushbackReader0);
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
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
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches(jSPredicateForm1);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(I)Z@}");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(I)Z@}");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(I)Z@}");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(I)Z@}");
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(3, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      boolean boolean0 = jSPredicateForm0.equals(jSPredicateForm1);
      assertTrue(boolean0);
      
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(k)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(I)Z@}");
      jSPredicateForm0.setSize(344);
      System.setCurrentTimeMillis(0L);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.print();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(v,0NItzd}");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(?{v,NItd}");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.matches((JSPredicateForm) jSTerm0);
      jSTerm0.matches((JSPredicateForm) jSTerm0);
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      jSTerm0.print();
      assertFalse(jSTerm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k)Gi#WL1pRW");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0);
      assertFalse(jSSubstitution1.fail());
  }
}