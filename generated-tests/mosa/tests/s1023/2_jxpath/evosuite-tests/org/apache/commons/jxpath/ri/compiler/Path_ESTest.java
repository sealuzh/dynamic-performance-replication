/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:59:47 GMT 2018
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
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
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      locationPath0.isSimplePath();
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      QName qName0 = new QName("dVNWv)bo!|g", "dVNWv)bo!|g");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "dVNWv)bo!|g");
      Step step0 = new Step(989, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      jXPathContextReferenceImpl0.removeAll("BIL");
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
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
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.computeContextDependent();
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
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[5];
      Step step0 = new Step(20, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(20, (NodeTest) null, expressionArray0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.isContextDependent();
      Step.axisToString(20);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, namespaceResolver0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.searchForPath(evalContext0);
      assertTrue(beanPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(887, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, (NodeTest) null);
      assertNotNull(evalContext0);
      
      locationPath0.computeContextDependent();
      Step step0 = new Step(5, (NodeTest) null, (Expression[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step step0 = new Step(2, (NodeTest) null, (Expression[]) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, (Step[]) null);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, (Step[]) null);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      expressionArray0[2] = (Expression) locationPath0;
      expressionArray0[3] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("uj<Basehar>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "uj<Basehar>");
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[11];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
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
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.computeContextDependent();
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
  public void test15()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, (-404), (NodeTest) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step step0 = new Step(1, (NodeTest) null, (Expression[]) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, (Step[]) null);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "BI\"");
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
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
      Expression[] expressionArray0 = new Expression[18];
      QName qName0 = new QName("BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "BI\"");
      Step step0 = new Step((-1), nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 1, processingInstructionTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      locationPath0.createContextForStep((EvalContext) null, 2, (NodeTest) null);
      String string0 = locationPath0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[22];
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
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
  public void test22()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      locationPath0.createContextForStep((EvalContext) null, 6, (NodeTest) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 11, (NodeTest) null);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(887, processingInstructionTest0, (Expression[]) null);
      step0.toString();
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(namespaceContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[5];
      Step step0 = new Step(20, (NodeTest) null, expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 12, (NodeTest) null);
      assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      locationPath0.computeContextDependent();
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 8, (NodeTest) null);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 9, processingInstructionTest0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      locationPath0.computeContextDependent();
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 13, (NodeTest) null);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      step0.isContextDependent();
      step0.toString();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
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
  public void test30()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      LocationPath locationPath1 = new LocationPath(false, (Step[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2281));
      locationPath0.createContextForStep((EvalContext) null, 3, nodeTypeTest0);
      String string0 = locationPath1.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      LocationPath locationPath1 = new LocationPath(true, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      boolean boolean0 = locationPath1.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("!F:_<OqG");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "&Z-C<z");
      Expression[] expressionArray0 = new Expression[3];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      Constant constant0 = new Constant("&Z-C<z");
      CoreFunction coreFunction0 = new CoreFunction(8388608, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, expression0);
      expressionArray0[2] = (Expression) coreOperationLessThan0;
      Step step0 = new Step(8388608, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Step step1 = new Step(234, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      expressionPath0.getExpression();
      locationPath0.computeContextDependent();
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain((EvalContext) null, 234, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step((-556), nodeTypeTest0, (Expression[]) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, (Step[]) null);
      Step step1 = new Step(1, nodeTypeTest0, expressionArray0);
      step1.toString();
      expressionPath0.isSimpleStep(step1);
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("BI\"", "BI\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "BI\"");
      Step step0 = new Step(4, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("BI}");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(10, nodeNameTest0, expressionArray0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.getNamespaceContextPointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, qName0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[10];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      expressionPath0.isSimpleStep(step0);
      ExpressionPath expressionPath1 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, (Step[]) null);
      Step step1 = new Step(119, nodeTypeTest0, (Expression[]) null);
      step0.isContextDependent();
      expressionPath1.isSimpleStep(step1);
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      assertTrue(locationPath0.isAbsolute());
  }
}