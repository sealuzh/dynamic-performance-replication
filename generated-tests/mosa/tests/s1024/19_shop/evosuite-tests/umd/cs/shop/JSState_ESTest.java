/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:54:31 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListAxioms;
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
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSOperator jSOperator0 = new JSOperator();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      assertEquals("[[]]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(mockFileReader0);
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
  public void test3()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      Object object0 = new Object();
      jSPlan0.add(object0);
      jSState0.add((Object) jSPlan0);
      jSPlan0.add(object0);
      jSState1.apply(jSPlan0);
      jSState1.print();
      jSState1.addElementsToState(jSPlan0);
      jSState1.addElementsToState(jSPlan0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlan jSPlan1 = new JSPlan();
      jSState1.apply(jSPlan1);
      PipedReader pipedReader0 = null;
      try {
        pipedReader0 = new PipedReader((-933));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe size <= 0
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      UnaryOperator.identity();
      Function<JSPredicateForm, JSSubstitution> function0 = (Function<JSPredicateForm, JSSubstitution>) mock(Function.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      jSTaskAtom0.add(object0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSState0.addElement(jSPredicateForm0);
      JSState jSState1 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      assertEquals("[]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 1608;
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSState0.satisfiesTAm(jSTaskAtom0, (JSSubstitution) null);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, (JSSubstitution) null);
      assertEquals(10, jSListSubstitution0.capacity());
  }
}