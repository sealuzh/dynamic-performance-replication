/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:47:37 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayReader;
import java.io.StreamTokenizer;
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
        jSPredicateForm0 = new JSPredicateForm("P0h");
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
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      assertEquals(10, jSPredicateForm0.capacity());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArray0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.toStr();
      jSPredicateForm0.print();
      assertEquals(0, jSPredicateForm0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArray0);
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "(Sj2y");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm0);
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 's';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.print();
      assertFalse(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[23];
      charArray0[4] = 'z';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSPredicateForm0);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(Pb(-@jl|");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      CharArrayReader charArrayReader1 = new CharArrayReader(charArray0);
      charArrayReader1.read(charArray0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.standarizerPredicateForm();
      jSPredicateForm0.toStr();
      jSPredicateForm0.addElement(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
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
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(?Sj2y");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches((JSPredicateForm) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm1.standarizerPredicateForm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      streamTokenizer0.wordChars(1, 1134);
      charArrayReader0.read(charArray0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.add((Object) streamTokenizer0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArray0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[11];
      charArray0[0] = 'O';
      charArray0[1] = 'O';
      charArray0[6] = ' ';
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
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'h';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) charArray0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'O';
      charArray0[1] = 'O';
      charArray0[8] = 'O';
      charArray0[3] = ' ';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }
}
