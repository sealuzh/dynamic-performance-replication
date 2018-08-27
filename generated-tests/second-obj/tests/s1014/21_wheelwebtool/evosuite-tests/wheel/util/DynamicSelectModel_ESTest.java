/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:40:02 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import wheel.ErrorPage;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      ElExpression elExpression0 = new ElExpression("qp");
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
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.getComponent();
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
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label((String) null);
      Component component0 = dynamicSelectModel1.getComponent();
      assertNull(component0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(1351);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      assertEquals("div", errorPage0.defaultTagName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(".W InIX,/%m9x^E0ZrQ");
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      assertEquals("wheel_ErrorPage", errorPage0.getComponentId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection(".W InIX,/%m9x^E0ZrQ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("*W nIX,Y%m9x^E0Z6Q");
      dynamicSelectModel1.label("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("wheel.AbstractEngine");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("wheel.AbstractEngine");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.AbstractEngine evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.getObjects();
      dynamicSelectModel0.translateValue("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("=zHJ9#Gw\"G5ef");
      assertSame(dynamicSelectModel2, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "[]";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.translator("[]");
      dynamicSelectModel2.reset();
      Object object0 = new Object();
      dynamicSelectModel1.translator("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(object0);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("[]");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel2.collection("[]");
      dynamicSelectModel3.getObjects();
      dynamicSelectModel5.value("[]");
      dynamicSelectModel2.getOptionCount();
      dynamicSelectModel5.value("[]");
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel4.collection(" to create a value for dynamic ISelectModel. Index was ");
      dynamicSelectModel6.translateValue(" to create a value for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("org.mvel.util.FastList@0000000045");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression Could not create DynamicSelection model. Value attribute was null or not an el-expression. to translate value ' org.mvel.util.FastList@0000000045'
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel3 = new DynamicSelectModel();
      dynamicSelectModel2.reset();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel2.empty(object0);
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.label("[]");
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel2.collection("[]");
      dynamicSelectModel4.getObjects();
      dynamicSelectModel6.value("[]");
      int int0 = XmlPullParser.PROCESSING_INSTRUCTION;
      DynamicSelectModel dynamicSelectModel7 = new DynamicSelectModel();
      dynamicSelectModel6.value("[]");
      dynamicSelectModel4.getTopLevelComponent();
      DynamicSelectModel dynamicSelectModel8 = dynamicSelectModel5.collection("[]");
      dynamicSelectModel8.translateValue("[]");
      dynamicSelectModel0.translateValue("org.mvel.util.FastList@0000000045");
      int int1 = XmlPullParser.END_TAG;
      DynamicSelectModel dynamicSelectModel9 = dynamicSelectModel7.enumeration("[]");
      dynamicSelectModel9.label("[]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
