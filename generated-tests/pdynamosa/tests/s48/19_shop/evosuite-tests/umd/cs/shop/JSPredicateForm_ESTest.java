/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 12:30:27 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
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
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "not");
      StringReader stringReader0 = new StringReader("pNU`V'");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "7.0");
      StringReader stringReader0 = new StringReader("7.0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.add((Object) null);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("s");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(-i-t'y'&bW;m;");
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
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSPredicateForm0.print();
      assertEquals("[Expecting, [Expecting]]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(nQydz^)N");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
      assertFalse(jSPredicateForm0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("U%bAPM");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm0.matches(jSPredicateForm0, jSSubstitution1);
      assertEquals("[%%%, [%%%]]", jSPredicateForm0.toString());
      assertEquals(1, jSSubstitution2.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm0, (JSSubstitution) null);
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
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF((JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
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
  public void test12()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("not");
      linkedList0.add("not");
      jSPredicateForm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("HQhKtdQz5n#~OihjbB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.setSize(1472);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("m$@mzJzI5!!@");
      linkedList0.add("Oot");
      jSTerm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
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
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) null, jSSubstitution0);
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
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "noC");
      jSTerm0.add((Object) "noC");
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("l2]#$wbk5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) "l2]#$wbk5");
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
  public void test20()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("");
      jSPredicateForm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.clonePF();
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
      StringReader stringReader0 = new StringReader("not");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "not");
      StringReader stringReader0 = new StringReader("pNU`V'");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPredicateForm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertEquals(2, jSTerm0.size());
      assertEquals("[not, [%%%]]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("m$@mzJzI5!!@");
      linkedList0.remove();
      linkedList0.add("not");
      jSTerm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("not");
      jSPredicateForm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.equals(jSPredicateForm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("l2]#$wbk5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      boolean boolean0 = jSTerm0.equals(jSPredicateForm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("not");
      jSPredicateForm0.addAll((Collection) linkedList0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2.M0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm1);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("m$@mzJzI5!!@");
      linkedList0.remove();
      linkedList0.add("not");
      jSTerm0.addAll((Collection) linkedList0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "not");
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(21, stringBuffer0.length());
      assertEquals("[Expecting, [Expecting]]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("Operator name expected");
      linkedList0.add("Operator name expected");
      jSPredicateForm0.addAll((Collection) linkedList0);
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
  public void test38()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("not");
      jSPredicateForm0.addAll((Collection) linkedList0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertEquals(0, jSPredicateForm0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(NUtDq' ' -3X;");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringReader stringReader0 = new StringReader("(nQydz^)N");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
      assertEquals(10, jSPredicateForm0.capacity());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("()}Nna{J,");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Expecting variable name in term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(Ipcr}4pF'f0@q");
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
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bhq}}N$\"[4i@E`");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm0);
      assertFalse(jSSubstitution0.fail());
  }
}