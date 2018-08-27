/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 15:16:23 GMT 2018
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.OffsetTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "64hMBxqU";
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(2172);
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
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("5/}d/hIpuVy@e-DJu");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
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
      ElExpression elExpression0 = new ElExpression("&}~knmeMG!3jpJ)9");
      ElExpression elExpression1 = elExpression0.errorMessage((String) null);
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel(elExpression1, elExpression1, elExpression1);
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
      String string0 = "";
      dynamicSelectModel0.translator("");
      dynamicSelectModel0.reset();
      dynamicSelectModel0.translator("");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "\\f";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("\f");
      dynamicSelectModel1.collection("h,<");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("\f");
      String string1 = "";
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("");
      String string2 = "!OaUi<%";
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("!OaUi<%");
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.enumeration("h,<");
      dynamicSelectModel5.reset();
      dynamicSelectModel2.reset();
      dynamicSelectModel3.validate();
      // Undeclared exception!
      try { 
        dynamicSelectModel5.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression h,<.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator("7^_Bt6E0up|");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.label("7^_Bt6E0up|");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.enumeration("");
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel5 = dynamicSelectModel4.empty(object0);
      DynamicSelectModel dynamicSelectModel6 = dynamicSelectModel5.label("SJgHUgv$n6");
      assertSame(dynamicSelectModel4, dynamicSelectModel6);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
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
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(mockHijrahDate0);
      mockHijrahDate0.getMockedClassName();
      mockHijrahDate0.getMockedClassName();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator(":>8R-'0'k~@");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.value("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      dynamicSelectModel2.getTopLevelComponent();
      dynamicSelectModel3.setTopLevelComponent((StandaloneComponent) null);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.collection("8alG9g|# bO)|kM0<");
      dynamicSelectModel4.setComponent((Component) null);
      dynamicSelectModel3.getTopLevelComponent();
      dynamicSelectModel1.getComponent();
      dynamicSelectModel2.setTopLevelComponent((StandaloneComponent) null);
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
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("0");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 0 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      dynamicSelectModel1.translateValue("[] from ");
      dynamicSelectModel0.getObjects();
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel1.setTopLevelComponent((StandaloneComponent) null);
      dynamicSelectModel1.setComponent((Component) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      dynamicSelectModel1.empty(mockHijrahDate0);
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.value("[] from ");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.translator("[] from ");
      dynamicSelectModel1.translateValue("g[mK>Q?|002kx: #dY3");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("");
      assertSame(dynamicSelectModel4, dynamicSelectModel3);
  }
}