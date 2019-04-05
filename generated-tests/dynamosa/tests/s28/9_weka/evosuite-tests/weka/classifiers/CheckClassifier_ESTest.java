/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:23:42 GMT 2019
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
import weka.classifiers.CostMatrix;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.bayes.NaiveBayesMultinomialText;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.ClassificationViaRegression;
import weka.classifiers.misc.SerializedClassifier;
import weka.classifiers.rules.JRip;
import weka.classifiers.rules.ZeroR;
import weka.core.Capabilities;
import weka.core.Instances;
import weka.core.TestInstances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, false, false, false, false, 1601, (-2012));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1601' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NaiveBayes naiveBayes0 = new NaiveBayes();
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier(naiveBayes0);
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
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.weightedInstancesHandler();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
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
      checkClassifier0.setNumInstances(0);
      boolean[] booleanArray0 = checkClassifier0.canHandleClassAsNthAttribute(true, true, true, true, true, true, 0, 0);
      assertTrue(Arrays.equals(new boolean[] {true, true}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, true, true, false, 25);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '25' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(1, false, false, false);
      assertFalse(checkClassifier0.getSilent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType((-774), true, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-774' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.testWRTZeroR((Classifier) null, (Evaluation) null, (Instances) null, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, true, true, true, false, true, 21);
      assertFalse(checkClassifier0.hasClasspathProblems());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, false, true, false, true, true, 0);
      assertEquals(1, checkClassifier0.getNumString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, true, true, true, true, true, (-1408));
      assertEquals(" ", checkClassifier0.getWordSeparators());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(false, false, false, true, false, false, Integer.MIN_VALUE);
      assertFalse(checkClassifier0.getDebug());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-279), (-279), 736, (-279), (-279), (-1404), 0, (-279), 0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1225
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(0, 0, 0, 0, 4187, (-4218), 0, (-907), (-4218), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -30
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(0, 0, (-217), (-217), 0, (-3460), (-3460), 0, (-217), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-739), (-739), 0, 0, 92, 0, 0, 0, 87, 1834, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '87' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-2016), 0, 0, (-1), 0, 18, (-1), 18, 0, (-1), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(0, 0, 0, 0, 2537, 0, (-1095), 2537, 0, 0, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, false, false, true, false, false, 12);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '12' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, true, false, true, true, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, false, false, true, false, (-1628));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1628' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, true, true, true, true, false, (-603));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-603' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, true, 4465);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '4465' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, true, true, true, true, false, 75);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '75' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, true, false, true, true, false, (-1726), true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1726' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, false, true, 146, false, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '146' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, true, true, true, true, false, 1, false, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(true, false, false, false, false, false, 0, false, true);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, true, false, false, false, false, (-372));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-372' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canPredict(true, true, true, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, false, true, true, true, (-1264));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1264' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, true, true, true, false, false, 3387);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '3387' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleZeroTraining(false, true, false, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, false, false, false, false, false, 839);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '839' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(true, true, true, true, true, true, (-3737));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-3737' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleOnlyClass(true, true, true, true, true, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleOnlyClass(true, true, true, true, true, 4);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(true, false, false, false, true, (-576));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-576' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(true, true, false, true, true, true, (-1926));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, true, true, false, false, false, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleNClasses(false, false, false, false, true, false, 2114);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(true, true, false, true, true, false, 0, false, false, (-14));
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, false, false, true, false, true, (-14), false, false, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-14' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, false, false, false, false, 541, true, true, 541);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '541' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, true, true, true, true, 13, 13);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '13' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, true, true, true, false, true, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      IBk iBk0 = new IBk();
      Capabilities capabilities0 = new Capabilities(iBk0);
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate("weka/core/Capabilities.props");
      Evaluation evaluation0 = new Evaluation(instances0);
      try { 
        checkClassifier0.testWRTZeroR(iBk0, evaluation0, instances0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.lazy.IBk", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ZeroR zeroR0 = new ZeroR();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("6@#?");
      Evaluation evaluation0 = new Evaluation(instances0, (CostMatrix) null);
      try { 
        checkClassifier0.testWRTZeroR(zeroR0, evaluation0, instances0, instances0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(3268, 3268, 862, 3268, 3268, 3268, 12, 862, 9, true);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.makeTestDataset(3338, 3338, 3338, 3338, 3338, 3338, 2020, 2020, 2020, 2020, false);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-3759), (-3759), (-3759), (-3759), 2207, 16, (-3759), 31, 16, 28, false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-166), (-166), (-166), (-885), (-885), (-166), 817, (-885), (-166), (-166), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1284
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, false, false, 1703);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1703' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, true, true, false, true, true, 90);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '90' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(false, false, false, true, false, 2920);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '2920' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      checkClassifier0.testsPerClassType(0, true, false, false);
      assertEquals(1, checkClassifier0.getNumString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(false, false, false, true, true, false, 1, false, false, 3248);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "v@HoIeRv6";
      stringArray0[2] = "tqHoD";
      stringArray0[3] = "|XBg:s3ECf])";
      checkClassifier0.setOptions(stringArray0);
      assertEquals(1, checkClassifier0.getNumNumeric());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.setOptions(stringArray0);
      assertEquals(18, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ZeroR zeroR0 = (ZeroR)checkClassifier0.getClassifier();
      assertEquals("If set to true, classifier may output additional info to the console.", zeroR0.debugTipText());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SerializedClassifier serializedClassifier0 = new SerializedClassifier();
      checkClassifier0.setClassifier(serializedClassifier0);
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
  public void test67()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 2, true, false);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(false, false, false, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.doesntUseTestClassVal(false, true, false, false, false, false, 0);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, false, false, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, true, true, true, true, 1051, true, true, 1051);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1051' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      // Undeclared exception!
      checkClassifier0.correctBuildInitialisation(true, false, true, true, true, false, 4);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      checkClassifier0.setNumInstances(0);
      checkClassifier0.doTests();
      assertEquals(" ", checkClassifier0.getWordSeparators());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.correctBuildInitialisation(false, false, false, true, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, false, false, false, false, (-161), (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-161' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassificationViaRegression classificationViaRegression0 = new ClassificationViaRegression();
      CheckClassifier checkClassifier0 = new CheckClassifier();
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
  public void test77()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      NaiveBayesMultinomialText naiveBayesMultinomialText0 = new NaiveBayesMultinomialText();
      checkClassifier0.setClassifier(naiveBayesMultinomialText0);
      boolean[] booleanArray0 = checkClassifier0.updateableClassifier();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      JRip jRip0 = new JRip();
      checkClassifier0.setClassifier(jRip0);
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(30, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(16, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String string0 = checkClassifier0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
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
  public void test85()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumInstances(0);
      checkClassifier0.testsPerClassType(0, true, true, true);
      assertEquals(1, checkClassifier0.getNumRelational());
  }
}
