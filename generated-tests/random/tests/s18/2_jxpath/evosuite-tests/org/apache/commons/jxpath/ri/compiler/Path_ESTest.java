/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:53:08 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
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
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("3qDvG9im-hn ]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")DG]vF^lKG[^8gE7WC");
      Step step0 = new Step(2397, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[2] = stepArray0[0];
      QName qName0 = new QName("processing-instruction(')DG]vF^lKG[^8gE7WC')", "!x/<#h1Slkb");
      Step[] stepArray1 = new Step[6];
      stepArray1[0] = step0;
      stepArray1[1] = step0;
      stepArray1[2] = stepArray1[1];
      stepArray1[3] = step0;
      stepArray1[4] = stepArray0[2];
      stepArray1[5] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray1);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, nodeNameTest0, false);
      DescendantContext descendantContext0 = new DescendantContext(precedingOrFollowingContext0, false, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(descendantContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName(" |${");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      Step[] stepArray0 = new Step[2];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(11, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, extensionFunction0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, nodeNameTest0, false);
      EvalContext evalContext0 = expressionPath0.evalSteps(precedingOrFollowingContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(70, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"d/o?)(qE");
      Step step0 = new Step((-3609), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(7, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      stepArray0[2] = stepArray0[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      QName qName0 = new QName("\"d/o?)(qE", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      ParentContext parentContext0 = new ParentContext(selfContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(parentContext0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("r:c9A");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) variableReference0;
      expressionArray0[1] = (Expression) variableReference0;
      expressionArray0[2] = (Expression) variableReference0;
      expressionArray0[3] = (Expression) variableReference0;
      expressionArray0[4] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(9);
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step((-3294), nodeTypeTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("", "6=$_T9==.1;ym");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variableReference0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      RootContext rootContext1 = (RootContext)locationPath0.evalSteps(rootContext0);
      assertEquals(0, rootContext1.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("boolean");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2285));
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(ancestorContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(attributeContext0, (-2417), true);
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
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      EvalContext evalContext0 = locationPath0.buildContextChain(precedingOrFollowingContext0, (-469), false);
      assertSame(precedingOrFollowingContext0, evalContext0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("processing-instruction(')DG]vF^lKG[^8gE7WC')", "!x/<#h1Slkb");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.ChildContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("");
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      // Undeclared exception!
      try { 
        expressionPath0.createContextForStep(precedingOrFollowingContext0, (-2267), nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(";f4_");
      Step step0 = new Step((-4010), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = stepArray0[2];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[3]);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, stepArray0[0], (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(initialContext0, 4370, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.isSimplePath();
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<Rz%C^i#v~Da&9W");
      Step step0 = new Step(13, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, (Expression[]) null, stepArray0);
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
  public void test14()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(";f4_");
      Step step0 = new Step((-4010), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      Step step1 = new Step(12, processingInstructionTest0, expressionArray0);
      stepArray0[4] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[3]);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, step1, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(initialContext0, 4370, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("%TH0x");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(descendantContext0, 10, processingInstructionTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Float float0 = new Float(1956.84);
      Constant constant0 = new Constant(float0);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(9, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 1098, false);
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
      QName qName0 = new QName("java.lang.Float", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, coreOperationDivide0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, coreOperationNotEqual0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationDivide0, coreOperationSubtract0);
      Step[] stepArray0 = new Step[3];
      QName qName1 = new QName("java.lang.Float");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, (Expression[]) null, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, nodeNameTest0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(selfContext0, 8, nodeNameTest0);
      assertEquals(1, evalContext0.getDocumentOrder());
      assertEquals(0, selfContext0.getPosition());
      assertNotNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "!&'9}");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(descendantContext0, 6, (NodeTest) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(evalContext0, processingInstructionTest0, true);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(precedingOrFollowingContext0);
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
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("3qDvG9im-hn ]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("sEi");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 4, nodeNameTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(79);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, expressionArray0[7]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 3, nodeTypeTest0);
      assertEquals(1, evalContext0.getCurrentPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(70, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"d/o?)(qE");
      Step step0 = new Step((-3609), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(2, processingInstructionTest0, expressionArray0);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      QName qName0 = new QName("\"d/o?)(qE", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      ParentContext parentContext0 = new ParentContext(selfContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(parentContext0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, processingInstructionTest0);
      expressionPath0.createContextForStep(selfContext0, 1, processingInstructionTest0);
      //  // Unstable assertion: assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      QName qName0 = new QName("\"name\"", "\"name\"");
      Locale locale0 = new Locale("\"name\"", "\"name\"", "\"name\"");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(jXPathContextReferenceImpl0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      EvalContext evalContext0 = locationPath0.createContextForStep(initialContext0, (-104), nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "6=$_T9==.1;ym");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[3]);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      VariablePointer variablePointer1 = (VariablePointer)expressionPath0.searchForPath(rootContext0);
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(0, (NodeTest) null, (Expression[]) null);
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
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "Cannot convert value of class ");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)expressionPath0.expressionPath(initialContext0, true);
      assertEquals(1, beanPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("r:c9A");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) variableReference0;
      expressionArray0[1] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, (Expression[]) null, stepArray0);
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("processing-instruction(')DG]vF^lKG[^8gE7WC')", "!x/<#h1Slkb");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(nameAttributeTest0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThanOrEqual0, nameAttributeTest0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.areBasicPredicates(expressionArray0);
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
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(locationPath0, locationPath0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, coreOperationSubtract0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Constant constant0 = new Constant("");
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("boolean");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2285));
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-750));
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("id(", "lpuf$.n");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")DG]vF^lKG[^8gE7WC");
      Step step0 = new Step(2397, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("3qDvG9im-hn ]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      locationPath0.isSimplePath();
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
  public void test39()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(471);
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(471, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("p oK");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "p oK");
      Step step0 = new Step(0, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
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
  public void test41()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(9);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step((-3294), nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, (Expression[]) null, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertEquals(4, stepArray1.length);
  }
}
