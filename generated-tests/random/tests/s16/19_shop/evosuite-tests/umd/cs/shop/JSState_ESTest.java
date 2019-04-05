/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:02:42 GMT 2019
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
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSListSubstitution;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTasks;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.setSize(1217);
      jSState0.addElementsToState(jSPlan0);
      assertFalse(jSState0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies((JSListLogicalAtoms) null, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("?6l5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.addElementsToState(jSState1);
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState1.applyOp(jSOperator0, jSSubstitution0, jSState0, jSState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) null);
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSState jSState0 = new JSState();
      jSState0.add((Object) null);
      StringReader stringReader0 = new StringReader("k|</3iKx<");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
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
      JSState jSState0 = new JSState();
      JSTasks jSTasks0 = new JSTasks();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSTasks0, (JSSubstitution) null, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, jSSubstitution0, jSState0, jSState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("' ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState0 = null;
      try {
        jSState0 = new JSState(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSListLogicalAtoms", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("?6l5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.flagLevel = 1203;
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSState0.addElementsToState(jSState1);
      JSListSubstitution jSListSubstitution0 = jSState1.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      assertFalse(jSState0.isEmpty());
      assertFalse(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("?6l5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.addElementsToState(jSState1);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSState0.satisfiesTAm(jSPredicateForm0, jSSubstitution0);
      assertFalse(jSState0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("?6l5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSState0.addElementsToState(jSState1);
      JSListSubstitution jSListSubstitution0 = jSState1.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      assertFalse(jSState0.isEmpty());
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("?6l5");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.flagLevel = 1203;
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSState1, jSSubstitution0, jSListAxioms0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSState jSState0 = new JSState();
      jSState0.addElementsToState(jSState0);
      assertEquals("", jSState0.Label());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }
}
