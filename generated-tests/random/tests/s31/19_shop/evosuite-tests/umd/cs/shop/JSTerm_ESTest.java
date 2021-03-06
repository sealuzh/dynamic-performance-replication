/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:28:23 GMT 2019
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
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertFalse(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?y&!HNsBHi+e]$.th");
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
  public void test04()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isVariable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("xZff&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      boolean boolean0 = jSTerm0.isEval();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4.0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.isConstant();
      assertTrue(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kn|8G;a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals("[%%%]", jSTerm0.toString());
      
      jSTerm0.removeAllElements();
      jSTerm0.call();
      assertTrue(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(false);
      assertEquals((-2), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm0);
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertEquals(1.0, streamTokenizer0.nval, 0.01);
      assertFalse(jSSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.setSize(41);
      // Undeclared exception!
      try { 
        jSTerm1.standardizerTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
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
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("GRnbJ^kf_");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      jSTerm0.setSize(91);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(boolean0);
      assertTrue(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertTrue(boolean0);
      assertFalse(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0!B");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertEquals((-2), streamTokenizer0.ttype);
      assertEquals("Token[n=0.0], line 1", streamTokenizer0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t`ihp");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertEquals(0, jSSubstitution1.size());
      assertNotSame(jSSubstitution1, jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("kn|8G;a");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm1.isConstant());
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isFunction());
      assertNotSame(jSTerm1, jSTerm0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">B^RxIt");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertEquals("[%%%]", jSTerm0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("");
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
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0!B");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isFunction();
      assertEquals((-2), streamTokenizer0.ttype);
      assertEquals("Token[n=0.0], line 1", streamTokenizer0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isVariable();
      assertEquals(1.0, streamTokenizer0.nval, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isConstant();
      assertEquals(1.0, streamTokenizer0.nval, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isEval();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeConstant();
      assertEquals((-2), streamTokenizer0.ttype);
      assertEquals("Token[n=1.0], line 1", streamTokenizer0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.call();
      assertEquals(41, streamTokenizer0.ttype);
      assertEquals(10, jSTerm2.capacity());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(LAB=il]a[)FYbC");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm0.isEval());
      
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals(10, jSTerm1.capacity());
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0!B");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals((-2), streamTokenizer0.ttype);
      assertTrue(jSTerm1.equals((Object)jSTerm0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(true);
      // Undeclared exception!
      try { 
        jSTerm0.call();
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
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm2.equals((Object)jSTerm1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
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
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isVariable());
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEmpty());
      assertTrue(jSTerm1.isConstant());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(LAB=il]a[)FYbC");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertNotSame(jSTerm1, jSTerm0);
      assertTrue(boolean0);
      assertFalse(jSTerm1.isEval());
      assertTrue(jSTerm1.isFunction());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">B^RxIt");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeFunction();
      Object object0 = jSTerm0.clone();
      jSTerm0.add(object0);
      boolean boolean0 = jSTerm0.isGround();
      assertEquals("[%%%, [%%%]]", jSTerm0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t`ihp");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("0.0");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add(1, (Object) "0.0");
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t`ihp");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isEval());
      assertEquals(4, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(LAB=il]a[)FYbC");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertEquals("(LAB=il]a[ )", stringBuffer0.toString());
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
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
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals(jSTerm1);
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      StringReader stringReader0 = new StringReader("t^OfT)?B`Z8");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals(jSTerm0);
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm1);
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSTerm jSTerm2 = jSTerm0.parseList(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertEquals(41, streamTokenizer0.ttype);
      assertNotSame(jSSubstitution0, jSSubstitution1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JSTerm: Error reading control parameters: ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1 G+{s^$9;KB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0);
      jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertEquals((-2), streamTokenizer0.ttype);
      assertEquals("Token[n=1.0], line 1", streamTokenizer0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSTerm0.isEval());
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.cloneT();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm2.equals((Object)jSTerm1));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("j[,");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement(stringReader0);
      jSTerm0.makeFunction();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringReader cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("xZff&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.makeEval(true);
      jSTerm0.makeFunction();
      jSTerm0.print();
      assertTrue(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G2nkr>-lzY^XS)p'EO");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      stringReader0.read();
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.print();
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader(".");
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
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(V`0B/n(i4\" )t$0");
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
      StringReader stringReader0 = new StringReader("(a_q}ia");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
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
      StringReader stringReader0 = new StringReader("(*uCk");
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
      StringReader stringReader0 = new StringReader("8( <o88A[F1xyn?");
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
      StringReader stringReader0 = new StringReader("(");
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
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-J(7 ^zEBN-y");
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
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%");
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
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%qu~*l6v2meBI");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSTerm0.matches(jSTerm1);
      assertEquals((-3), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?k#VM1)gsh:~oi");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertEquals("[?kVM1]", jSTerm0.toString());
      assertFalse(jSTerm0.isConstant());
      assertFalse(jSTerm0.isEval());
      assertFalse(jSTerm0.isFunction());
      assertTrue(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(>j^bZ*>ME^v*_<");
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
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2E78)|}a7n]");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm1.applySubstitutionT(jSSubstitution0);
      assertEquals(41, streamTokenizer0.ttype);
      assertFalse(jSTerm0.isVariable());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
}
