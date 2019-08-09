/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 22:00:22 GMT 2019
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayesMultinomialUpdateable;
import weka.classifiers.functions.SMO;
import weka.classifiers.functions.SimpleLogistic;
import weka.classifiers.meta.AdditiveRegression;
import weka.classifiers.meta.ClassificationViaRegression;
import weka.classifiers.meta.Vote;
import weka.classifiers.rules.PART;
import weka.classifiers.rules.ZeroR;
import weka.core.Instances;
import weka.core.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, true, false, false, true, (-80), (-80));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-80' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.weightedInstancesHandler();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updateableClassifier();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.testToString();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.multiInstanceHandler();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, false, true, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, false, true, true, (-780));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-780' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, true, true, true, 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, true, true, true, false, false, 1);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, true, false, false, true, false, 1);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(true, false, false, false, false, false, 1);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(5, true, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '5' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType((-3865), false, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-3865' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[0];
      checkClassifier0.setOptions(stringArray0);
      assertEquals(2, checkClassifier0.getNumNominal());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, true, true, false, false, true, 0);
      assertEquals(1, checkClassifier0.getNumRelational());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(false, false, false, false, false, false, 3);
      assertEquals(1, checkClassifier0.getNumString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, true, false, true, true, true, (-1979));
      assertEquals(1, checkClassifier0.getNumRelational());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Instances instances0 = checkClassifier0.makeTestDataset(50, 1, 206, 0, 0, 50, 37, 206, 0, false);
      assertEquals(293, instances0.classIndex());
      assertEquals(1, instances0.numClasses());
      assertEquals(1, instances0.numInstances());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(42, 42, 0, 42, 0, 0, 0, 0, 10, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '10' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(959, 0, 240, 542, 145, (-1), 1927, 145, 1927, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-1), (-1), (-1), (-1), (-1), (-1), 9, (-1), 200, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '200' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-432), 0, 1, 0, 0, 42, 0, 0, 1000, 0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '1000' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(0, 0, 0, 0, 0, 0, 0, (-1385), 534, (-1385), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '534' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-1888), (-1888), (-692), (-1888), (-1888), (-692), (-692), (-1888), (-692), (-692), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        CheckClassifier.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, true, true, false, true, (-1270));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1270' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(true, false, true, true, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, true, true, true, true, 16);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '16' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, false, false, true, false, false, (-2675));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2675' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.doesntUseTestClassVal(false, true, true, true, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, true, false, false, true, true, 50);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '50' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(true, false, false, true, false, false, 0, false, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, true, false, false, true, true, 153, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '153' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, true, false, false, false, false, 1, false, true);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, false, false, true, false, (-253), true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-253' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.correctBuildInitialisation(false, false, true, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, true, true, true, true, true, (-283));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-283' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canPredict(false, false, true, false, true, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, true, true, false, true, (-1616));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1616' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(true, true, true, true, true, false, 50);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '50' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleZeroTraining(true, false, true, false, false, false, 0);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, false, false, false, false, false, (-1289));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1289' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleOnlyClass(true, false, true, true, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(true, true, true, true, true, (-41));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-41' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, false, false, false, false, false, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, true, true, true, true, false, 82);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleNClasses(false, false, false, false, false, false, 1965);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(true, true, true, false, true, false, (-1012));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(false, true, true, false, false, true, 0, true, false, (-2268));
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, true, true, true, true, (-3492), true, false, 3157);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-3492' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, true, false, false, 18, true, true, 1161);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '18' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(false, false, true, false, false, false, 3, false, true, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, false, false, false, false, 1, 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Index: 1, Size: 0
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, true, true, false, false, true, (-2064), 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2064' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleClassAsNthAttribute(true, false, true, false, false, true, 1, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      PART pART0 = new PART();
      try { 
        checkClassifier0.testWRTZeroR(pART0, (Evaluation) null, (Instances) null, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(20, 20, 20, (-1019), 3663, 3799, 3663, 3799, (-1019), false);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(34, 34, 34, 87, 802, 802, (-257), 34, 34, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(89, 89, 89, 89, 89, 4996, 4996, 89, 89, (-2296), true);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(35, (-2521), (-2521), 2196, 2196, 2864, (-2521), 2196, 2864, 2864, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(0, (-1), 91, (-1), 0, 1, 1, 2, 1, (-866), false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -866, Size: 93
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, true, false, 87);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '87' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, false, false, false, 2789);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '2789' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, false, false, false, false, 5);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '5' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(true, true, true, true, true, true, 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(false, false, false, false, false, 1593);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1593' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, true, false, false, false, true, 100);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SMO sMO0 = new SMO();
      checkClassifier0.setClassifier(sMO0);
      checkClassifier0.setDebug(true);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      PART pART0 = new PART();
      pART0.setConfidenceFactor(0.0F);
      checkClassifier0.setClassifier(pART0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(true, true, true, true, true, false, 4, false, true, 4);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.setOptions((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ZeroR zeroR0 = (ZeroR)checkClassifier0.getClassifier();
      assertEquals("If set to true, classifier may output additional info to the console.", zeroR0.debugTipText());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, true, true, true, true, false, 1, true, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, true, 3);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Utils.SMALL = (-0.25866078697684003);
      checkClassifier0.setDebug(true);
      // Undeclared exception!
      checkClassifier0.doTests();
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, false, true, true, true, (-1), (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      NaiveBayesMultinomialUpdateable naiveBayesMultinomialUpdateable0 = new NaiveBayesMultinomialUpdateable();
      checkClassifier0.setClassifier(naiveBayesMultinomialUpdateable0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(0, true, false, false);
      assertEquals(1, checkClassifier0.getNumRelational());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ClassificationViaRegression classificationViaRegression0 = new ClassificationViaRegression();
      checkClassifier0.setClassifier(classificationViaRegression0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Vote vote0 = new Vote();
      checkClassifier0.setClassifier(vote0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SimpleLogistic simpleLogistic0 = new SimpleLogistic();
      checkClassifier0.setClassifier(simpleLogistic0);
      // Undeclared exception!
      try { 
        checkClassifier0.doTests();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(0, true, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      assertFalse(checkClassifier0.hasClasspathProblems());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      PART pART0 = new PART();
      AdditiveRegression additiveRegression0 = new AdditiveRegression(pART0);
      checkClassifier0.m_Classifier = (Classifier) additiveRegression0;
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(38, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(16, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.setOptions(stringArray0);
      assertEquals(18, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String string0 = checkClassifier0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        CheckClassifier.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }
}