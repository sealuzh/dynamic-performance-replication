/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:20:19 GMT 2019
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
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?cDm6");
      JSJshopVars.flagLevel = 746;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSState0.addElements(jSState1);
      JSListLogicalAtoms jSListLogicalAtoms0 = jSState0.applySubstitutionListLogicalAtoms(jSSubstitution0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSListLogicalAtoms0, jSSubstitution0, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 7;
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals(10, jSListSubstitution0.capacity());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.setSize(1143);
      jSPlan0.add((Object) jSState0);
      jSState0.addElementsToState(jSPlan0);
      assertEquals("[null, (this Collection)]", jSState0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
      assertEquals(10, jSListSubstitution0.capacity());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSListAxioms0.add((Object) jSState0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSPlan0, (JSSubstitution) null, jSListAxioms0);
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
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSState0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals("[[[]]]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll((JSListLogicalAtoms) null, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSState0, jSSubstitution0, (JSListAxioms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSListAxioms0.add((Object) jSState0);
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSSubstitution", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSPlan0);
      jSState0.addElementsToState(jSPlan0);
      JSOperator jSOperator0 = new JSOperator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
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
  public void test12()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      // Undeclared exception!
      try { 
        jSState0.applyOp((JSOperator) null, (JSSubstitution) null, jSPlan0, jSState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) null);
      // Undeclared exception!
      try { 
        jSState0.applyOp((JSOperator) null, jSSubstitution0, jSState0, jSState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSPlan0);
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSState jSState0 = new JSState();
      jSState0.add((Object) null);
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTerm0, (JSSubstitution) null);
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
      JSState jSState0 = new JSState();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTaskAtom0.add((Object) jSState0);
      jSState0.add((Object) jSTaskAtom0);
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTaskAtom0, (JSSubstitution) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSState cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSState0, jSSubstitution0, (JSListAxioms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSPlan0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSListAxioms jSListAxioms0 = jSPlanningDomain0.axioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSPlan cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies((JSListLogicalAtoms) null, (JSSubstitution) null, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSPlan0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSPlan cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSOperator jSOperator0 = new JSOperator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, jSSubstitution0, (JSListLogicalAtoms) null, (JSListLogicalAtoms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSState jSState0 = new JSState();
      // Undeclared exception!
      try { 
        jSState0.addElementsToState((JSListLogicalAtoms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
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
  public void test25()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.flagLevel = 746;
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "?cDm6");
      jSState0.add((Object) jSTerm0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals("[[]]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) "?cDm6");
      jSState0.add((Object) jSTerm0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSTerm jSTerm0 = new JSTerm();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSTerm0.add((Object) jSTaskAtom0);
      jSState0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      assertEquals(0, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSJshopVars.flagLevel = 10;
      JSTerm jSTerm0 = new JSTerm();
      JSState jSState0 = new JSState();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, (JSSubstitution) null);
      assertTrue(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?D{d");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState0 = new JSState(streamTokenizer0);
      JSListLogicalAtoms jSListLogicalAtoms0 = jSState0.standarizerListLogicalAtoms();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSListAxioms jSListAxioms0 = jSPlanningDomain0.axioms();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSListLogicalAtoms0, jSSubstitution0, jSListAxioms0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?cDm6");
      JSJshopVars.flagLevel = 746;
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState1 = new JSState(streamTokenizer0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSState1, jSSubstitution0, jSListAxioms0);
      assertEquals("[]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSState0.addElementsToState(jSPlan0);
      assertTrue(jSState0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSState jSState1 = jSState0.apply((JSPlan) null);
      assertNotSame(jSState1, jSState0);
  }
}
