/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:48:50 GMT 2018
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
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTasks;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSTerm jSTerm0 = new JSTerm();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.cloneTasks();
      JSState jSState1 = jSState0.apply((JSPlan) null);
      JSPlan jSPlan1 = new JSPlan();
      jSState1.setSize(2157);
      JSPlan jSPlan2 = new JSPlan();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSState jSState2 = new JSState();
      jSState2.addElementsToState(jSState1);
      JSTasks jSTasks0 = new JSTasks();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      assertTrue(jSSubstitution1.equals((Object)jSSubstitution0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      JSTerm jSTerm0 = new JSTerm();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSState jSState2 = jSState1.apply(jSPlan0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSPlan jSPlan1 = new JSPlan();
      JSTasks jSTasks0 = jSPlan1.cloneTasks();
      jSState2.addElementsToState(jSPlan0);
      jSState2.containsAll(jSState0);
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSTasks0.add((Object) "-~&");
      JSSubstitution jSSubstitution1 = jSState1.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
      jSState0.addElementsToState(jSTasks0);
      jSState0.satisfies(jSState1, jSSubstitution0, jSListAxioms0);
      JSOperator jSOperator0 = new JSOperator();
      JSTasks jSTasks1 = new JSTasks();
      Object object0 = new Object();
      jSTasks1.add(object0);
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTerm0, jSSubstitution1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSPlan jSPlan1 = new JSPlan();
      jSPlan0.addElements(jSPlan1);
      JSState jSState1 = (JSState)jSState0.clone();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSState0.addElementsToState(jSPlan0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSSubstitution jSSubstitution2 = new JSSubstitution();
      jSState0.addElementsToState(jSPlan1);
      jSState0.satisfies(jSState0, jSSubstitution1, jSListAxioms0);
      JSOperator jSOperator0 = new JSOperator();
      JSTasks jSTasks0 = new JSTasks();
      jSPlan1.add((Object) fileSystemHandling0);
      JSJshopVars.flagLevel = 916;
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSListAxioms0.add((Object) jSSubstitution1);
      Object object0 = new Object();
      jSTerm0.makeEval(true);
      jSTasks0.add((Object) jSListSubstitution0);
      jSState1.satisfiesTAm(jSTerm0, jSSubstitution1);
      jSState1.addElementsToState(jSPlan0);
      // Undeclared exception!
      try { 
        jSPlan1.applySubstitutionTasks(jSSubstitution1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.testdata.FileSystemHandling cannot be cast to umd.cs.shop.JSTaskAtom
         //
         verifyException("umd.cs.shop.JSTasks", e);
      }
  }
}