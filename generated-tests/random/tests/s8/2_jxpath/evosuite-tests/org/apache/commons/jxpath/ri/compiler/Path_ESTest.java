/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:10:02 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
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
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(0, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("yp5B");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(11, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(ancestorContext0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant((Number) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[5], expressionArray0[5]);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, coreOperationMod0);
      Step[] stepArray0 = new Step[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Vr$Dpm{)rU]\"f8R`l ");
      Step step0 = new Step(2344, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[2];
      stepArray0[6] = stepArray0[4];
      stepArray0[7] = stepArray0[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-177));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(namespaceContext0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("B><L-cT");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(locationPath0, nameAttributeTest0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, locationPath0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step(2286, (NodeTest) null, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant("h4");
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = new Step((-3365), (NodeTest) null, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(rootContext0, basicNodeSet0);
      nodeSetContext0.getSingleNodePointer();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3982));
      EvalContext evalContext0 = locationPath0.createContextForStep(nodeSetContext0, (-3982), nodeTypeTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long(8193L);
      Constant constant0 = new Constant(long0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(191);
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, expressionArray0[1]);
      EvalContext evalContext0 = expressionPath0.createContextForStep(predicateContext0, 3367, nodeTypeTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("hVoP]*9'qH.j==I", "hVoP]*9'qH.j==I");
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, (Expression) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, extensionFunction0);
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimplePath();
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
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-3170), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[2];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(locationPath0, locationPath0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationSubtract0, locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, coreOperationSubtract0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 1858, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(1680, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionPath0.isSimplePath();
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[2] = (Expression) locationPath0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[2], expressionArray0[2]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("m-");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step(81, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(13, (NodeTest) null, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNotNull(evalContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-85));
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step((-85), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(12, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
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
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("J,VX/;c#GS<MZ");
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(5105, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[1];
      Step step1 = new Step(10, processingInstructionTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionArray0[0]);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(5, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(9, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(4, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      locationPath0.evalSteps(nodeSetContext0);
      //  // Unstable assertion: assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-3170), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(7, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(locationPath0, locationPath0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationSubtract0, locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, coreOperationSubtract0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 1858, false);
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
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("1[+/?^!a(d|M!2e)*,K");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1[+/?^!a(d|M!2e)*,K");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 6, nodeNameTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant((Number) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[5], expressionArray0[5]);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, coreOperationMod0);
      Step[] stepArray0 = new Step[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Vr$Dpm{)rU]\"f8R`l ");
      Step step0 = new Step(2344, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[1];
      Step step1 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[5] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-177));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(selfContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(namespaceContext0);
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
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(5, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      Step step1 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("Factory could not create object path: ", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory could not create object path: ");
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(evalContext0);
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
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[2], expressionArray0[2]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      BeanPointer beanPointer1 = (BeanPointer)expressionPath0.searchForPath(rootContext0);
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) locationPath0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[1] = (Expression) variableReference0;
      expressionArray0[2] = (Expression) locationPath0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[2], expressionArray0[2]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      Object object0 = expressionPath0.computeValue(rootContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("hVoP]*9'qH.j==I", "hVoP]*9'qH.j==I");
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, coreFunction0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, extensionFunction0);
      Step[] stepArray0 = new Step[7];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant constant0 = new Constant("h4");
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[4];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Long long0 = new Long(8193L);
      Constant constant0 = new Constant(long0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(191);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("Gw");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
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
  public void test34()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      expressionPath0.isSimpleExpressionPath();
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
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("LGQLZc3jZ+J");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[1], coreOperationGreaterThan0);
      expressionArray0[2] = (Expression) coreOperationMultiply0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("org.apache.commons.beanutils.DynaBean");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }
}