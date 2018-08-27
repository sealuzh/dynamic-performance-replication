/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 16:46:22 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseEra;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.components.TextArea;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.value("");
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(mockJapaneseDate0);
      mockJapaneseDate0.getMockedClassName();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.value(".values()");
      dynamicSelectModel1.collection("\"Be_q.N?Z2{");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getLabel(35);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("y-t-C7z,kYbrq5");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(dynamicSelectModel0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel2.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = "";
      ElExpression elExpression0 = new ElExpression("");
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
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("`kSQf!N$%5FgIMpj");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(dynamicSelectModel0);
      dynamicSelectModel2.translator(" />");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getLabel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label((String) null);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty(mockHijrahDate0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection((String) null);
      assertSame(dynamicSelectModel2, dynamicSelectModel3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      String string0 = XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES;
      Any any0 = new Any(errorPage0, "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes");
      String string1 = "v1Y87zB&,";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.label("v1Y87zB&,");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.empty("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes");
      dynamicSelectModel4.setTopLevelComponent(errorPage0);
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
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
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
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      String string0 = "";
      String string1 = "";
      TextArea textArea0 = new TextArea(errorPage0, "", "");
      Any any0 = new Any(textArea0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.empty(dynamicSelectModel1);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.enumeration("");
      dynamicSelectModel4.validate();
      dynamicSelectModel0.setComponent(any0);
      // Undeclared exception!
      try { 
        any0.submit("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Form elements can be created only by compoents that are attached to a form component.
         //
         verifyException("wheel.components.ComponentCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      dynamicSelectModel1.collection(" evaluated to null. Can't build a dynamic ISelectModel");
      dynamicSelectModel1.reset();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  evaluated to null. Can't build a dynamic ISelectModel to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
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
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("0");
      int int0 = XmlPullParser.END_TAG;
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 0 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("7,");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("7,");
      dynamicSelectModel0.enumeration("[] from ");
      int int0 = XmlPullParser.COMMENT;
      Object object0 = dynamicSelectModel1.translateValue("s;F}");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty("[] from ");
      dynamicSelectModel2.value("[] from ");
      dynamicSelectModel2.getComponent();
      Object object0 = dynamicSelectModel0.translateValue("[] from ");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.empty(dynamicSelectModel1);
      dynamicSelectModel0.value("[]fromg ");
      Object object0 = dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000029");
      assertSame(object0, dynamicSelectModel2);
      
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getValue((-2055259888));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2055259888
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}