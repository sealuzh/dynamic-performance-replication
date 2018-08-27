/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:33:09 GMT 2018
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
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
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1024);
      Step step0 = new Step(1024, nodeTypeTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      locationPath0.isSimplePath();
      // Undeclared exception!
      try { 
        locationPath0.computeContextDependent();
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
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 2694, nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      locationPath0.createContextForStep((EvalContext) null, 1, nodeTypeTest0);
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
  public void test06()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      locationPath0.createContextForStep((EvalContext) null, 2, nodeTypeTest0);
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
  public void test07()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(12);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 12, nodeTypeTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 9, (NodeTest) null);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(2, nodeTypeTest0, expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.isSimplePath();
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[10];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        locationPath0.createContextForStep((EvalContext) null, 2694, nodeNameTest0);
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
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, locationPath0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps((EvalContext) null);
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
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step step0 = new Step(5, (NodeTest) null, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
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
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(26);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("l");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "l");
      Step step0 = new Step(2, nodeNameTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName(", ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(nameAttributeTest0, nameAttributeTest0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, coreOperationGreaterThan0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationOr coreOperationOr1 = new CoreOperationOr(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationOr1;
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      NodeNameTest nodeNameTest1 = new NodeNameTest(qName0, ";2lkK:oqpCJ^dkD]zv");
      Step step1 = new Step(0, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("jt E`*=I*)OYZw");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNotNull(evalContext0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-23));
      Step step0 = new Step((-23), nodeTypeTest0, (Expression[]) null);
      nodeTypeTest0.toString();
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(ancestorContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 3, (NodeTest) null);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("_}owS[7vA7Z", "_}owS[7vA7Z");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 6, nodeTypeTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, nodeTypeTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(8);
      locationPath0.createContextForStep((EvalContext) null, 8, nodeTypeTest0);
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
  public void test28()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      locationPath0.createContextForStep((EvalContext) null, 4, processingInstructionTest0);
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
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      expressionPath0.toString();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1669));
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 13, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps(evalContext0);
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
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1415));
      locationPath0.createContextForStep((EvalContext) null, 11, nodeTypeTest0);
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
  public void test31()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      step0.isContextDependent();
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
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
  public void test32()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) locationPath0;
      locationPath0.areBasicPredicates(expressionArray0);
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
  public void test33()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[3];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) locationPath0;
      expressionArray0[2] = (Expression) locationPath0;
      locationPath0.areBasicPredicates(expressionArray0);
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
  public void test34()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 10, processingInstructionTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("7S[:'vig`lYkaePdR");
      locationPath0.createContextForStep((EvalContext) null, 7, processingInstructionTest0);
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
  public void test36()  throws Throwable  {
      QName qName0 = new QName("*", "*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
      Step step0 = new Step(2, nodeNameTest0, (Expression[]) null);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }
}