/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:15:43 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "not");
      Object object0 = jSTerm0.clone();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(bR@s~^\r1[RQ-)iKq");
      JSPredicateForm jSPredicateForm1 = new JSPredicateForm("(bR@s~^\r1[RQ-)iKq");
      boolean boolean0 = jSPredicateForm0.equals(jSPredicateForm1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%V($b_h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("not");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.add((Object) jSTerm1);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
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
      jSTerm0.addElement("not");
      jSTerm0.add((Object) null);
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
  public void test05()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object object0 = new Object();
      jSSubstitution0.add(object0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.applySubstitutionPF((JSSubstitution) null);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSPredicateForm0);
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
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZy7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6N.-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.addElement("6.0");
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
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "nog");
      jSTerm0.add((Object) "nog");
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
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZy7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.addElement((Object) null);
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0, (JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "no:");
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      jSTerm0.addElement(jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSPredicateForm cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches(jSPredicateForm0);
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
      StringReader stringReader0 = new StringReader("9");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%V($b_h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6N.-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringReader cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZy7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "nog");
      jSTerm0.addElement("nog");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
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
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("Kot");
      StringReader stringReader0 = new StringReader("Kot");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(33);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSPredicateForm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("not");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.addElement("not");
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
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZyUk7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSTerm0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "nMt");
      jSTerm0.add((Object) jSTerm0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZyUk7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6N.-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      jSTerm0.add((Object) jSPredicateForm0);
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertEquals("[6.0, [6.0]]", jSTerm0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(bs~^\rU1[RQ-)iKq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSPredicateForm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZyUk7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm1.addElement(jSTerm0);
      JSSubstitution jSSubstitution0 = jSTerm1.matches((JSPredicateForm) jSTerm0);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZyUk7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSTerm0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) jSTerm0);
      assertFalse(jSSubstitution0.fail());
      assertTrue(boolean0);
      assertEquals("[8.0, [8.0]]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%V(Gb_h");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(jSTerm0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      assertEquals("[%V, [%V]]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("8udZy7g>cKU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.addElement(jSTerm0);
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(9, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "nog");
      StringReader stringReader0 = new StringReader("nog");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm1);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.print();
      assertEquals("[nog, [%%%]]", jSPredicateForm0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.addElement("not");
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
  public void test41()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertEquals(10, jSPredicateForm0.capacity());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(cc#9GF6I=,B=I l");
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
        jSPredicateForm0 = new JSPredicateForm("(DlV#oc{S");
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
      StringReader stringReader0 = new StringReader("(bR@s~^\rU1[RQ-)iKq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
  public void test45()  throws Throwable  {
      JSJshopVars.leftPar = (-2);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("61.0");
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
  public void test47()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertEquals(0, jSPredicateForm0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(bs~^\rU1[RQ-)iKq");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
