/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:35:22 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListSubstitution;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      jSState1.addElementsToState(jSState0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlan jSPlan0 = new JSPlan();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSState jSState0 = null;
      try {
        jSState0 = new JSState((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSState jSState0 = new JSState();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      assertTrue(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSState0);
      jSPlan0.add((Object) jSState0);
      jSState0.addElementsToState(jSPlan0);
      assertEquals("[[(this Collection)], [(this Collection)]]", jSPlan0.toString());
      assertFalse(jSState0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSSubstitution0);
      jSState0.addElementsToState(jSPlan0);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSJshopVars.flagLevel = 3033;
      jSPlan0.add((Object) jSSubstitution1);
      jSState0.addElementsToState(jSPlan0);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSJshopVars.flagLevel = 3033;
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSState0.addElementsToState(jSPlan0);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      Object object0 = new Object();
      jSTaskAtom0.add(object0);
      jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      JSListAxioms jSListAxioms0 = jSPlanningDomain0.axioms();
      jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      JSState jSState1 = new JSState();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSState1, jSSubstitution1, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }
}
