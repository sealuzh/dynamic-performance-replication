/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:40:29 GMT 2018
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.StreamTokenizer;
import java.nio.charset.Charset;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSState0.addElementsToState(jSPlan0);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
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
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "^K\"_");
      JSState jSState0 = new JSState();
      Charset.defaultCharset();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSJshopVars.flagLevel = 39;
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) jSListAxioms0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSState0.addElementsToState(jSPlan0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.addElementsToState(jSPlan0);
      assertEquals(1, jSState0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSState jSState0 = new JSState();
      JSState jSState1 = new JSState();
      UnaryOperator<InputStream> unaryOperator0 = UnaryOperator.identity();
      UnaryOperator.identity();
      UnaryOperator<JSSubstitution> unaryOperator1 = UnaryOperator.identity();
      Function<Object, JSSubstitution> function0 = (Function<Object, JSSubstitution>) mock(Function.class, new ViolatedAssumptionAnswer());
      unaryOperator0.andThen((Function<? super InputStream, ? extends JSSubstitution>) function0);
      Function<Object, InputStream> function1 = (Function<Object, InputStream>) mock(Function.class, new ViolatedAssumptionAnswer());
      Function<JSSubstitution, InputStream> function2 = unaryOperator1.andThen((Function<? super JSSubstitution, ? extends InputStream>) function1);
      unaryOperator0.compose((Function<? super JSSubstitution, ? extends InputStream>) function2);
      jSPredicateForm0.replaceAll(unaryOperator0);
      Charset charset0 = Charset.defaultCharset();
      jSState0.satisfiesTAm(jSPredicateForm0, jSSubstitution0);
      JSTasks jSTasks0 = new JSTasks();
      jSState1.retainAll(jSState0);
      jSPredicateForm0.add((Object) "r^Uyj=F|pZ=pyZU");
      JSPlan jSPlan0 = new JSPlan();
      JSPlan jSPlan1 = new JSPlan();
      jSPlan1.add((Object) jSPredicateForm0);
      JSOperator jSOperator0 = new JSOperator();
      jSPredicateForm0.add((Object) jSState1);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSState0.satisfies(jSPlan1, jSSubstitution0, jSListAxioms0);
      jSPredicateForm0.add((Object) charset0);
      jSState1.addElementsToState(jSPlan1);
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      JSTasks jSTasks1 = jSPlan0.standarizerTasks();
      assertEquals(10, jSTasks1.capacity());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 2004;
      UnaryOperator.identity();
      Function<Object, JSSubstitution> function0 = (Function<Object, JSSubstitution>) mock(Function.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("]");
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.add((Object) "]");
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSState0.addElementsToState(jSPlan0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      String string0 = null;
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      JSState jSState0 = new JSState();
      jSState0.addElementsToState(jSState0);
      Charset.defaultCharset();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSJshopVars.flagLevel = 39;
      jSState0.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
      jSState0.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      byte[] byteArray0 = new byte[4];
      JSSubstitution jSSubstitution1 = new JSSubstitution();
      jSState0.satisfiesTAm(jSPredicateForm0, jSSubstitution0);
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSOperator0.standarizerOp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSOperator", e);
      }
  }
}