/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 20:00:30 GMT 2018
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
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
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
      jSPredicateForm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      assertEquals(10, jSSubstitution0.capacity());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      LinkedList<JSPredicateForm> linkedList0 = new LinkedList<JSPredicateForm>();
      jSPredicateForm0.containsAll(linkedList0);
      jSPredicateForm0.print();
      // Undeclared exception!
      try { 
        jSPredicateForm0.clonePF();
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      LinkedList<JSPredicateForm> linkedList0 = new LinkedList<JSPredicateForm>();
      jSPredicateForm0.print();
      jSPredicateForm0.spliterator();
      jSPredicateForm0.clear();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm0, jSSubstitution0);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSJshopVars.leftPar = (-493);
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm();
      jSPredicateForm0.addAll((Collection) jSPredicateForm1);
      jSPredicateForm0.toStr();
      int int0 = 40;
      jSPredicateForm0.toStr();
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals(jSPredicateForm1);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(F)HR-5iHJ[O");
      assertEquals("[F]", jSPredicateForm0.toString());
      
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSPredicateForm jSPredicateForm1 = null;
      try {
        jSPredicateForm1 = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "dt3osw%k(f9`");
      jSTerm0.add((Object) "dt3osw%k(f9`");
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "rf4e{z'5o4");
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      assertFalse(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(F)-5iHJ[O");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.applySubstitutionPF(jSSubstitution0);
      jSPredicateForm1.print();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      char[] charArray0 = new char[2];
      charArray0[0] = 'U';
      charArray0[1] = '|';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm1 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm1.print();
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches(jSPredicateForm1);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(F)-5iHJ[O");
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("(F)", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.toArray(objectArray0);
      jSTerm0.add((Object) "dt3osw%k(f9`");
      JSSubstitution jSSubstitution0 = null;
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF((JSSubstitution) null);
      jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      jSPredicateForm0.toStr();
      jSTerm0.equals(jSPredicateForm0);
      jSPredicateForm0.standarizerPredicateForm();
      jSTerm0.print();
      jSTerm0.applySubstitutionPF((JSSubstitution) null);
      char[] charArray0 = new char[0];
      int int0 = 855;
      CharArrayReader charArrayReader0 = null;
      try {
        charArrayReader0 = new CharArrayReader(charArray0, 855, 855);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Object[] objectArray0 = new Object[20];
      objectArray0[0] = (Object) jSTerm0;
      objectArray0[1] = (Object) jSTerm0;
      objectArray0[2] = (Object) jSTerm0;
      jSTerm0.toArray(objectArray0);
      jSTerm0.add((Object) "dt3osw%k(f9`");
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF((JSSubstitution) null);
      jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
      
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.standarizerPredicateForm();
      jSTerm0.print();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSPredicateForm0);
      assertFalse(jSSubstitution0.fail());
      assertNotSame(jSPredicateForm0, jSPredicateForm1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(F)-5iHJ[O");
      System.setCurrentTimeMillis((-1L));
      JSPredicateForm jSPredicateForm1 = jSPredicateForm0.clonePF();
      assertNotSame(jSPredicateForm1, jSPredicateForm0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'k';
      charArray0[1] = '+';
      charArray0[2] = 'c';
      charArray0[3] = 'q';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(charArrayReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSPredicateForm0.print();
      assertEquals("[%%%]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "dt3osw%k(f9`");
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.add((Object) "dt3osw%k(f9`");
      jSTerm0.equals((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("dt3osw%k(f9`");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "dt3osw%k(f9`");
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.add((Object) "dt3osw%k(f9`");
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSTerm0.equals(jSPredicateForm0);
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm("(F)-5UiH\"J[O");
      assertEquals(10, jSPredicateForm1.capacity());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(jY[vtZ6k,C+");
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
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(:)-UQH\"JE");
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
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "x=");
      jSTerm0.iterator();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      jSTerm0.add((Object) "x=");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "x=");
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.add((Object) "x=");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}