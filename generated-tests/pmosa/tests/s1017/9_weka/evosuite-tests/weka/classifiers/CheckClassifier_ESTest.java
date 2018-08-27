/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 11:26:52 GMT 2018
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SMO;
import weka.classifiers.functions.SimpleLinearRegression;
import weka.classifiers.lazy.KStar;
import weka.classifiers.lazy.LWL;
import weka.classifiers.meta.AttributeSelectedClassifier;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.M5P;
import weka.clusterers.SimpleKMeans;
import weka.core.CheckScheme;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.Utils;
import weka.estimators.UnivariateKernelEstimator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(true, true, false, false, true, true, 1085);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1085' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, true, true, false, 30000);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '30000' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = "`F09H(^pL";
      stringArray0[2] = "train";
      stringArray0[3] = "";
      stringArray0[4] = "???";
      stringArray0[5] = "q`O:6tl*,/";
      stringArray0[6] = "+RM*)%o*89oQg}:!";
      stringArray0[7] = "Ne|tKVqq";
      CheckClassifier.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, false, true, true, false, false, 91);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '91' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 7, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '7' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.weightedInstancesHandler();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(975, false, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '975' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, true, false, false, true, 75);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '75' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      checkClassifier0.setWordSeparators("VUNz',f8)E_ 7hG\"H");
      int int0 = (-2843);
      SimpleLinearRegression simpleLinearRegression0 = new SimpleLinearRegression();
      checkClassifier0.m_Classifier = (Classifier) simpleLinearRegression0;
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, false, true, false, true, true, (-2843));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2843' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.instanceWeights(true, true, true, true, false, false, 0);
      boolean boolean1 = false;
      boolean boolean2 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(false, true, true, true, false, (-555));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-555' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      checkClassifier0.getWords();
      checkClassifier0.canHandleOnlyClass(true, true, true, true, true, 0);
      String[] stringArray0 = new String[3];
      checkClassifier0.instanceWeights(false, true, false, false, false, false, 0);
      stringArray0[0] = "  mean";
      stringArray0[1] = "mVE";
      stringArray0[2] = "00P-pKEC=uxka\"%M'u$";
      CheckClassifier.main(stringArray0);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(true, true, true, false, false, (-555));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-555' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      boolean[] booleanArray0 = checkClassifier0.updateableClassifier();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
      
      boolean boolean0 = true;
      checkClassifier0.getOptions();
      boolean boolean1 = true;
      Utils.SMALL = (-1277.14976254);
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, true, false, true, false, false, (-1165));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1165' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.testToString();
      checkClassifier0.setNumNominal(0);
      checkClassifier0.setNumRelational(0);
      checkClassifier0.getRevision();
      checkClassifier0.testToString();
      checkClassifier0.getOptions();
      int int0 = 50;
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, true, false, false, true, 50, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '50' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.updateableClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, true, true, true, 84);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '84' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = ")ZMaV*a.WHA";
      stringArray0[4] = "";
      checkClassifier0.setOptions(stringArray0);
      checkClassifier0.canHandleOnlyClass(false, false, false, true, true, 4);
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, true, false, true, true, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*GU";
      stringArray0[1] = "";
      stringArray0[2] = "Rx{AylC~\".D-";
      stringArray0[3] = "";
      stringArray0[4] = "UYyXNhI9Wq}Y";
      stringArray0[5] = "C`{A9Toof";
      stringArray0[6] = "warning: performs worse than ZeroR";
      stringArray0[7] = "9^u5";
      stringArray0[8] = "PQw*k;;";
      checkClassifier0.setOptions(stringArray0);
      boolean[] booleanArray0 = checkClassifier0.canHandleNClasses(false, false, false, false, false, false, 3945);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      int int0 = 1024;
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, false, false, false, true, 1024);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1024' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = false;
      checkClassifier0.canHandleNClasses(true, false, true, true, false, false, 829);
      checkClassifier0.canTakeOptions();
      checkClassifier0.canTakeOptions();
      checkClassifier0.setNumNumeric((-616));
      checkClassifier0.getOptions();
      boolean boolean2 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(true, true, true, true, true, true, (-616), (-616));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Illegal Capacity: -610
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(true, true, false, true, false, false, 3, 3179);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Index: 3179, Size: 4
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.makeTestDataset(0, 0, 0, 1795, 1795, 0, 3, 934, 0, false);
      boolean boolean1 = false;
      boolean boolean2 = false;
      int int0 = 1630;
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 1630);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1630' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[9];
      CheckClassifier.main(stringArray0);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(1, false, false, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.weightedInstancesHandler();
      SMO sMO0 = new SMO();
      checkClassifier0.setClassifier(sMO0);
      boolean boolean0 = true;
      checkClassifier0.canHandleMissing(false, true, false, false, false, false, 3, false, true, 2);
      boolean boolean1 = true;
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.declaresSerialVersionUID();
      // Undeclared exception!
      try { 
        checkClassifier1.correctBuildInitialisation(true, true, true, true, true, true, 26);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '26' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CheckClassifier.main(stringArray0);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(1, true, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = 0;
      checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 0, false, false);
      CheckClassifier.main((String[]) null);
      checkClassifier0.correctBuildInitialisation(false, false, false, false, false, false, 0);
      boolean boolean0 = true;
      Random.setNextRandom(0);
      checkClassifier0.getOptions();
      checkClassifier0.canPredict(false, true, false, false, false, true, 0);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(false, true, false, false, true, 500);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '500' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(0, 0, 0, 1795, 1795, 0, 3, 934, 0, false);
      checkClassifier0.multiInstanceHandler();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, false, false, true, false, 1630);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1630' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.instanceWeights(true, true, false, true, false, false, 0);
      String[] stringArray0 = new String[0];
      CheckClassifier.main(stringArray0);
      int int0 = (-555);
      boolean boolean1 = false;
      boolean boolean2 = true;
      boolean boolean3 = true;
      checkClassifier0.canHandleOnlyClass(boolean1, boolean2, boolean2, boolean3, boolean1, int0);
      checkClassifier0.doTests();
      KStar kStar0 = new KStar();
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.setClassifier(kStar0);
      CheckScheme.PostProcessor checkScheme_PostProcessor0 = null;
      checkClassifier0.setPostProcessor(checkScheme_PostProcessor0);
      checkClassifier1.setDebug(boolean1);
      checkClassifier1.listOptions();
      boolean boolean4 = false;
      boolean boolean5 = false;
      boolean boolean6 = true;
      int int1 = 34;
      checkClassifier1.canHandleZeroTraining(boolean2, boolean4, boolean5, boolean4, boolean6, boolean0, int1);
      checkClassifier0.getRevision();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.multiInstanceHandler();
      checkClassifier0.updateableClassifier();
      M5P m5P0 = new M5P();
      checkClassifier0.setClassifier(m5P0);
      checkClassifier0.multiInstanceHandler();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, false, false, true, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.functions.LinearRegression: Cannot handle relational attributes!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getWords();
      checkClassifier0.canHandleOnlyClass(true, true, true, true, true, 0);
      boolean boolean0 = true;
      int int0 = 1024;
      checkClassifier0.updatingEquality(false, true, true, false, true, true, 0);
      boolean boolean1 = false;
      boolean boolean2 = false;
      boolean boolean3 = false;
      boolean boolean4 = true;
      boolean boolean5 = false;
      checkClassifier0.updatingEquality(boolean0, boolean1, boolean2, boolean3, boolean4, boolean5, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.multiInstanceHandler();
      checkClassifier0.updateableClassifier();
      M5P m5P0 = new M5P();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "All rows must have the same length.");
      checkClassifier0.setClassifier(m5P0);
      checkClassifier0.testsPerClassType(1, true, true, false);
      checkClassifier0.listOptions();
      TestInstances testInstances0 = new TestInstances();
      // Undeclared exception!
      try { 
        testInstances0.getRelationalFormat(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.multiInstanceHandler();
      checkClassifier0.updateableClassifier();
      M5P m5P0 = new M5P();
      checkClassifier0.setClassifier(m5P0);
      checkClassifier0.multiInstanceHandler();
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.updatingEquality(false, false, false, false, false, false, 0);
      checkClassifier1.getClassifier();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      checkClassifier0.testsPerClassType(2, true, false, false);
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, true, false, true, false, true, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(2, true, false, false);
      checkClassifier0.datasetIntegrity(false, false, false, false, false, true, 2, false, true);
  }
}
