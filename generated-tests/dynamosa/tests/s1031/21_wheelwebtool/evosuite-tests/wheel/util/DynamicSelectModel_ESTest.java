/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 00:59:54 GMT 2019
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mvel.util.FastList;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.components.TextArea;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.empty(dynamicSelectModel1);
      dynamicSelectModel1.value("[]");
      String string0 = dynamicSelectModel2.getValue(0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      errorPage0._setParent(errorPage0);
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertFalse(standaloneComponent0.isPage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertEquals("div", standaloneComponent0.defaultTagName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]");
      int int0 = dynamicSelectModel0.getOptionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(object0);
      int int0 = dynamicSelectModel2.getOptionCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("[]");
      dynamicSelectModel0.empty("[]");
      String string0 = dynamicSelectModel2.getLabel(0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value((String) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator((String) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setComponent((Component) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      assertTrue(errorPage0.isPage());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label((String) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, (String) null, (String) null);
      Any any0 = new Any(textArea0, (CharSequence) null);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty((Object) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection(":LfXs");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue(":LfXs");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression :LfXs evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("N]k~G");
      // Undeclared exception!
      dynamicSelectModel1.translateValue("N]k~G");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("^ozGMlZ$Dad[|");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("^ozGMlZ$Dad[|");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[{C]");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("[{C]");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("5,yNIEtUeCY?_6");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("5,yNIEtUeCY?_6");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("/+Y3}g$14j");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("/+Y3}g$14j");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration(":LfXs");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-1583));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression :LfXs.values() evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("C4q6]uBgoA)oh^HF");
      // Undeclared exception!
      dynamicSelectModel0.getValue((-1032));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("|MMt[cx}");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(99);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("~/kCkgdupVeBM");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-1561));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?'5(t\"PKX_}:t!Io<");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(440);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("{}");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("{}");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-55));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -55
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("f.");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression f..values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("UT]");
      // Undeclared exception!
      dynamicSelectModel0.getOptionCount();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("&uaO[-&>^.SEg}DM");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("&/M\"a8q.*W$Kn\"MG5");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[{C]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?M.R{eGR5q");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("yx]KPk5+8|%j1` ");
      // Undeclared exception!
      dynamicSelectModel0.getObjects();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[{C]");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?M.R{eGR5q");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("v =TktL?!|7?sajb");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(3582);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression v =TktL?!|7?sajb.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("28]<vq6}r=8l7$");
      // Undeclared exception!
      dynamicSelectModel1.getLabel(682);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("0 _V]SZQl");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel((-11));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(997);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?6t*c");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel1.label("[]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(1792);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1792
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("/+Y3}g$14j");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(3062);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.empty(dynamicSelectModel1);
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      Collection collection0 = dynamicSelectModel1.getObjects();
      Collection collection1 = dynamicSelectModel1.getObjects();
      assertSame(collection1, collection0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.label(":LyXs");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(":LyXs");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(":LyXs");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(":LyXs");
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection(":LfXs");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression :LfXs evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("{}");
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.empty(dynamicSelectModel1);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("[]");
      Object object0 = dynamicSelectModel2.translateValue("org.mvel.util.FastList@0000000026");
      assertSame(dynamicSelectModel0, object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel1.empty(dynamicSelectModel0);
      dynamicSelectModel1.value("[]");
      dynamicSelectModel0.translator("[]");
      FastList fastList0 = (FastList)dynamicSelectModel0.translateValue("org.mvel.util.FastList@0000000027");
      assertEquals(0, fastList0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.empty("[]");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[]");
      Object object0 = dynamicSelectModel1.translateValue("[]");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-2022787700));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = "[]";
      ElExpression elExpression0 = new ElExpression(string0);
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel(elExpression0, elExpression0, elExpression0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setComponent(any0);
      Any any1 = (Any)dynamicSelectModel0.getComponent();
      assertNull(any1.defaultTagName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("/J]");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}