/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:03:43 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add(0, (Object) "hlid3<rktj");
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isConstant());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add(0, (Object) "hlid3<rktj");
      jSTerm0.makeConstant();
      jSTerm0.standardizerTerm();
      assertEquals(1, jSTerm0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      jSTerm0.isVariable();
      assertFalse(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      boolean boolean0 = jSTerm0.isFunction();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm0.isConstant();
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      assertTrue(jSTerm0.isConstant());
      
      jSTerm0.call();
      assertFalse(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(jSTerm0);
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(false);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("failed substitution");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT((JSSubstitution) null);
      assertNotSame(jSTerm1, jSTerm0);
      assertEquals(1, jSTerm1.size());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
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
        jSTerm0.parseList((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      Integer integer0 = new Integer(63);
      jSTerm0.addElement(integer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object object0 = new Object();
      jSTerm0.add(object0);
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object object0 = new Object();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        jSTerm0.equals(jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add(0, (Object) "hlid3<rktj");
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSSubstitution1.fail());
      assertEquals(0, jSSubstitution1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      jSTerm0.cloneT();
      assertTrue(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isVariable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isConstant();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "tokenizer");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.add((Object) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.makeVariable();
      jSTerm0.call();
      assertTrue(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("dE{V@sP%zgW)m");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.call();
      assertTrue(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?.0laJv:w*%");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%]", jSTerm1.toString());
      assertFalse(jSSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(1700);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
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
      StringReader stringReader0 = new StringReader("?.|vV'j>@\":G4");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertEquals("[?%%%0]", jSTerm1.toString());
      assertTrue(jSTerm1.isVariable());
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("KAJf2g`}!h:)X");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      boolean boolean0 = jSTerm1.isGround();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isConstant());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isConstant());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(2);
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
  public void test33()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add(0, (Object) "hlid3<rktj");
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("(hlid3<rktj )", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Operator name expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isEval());
      assertEquals("Operator ", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      jSTerm0.toStr();
      assertTrue(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object object0 = jSTerm0.clone();
      jSTerm0.add(object0);
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.addElement(jSTerm0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      jSTerm1.makeVariable();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm1.makeVariable();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm1.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm0);
      assertFalse(jSSubstitution0.fail());
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      assertFalse(jSTerm0.isEval());
      assertNotSame(jSSubstitution1, jSSubstitution0);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSTerm1.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Expecting word as term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm1, (JSSubstitution) null);
      assertTrue(jSSubstitution0.fail());
      assertNotNull(jSSubstitution0);
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("failed substitution");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertNotSame(jSSubstitution1, jSSubstitution0);
      assertFalse(jSTerm0.isEval());
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(47);
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(1);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertTrue(jSTerm1.isFunction());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
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
  public void test48()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("MB V[y:#OK)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution0);
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm2.equals((Object)jSTerm1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(r0nHY)Y~f]\"");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      Object object0 = new Object();
      jSTerm0.add(object0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.addElement(jSTerm0);
      jSTerm0.print();
      assertTrue(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("the");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      jSTerm0.print();
      assertTrue(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("MB V[y:#OK)");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.print();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(" ");
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
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(OucV:m^tbi@&");
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
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(8_elpOo&X|8OxrF");
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
  public void test57()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(*BJ}D0/KG`");
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
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V (+a ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
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
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Expected (");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
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
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Vwwts(<'@S{Zsti");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      char[] charArray0 = new char[5];
      stringReader0.read(charArray0);
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
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader(".n0}^V,dg$l");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertEquals((-2), streamTokenizer0.ttype);
      assertNotSame(jSSubstitution0, jSSubstitution1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%j~BinQdW`yQ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals((-3), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%&C^ZE'dHuq{");
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
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
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
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Xch:S''/-}rOOP%tU");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
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
  public void test66()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("KAJf2g`}!h:)X");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isEval();
      assertFalse(boolean0);
  }
}
