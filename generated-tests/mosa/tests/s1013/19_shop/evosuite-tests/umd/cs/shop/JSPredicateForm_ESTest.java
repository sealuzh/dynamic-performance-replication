/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:32:51 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.PipedInputStream;
import java.io.StreamTokenizer;
import java.util.Collection;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("expected '('");
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
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1e(>x)");
      assertFalse(jSPredicateForm0.isEmpty());
      
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1e(>x)");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches(jSPredicateForm1);
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
      assertFalse(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z^1$e(~)");
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = jSPredicateForm0.matches(jSPredicateForm1);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z^1$e(~)");
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(Z1e()", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1$e(>Nx)");
      boolean boolean0 = jSPredicateForm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z^1e(~)");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z^1$e(~)");
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) null);
      jSTerm0.matches((JSPredicateForm) jSTerm1);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertEquals(0, jSPredicateForm0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1$e(>Nx)");
      jSPredicateForm0.addElement("(Z1$e(>Nx)");
      // Undeclared exception!
      try { 
        jSPredicateForm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArrayReader0);
      jSTerm0.spliterator();
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.CharArrayReader cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertTrue(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1$e(>Nx)");
      jSPredicateForm0.print();
      assertFalse(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '5';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      Object object0 = new Object();
      UnaryOperator.identity();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.spliterator();
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSPredicateForm jSPredicateForm1 = (JSPredicateForm)jSPredicateForm0.clone();
      jSPredicateForm0.addAll((Collection) jSPredicateForm1);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(4Z^1$(~)");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "(Z1$ei!Nxu";
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Z1$ei!Nxu");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z^1$e(~)");
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      jSPredicateForm0.addAll((Collection) jSPredicateForm1);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(Z1$e(>Nx)");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'N';
      charArray0[1] = 'Y';
      charArray0[2] = 'n';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.standarizerPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
      assertNotSame(jSPredicateForm0, jSPredicateForm1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '9';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      jSTerm0.add((Object) pipedInputStream0);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PipedInputStream cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'u';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.add((Object) charArrayReader0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.CharArrayReader cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
