/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:45:49 GMT 2018
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2544));
      Step step0 = new Step((-2544), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step((-2544), nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      // Undeclared exception!
      try { 
        locationPath0.isSimpleStep(step0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("S@Z5");
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      step0.toString();
      locationPath0.isSimpleStep(step0);
      LocationPath locationPath1 = new LocationPath(false, (Step[]) null);
      assertFalse(locationPath1.equals((Object)locationPath0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("xFwEV`5%^T@Zk)E]|");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1765, nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[2];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      QName qName0 = new QName("The attribute \"");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      Step step0 = new Step((-132), (NodeTest) null, expressionArray0);
      step0.isContextDependent();
      stepArray0[0] = step0;
      LocationPath locationPath1 = new LocationPath(false, stepArray0);
      locationPath1.isSimplePath();
      locationPath0.computeContextDependent();
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.toString();
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1, (NodeTest) null);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 9, processingInstructionTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Step[] stepArray0 = new Step[16];
      QName qName0 = new QName("~", "~");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(10, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        locationPath0.createContextForStep((EvalContext) null, 12, nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.isSimplePath();
      locationPath0.isSimplePath();
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, processingInstructionTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Step[] stepArray0 = new Step[16];
      QName qName0 = new QName("~+4");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "~+4");
      Step step0 = new Step(10, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      locationPath0.createContextForStep((EvalContext) null, 2, nodeTypeTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      locationPath0.createContextForStep((EvalContext) null, 12, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(981);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean1 = locationPath0.isSimpleStep(step0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("S@Z5");
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(2, processingInstructionTest0, expressionArray0);
      step0.toString();
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      Step step0 = new Step(5, nodeTypeTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      locationPath0.createContextForStep((EvalContext) null, 10, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      EvalContext evalContext0 = null;
      boolean boolean0 = false;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      QName qName0 = new QName("oWA9a");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "oWA9a");
      locationPath0.createContextForStep((EvalContext) null, 3, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 4, processingInstructionTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 6, (NodeTest) null);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[30];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"1#keK`8");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 13, processingInstructionTest0);
      locationPath0.createContextForStep(evalContext0, 13, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      locationPath0.createContextForStep((EvalContext) null, 7, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 8, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.computeValue(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      locationPath0.createContextForStep((EvalContext) null, 11, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-701));
      Expression[] expressionArray0 = new Expression[1];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step step0 = new Step(890, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step((-701), nodeTypeTest0, (Expression[]) null);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(2, nodeNameTest0, (Expression[]) null);
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      locationPath0.areBasicPredicates(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, (Step[]) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[5];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) locationPath0;
      expressionArray0[2] = (Expression) locationPath0;
      expressionArray0[3] = (Expression) locationPath0;
      expressionArray0[4] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
      Expression[] expressionArray0 = new Expression[1];
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      step0.isContextDependent();
      Step step1 = new Step((-973), nodeNameTest0, expressionArray0);
      locationPath0.isSimpleStep(step1);
      locationPath0.isSimpleStep(step0);
      LocationPath locationPath1 = new LocationPath(false, (Step[]) null);
      locationPath0.createContextForStep((EvalContext) null, 2, nodeNameTest0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionArray0[0]);
      step0.isContextDependent();
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(locationPath0, locationPath1);
      locationPath0.areBasicPredicates(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], locationPath0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }
}