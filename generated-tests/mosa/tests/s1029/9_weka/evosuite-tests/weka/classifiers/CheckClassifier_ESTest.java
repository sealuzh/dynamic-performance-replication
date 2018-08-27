/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 20:18:41 GMT 2018
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.CheckClassifier;
import weka.classifiers.functions.SimpleLinearRegression;
import weka.classifiers.meta.CostSensitiveClassifier;
import weka.classifiers.meta.LogitBoost;
import weka.core.Capabilities;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.tokenizers.NGramTokenizer;
import weka.core.tokenizers.WordTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 0);
      checkClassifier0.listOptions();
      CheckClassifier.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, false, true, true, 164);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '164' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumString(1082);
      checkClassifier0.listOptions();
      checkClassifier0.setNumString(1368);
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.getClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, false, true, false, 10);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '10' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 0);
      checkClassifier0.getOptions();
      checkClassifier0.listOptions();
      checkClassifier0.updatingEquality(true, false, true, true, false, false, 0);
      checkClassifier0.correctBuildInitialisation(false, true, false, false, true, true, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, true, false, true, true, true, 164);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '164' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, true, false, false, false, false, 3522);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '3522' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumInstances(0);
      checkClassifier0.getRevision();
      checkClassifier0.canHandleNClasses(true, false, false, true, true, false, (-547));
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(true, false, false, false, false, true, 18);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '18' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(false, false, false, false, true, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.instanceWeights(false, false, false, false, false, false, 0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, true, false, false, true, true, 0, true, false);
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
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, true, false, false, true, false, (-2202));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2202' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.canTakeOptions();
      checkClassifier0.updateableClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, true, false, true, true, 77);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '77' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, false, true, false, false, (-2202));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2202' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.multiInstanceHandler();
      CheckClassifier.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, true, true, false, true, false, 161);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '161' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier0.setNumNumeric(71);
      // Undeclared exception!
      try { 
        checkClassifier1.doesntUseTestClassVal(true, true, false, true, true, true, 19);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '19' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.updateableClassifier();
      checkClassifier0.datasetIntegrity(true, true, true, true, true, false, 0, false, true);
      try { 
        checkClassifier0.makeTestDataset((-159), 1563, 1563, (-159), 1563, (-159), (-159), 77, (-159), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, false, false, true, 404, false, true, 404);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '404' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      int int0 = 2153;
      checkClassifier0.printAttributeSummary(true, true, false, false, true, false, 2153);
      boolean boolean1 = false;
      boolean boolean2 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, true, false, false, false, false, 1052);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1052' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Random.setNextRandom(30);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.listOptions();
      checkClassifier0.setNumString(30);
      checkClassifier0.listOptions();
      CostSensitiveClassifier costSensitiveClassifier0 = new CostSensitiveClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.setClassifier(costSensitiveClassifier0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = " predictor";
      stringArray0[1] = "";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[2] = "b_GWdybu.H+I";
      stringArray0[3] = "\tThe tokenizing algorihtm (classname plus parameters) to use.\n\t(default: ";
      checkClassifier0.setOptions(stringArray0);
      boolean boolean0 = false;
      boolean boolean1 = true;
      checkClassifier0.printAttributeSummary(false, false, false, false, false, true, 2);
      checkClassifier0.getClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, true, true, true, 30);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '30' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.doesntUseTestClassVal(true, true, true, false, true, false, 0);
      checkClassifier0.listOptions();
      checkClassifier0.updateableClassifier();
      checkClassifier0.canTakeOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, true, false, true, false, true, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: / by zero
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.doesntUseTestClassVal(false, false, true, false, false, false, 0);
      checkClassifier0.listOptions();
      checkClassifier0.updateableClassifier();
      checkClassifier0.canTakeOptions();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.canHandleMissing(false, true, false, false, true, false, 3, true, false, 3);
      CheckClassifier.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      SimpleLinearRegression simpleLinearRegression0 = new SimpleLinearRegression();
      checkClassifier0.setClassifier(simpleLinearRegression0);
      checkClassifier0.listOptions();
      checkClassifier0.weightedInstancesHandler();
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
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumInstances(0);
      checkClassifier0.getRevision();
      checkClassifier0.canHandleNClasses(false, false, false, false, true, true, 322);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, true, true, false, false, true, (-547));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-547' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      int int0 = 0;
      checkClassifier0.datasetIntegrity(false, true, false, false, false, true, 0, true, true);
      try { 
        checkClassifier0.makeTestDataset(0, 5441, 77, 115, 23, 42, 23, (-918), (-918), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '-918' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 0);
      checkClassifier0.getOptions();
      checkClassifier0.listOptions();
      checkClassifier0.updatingEquality(true, false, true, true, false, false, 0);
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
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.doesntUseTestClassVal(false, true, false, true, false, false, 0);
      checkClassifier0.listOptions();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Pbo4d4";
      stringArray0[1] = "I";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "z_tcB~+";
      CheckClassifier.main(stringArray0);
      System.setCurrentTimeMillis(0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.updateableClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, true, false, true, false, (-159), true, true, 797);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-159' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = 1082;
      checkClassifier0.setNumString(1082);
      checkClassifier0.listOptions();
      checkClassifier0.setNumString(1368);
      boolean boolean0 = false;
      boolean boolean1 = false;
      boolean boolean2 = true;
      boolean boolean3 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, true, false, (-557), false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-557' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      int int0 = 0;
      checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 0);
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.listOptions();
      checkClassifier0.updatingEquality(false, true, true, false, false, false, 0);
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