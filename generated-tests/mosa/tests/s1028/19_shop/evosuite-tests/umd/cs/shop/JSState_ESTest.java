/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:19:43 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      JSState jSState0 = null;
      try {
        jSState0 = new JSState(streamTokenizer0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.add((Object) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSState0.standarizerListLogicalAtoms();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSState0);
      jSState0.addElementsToState(jSPlan0);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSListAxioms0.add((Object) jSState0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSState0.satisfiesAll(jSListLogicalAtoms0, jSSubstitution0, jSListAxioms0);
      JSOperator jSOperator0 = new JSOperator();
      JSState jSState1 = jSState0.apply(jSPlan0);
      jSState1.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      jSState0.addElementsToState(jSPlan0);
      assertEquals("[[(this Collection)]]", jSPlan0.toString());
      assertFalse(jSState0.equals((Object)jSState1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSJshopVars.flagLevel = 441;
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
      assertEquals(0, jSListSubstitution0.size());
  }
}