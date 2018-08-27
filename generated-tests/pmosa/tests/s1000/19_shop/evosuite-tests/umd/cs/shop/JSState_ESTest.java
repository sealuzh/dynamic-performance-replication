/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 15:25:00 GMT 2018
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
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSListSubstitution;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;
import umd.cs.shop.JSTerm;

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
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSState0);
      JSPlan jSPlan1 = new JSPlan();
      jSState0.addElementsToState(jSPlan0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      assertEquals(0, jSListAxioms0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSTasks jSTasks0 = jSPlan0.applySubstitutionTasks((JSSubstitution) null);
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
  public void test3()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = new JSState();
      JSTerm jSTerm0 = new JSTerm();
      jSState1.satisfiesTAm(jSTerm0, (JSSubstitution) null);
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) "QXwS{='?vhHN:f");
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSListAxioms0.TheoremProver(jSPlan0, jSState0, (JSSubstitution) null, true);
      JSState jSState2 = jSState1.apply(jSPlan0);
      Object object0 = new Object();
      jSState2.addElement(jSListSubstitution0);
      assertEquals("[]", jSState1.toString());
      
      JSListSubstitution jSListSubstitution1 = jSState0.satisfiesAll(jSState1, jSSubstitution0, jSListAxioms0);
      assertEquals("[[QXwS{='?vhHN:f]]", jSListSubstitution1.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSTerm jSTerm0 = new JSTerm();
      Integer integer0 = new Integer((-385));
      jSTerm0.add((Object) integer0);
      jSState0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTasks jSTasks0 = new JSTasks();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSTasks0, jSSubstitution0, jSListAxioms0);
      Integer integer1 = new Integer(2773);
      jSSubstitution0.remove((Object) integer1);
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSListSubstitution jSListSubstitution1 = jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      assertFalse(jSListSubstitution1.equals((Object)jSListSubstitution0));
  }
}