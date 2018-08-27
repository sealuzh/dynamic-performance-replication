/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 04:01:39 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.chrono.MinguoDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.FormElement;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "Oq|e1P\\";
      ElExpression elExpression0 = new ElExpression("Oq|e1P");
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
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("g$n!y>#wU}<6H8h/");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("g$n!y>#wU}<6H8h/");
      String string0 = "";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("");
      dynamicSelectModel3.reset();
      dynamicSelectModel3.collection("");
      dynamicSelectModel2.reset();
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty("");
      String string1 = "#8:Kx.VtR7Lq/j@R6";
      // Undeclared exception!
      try { 
        dynamicSelectModel4.translateValue("#8:Kx.VtR7Lq/j@R6");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("expected apostrophe (') or quotation mark (\") after version and not ");
      int int0 = XmlPullParser.COMMENT;
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      int int0 = XmlPullParser.COMMENT;
      dynamicSelectModel0.collection("");
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
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("#^vRGV3mw!LW");
      dynamicSelectModel1.validate();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression #^vRGV3mw!LW.values() evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      dynamicSelectModel2.collection("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty("");
      dynamicSelectModel2.validate();
      dynamicSelectModel1.label("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.collection("T");
      dynamicSelectModel4.value("");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.empty(object0);
      dynamicSelectModel5.enumeration("http://www.w3.org/1999/xhtml");
      dynamicSelectModel4.label("T");
      dynamicSelectModel3.validate();
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel3.empty(dynamicSelectModel2);
      dynamicSelectModel6.enumeration("");
      // Undeclared exception!
      try { 
        dynamicSelectModel6.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("Y^bvuB}e");
      String string0 = ")v";
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration(")v");
      dynamicSelectModel1.setComponent(errorPage0);
      // Undeclared exception!
      try { 
        dynamicSelectModel2.translateValue("Y^bvuB}e");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression )v.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("-IJvLBJ\" ");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.translator("-IJvLBJ\" ");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.label("");
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      dynamicSelectModel5.empty(mockMinguoDate0);
      dynamicSelectModel5.getTopLevelComponent();
      dynamicSelectModel1.value(" to create a dynamic ISelectModel.");
      dynamicSelectModel0.value("RIK");
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel4.collection((String) null);
      assertSame(dynamicSelectModel4, dynamicSelectModel6);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("\"B");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("");
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("Q2uk`R");
      dynamicSelectModel3.getTopLevelComponent();
      dynamicSelectModel2.setTopLevelComponent((StandaloneComponent) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression \"B.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("#^vRGV3mw!LW");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression #^vRGV3mw!LW evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.translator("[]");
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel0.translator("");
      dynamicSelectModel3.translator("[]");
      MinguoDate minguoDate0 = MockMinguoDate.now();
      dynamicSelectModel2.empty(minguoDate0);
      dynamicSelectModel3.value("[]");
      String string0 = XmlPullParserFactory.PROPERTY_NAME;
      dynamicSelectModel0.getComponent();
      dynamicSelectModel0.reset();
      dynamicSelectModel1.translateValue("org.xmlpull.v1.XmlPullParserFactory");
      dynamicSelectModel0.reset();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel1.value("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.label("[]");
      dynamicSelectModel2.translateValue("[]");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("[]");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel2.translator("");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.translator("[]");
      MinguoDate minguoDate0 = MockMinguoDate.now();
      dynamicSelectModel3.empty(minguoDate0);
      dynamicSelectModel4.value("[]");
      String string0 = XmlPullParserFactory.PROPERTY_NAME;
      DynamicSelectModel dynamicSelectModel6 = new DynamicSelectModel();
      dynamicSelectModel5.getComponent();
      dynamicSelectModel4.reset();
      dynamicSelectModel3.translateValue("");
      int int0 = dynamicSelectModel0.getOptionCount();
      assertEquals(1, int0);
  }
}
