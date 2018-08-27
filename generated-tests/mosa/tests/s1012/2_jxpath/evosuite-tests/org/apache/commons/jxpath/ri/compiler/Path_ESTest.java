/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:44:27 GMT 2018
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperation;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
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
  public void test01()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, (-862), (NodeTest) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = CoreOperation.COMPARE_PRECEDENCE;
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("H~");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 2, processingInstructionTest0);
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
      int int0 = Double.BYTES;
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("$S7R:9");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 8, processingInstructionTest0);
      assertNotNull(evalContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      Step[] stepArray0 = new Step[1];
      EvalContext evalContext0 = null;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain((EvalContext) null, 5, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      EvalContext evalContext0 = locationPath0.buildContextChain(rootContext0, (-2846), false);
      assertSame(rootContext0, evalContext0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      expressionPath0.getExpression();
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Float.BYTES;
      Constant constant0 = new Constant(4);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(4, (NodeTest) null, expressionArray0);
      Step step1 = new Step(4, (NodeTest) null, expressionArray0);
      Step step2 = new Step(4, (NodeTest) null, expressionArray0);
      Step[] stepArray0 = new Step[5];
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
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("$S7R:9");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 5, processingInstructionTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      QName qName0 = new QName("!p;CE;Q*[W$e:Q^");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Step[] stepArray0 = new Step[3];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[13];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      step0.toString();
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleStep(step0);
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
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("!p;CE;Q*[W$e:Q");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "!p;CE;Q*[W$e:Q");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationOr0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, (Step[]) null);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = CoreOperation.UNION_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("!p;CE;Q*[W$e:Q^", "!p;CE;Q*[W$e:Q^");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[3];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Byte.SIZE;
      Constant constant0 = new Constant(8);
      Expression[] expressionArray0 = new Expression[0];
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step step0 = new Step(2, processingInstructionTest0, expressionArray0);
      boolean boolean1 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Short.BYTES;
      QName qName0 = new QName("a&SGA=0J_Vd(x");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "a&SGA=0J_Vd(x");
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, (Step[]) null);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName(", path does not match a changeable location");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "CE|d|NwYp");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, (-329), nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("!p;CE;Q*[W$e:Q^", "!p;CE;Q*[W$e:Q^");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      locationPath0.isSimplePath();
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) nameAttributeTest0;
      expressionArray0[2] = (Expression) nameAttributeTest0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[7];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      locationPath0.computeContextDependent();
      Step step1 = new Step(5, nodeNameTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Step step2 = new Step(5, nodeNameTest0, expressionArray0);
      expressionPath0.isSimpleStep(step2);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
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
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.searchForPath(evalContext0);
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1, processingInstructionTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) nameAttributeTest0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      Step[] stepArray0 = new Step[7];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleStep(step0);
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
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("OL4IQ'Iaz<Ap#@n|Mcq");
      EvalContext evalContext0 = null;
      locationPath0.createContextForStep((EvalContext) null, 6, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.isSimpleStep((Step) null);
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
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^BKLIv");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 13, processingInstructionTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[10];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
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
  public void test27()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[9];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) nameAttributeTest0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) nameAttributeTest0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[6] = (Expression) coreOperationOr0;
      expressionArray0[7] = (Expression) nameAttributeTest0;
      expressionArray0[8] = (Expression) nameAttributeTest0;
      nameAttributeTest0.args = expressionArray0;
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray1 = new Expression[3];
      expressionArray1[0] = (Expression) nameAttributeTest0;
      expressionArray1[1] = (Expression) nameAttributeTest0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray1);
      Step step1 = new Step((-10), nodeNameTest0, expressionArray1);
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray1[0], expressionArray1, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = null;
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
  public void test29()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("!p;CE;Q*[W$e:Q^", "!p;CE;Q*[W$e:Q^");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[2];
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "!p;CE;Q*[W$e:Q^", (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray1, stepArray0);
      EvalContext evalContext1 = expressionPath0.createContextForStep(evalContext0, 10, nodeNameTest0);
      assertEquals((-1), evalContext1.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("+]", "+]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(11, nodeNameTest0, expressionArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = CoreOperation.ADD_PRECEDENCE;
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 4, processingInstructionTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[13];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(9);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      step0.toString();
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
      
      boolean boolean1 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("d&O'uX$?o#0#)", "d&O'uX$?o#0#)");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[1];
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
      
      Pointer pointer1 = locationPath0.getSingleNodePointerForSteps(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = CoreOperation.RELATIONAL_EXPR_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(3, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      locationPath0.createContextForStep((EvalContext) null, 12, (NodeTest) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[4];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      Step step1 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertEquals(0, evalContext0.getPosition());
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Expression[] expressionArray0 = new Expression[0];
      QName qName0 = new QName("!p;CE;Q*[W$e:Q^", "!p;CE;Q*[W$e:Q^");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      boolean boolean0 = JXPathContextReferenceImpl.USE_SOFT_CACHE;
      Step[] stepArray0 = new Step[2];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Pointer pointer0 = locationPath0.searchForPath(evalContext0);
      assertNull(pointer0);
      assertEquals(0, evalContext0.getPosition());
  }
}