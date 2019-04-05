/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:28:29 GMT 2019
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
import weka.classifiers.bayes.NaiveBayesMultinomialUpdateable;
import weka.classifiers.functions.SMOreg;
import weka.classifiers.meta.AdaBoostM1;
import weka.classifiers.meta.FilteredClassifier;
import weka.classifiers.misc.SerializedClassifier;
import weka.classifiers.rules.ZeroR;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.weightedInstancesHandler();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.multiInstanceHandler();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, true, false, false, true, (-5));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-5' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(21, false, false, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '21' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(1473, true, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1473' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset((-999), 200003, 72, (-1952), (-1), (-999), 1024, 24, (-3705), (-2534), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1855
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, false, false, (-1661));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1661' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.correctBuildInitialisation(false, true, true, false, true, false, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, true, false, false, false, true, (-3515));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-3515' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canPredict(false, false, true, false, false, false, 3);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleNClasses(true, true, false, false, false, false, 1704);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, true, true, true, true, 1013, true, true, 1013);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1013' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(true, true, false, false, false, true, 1, false, false, 7);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, true, false, false, false, (-1806), (-2680));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1806' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, true, true, true, 5);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '5' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      try { 
        checkClassifier0.makeTestDataset(15, 1511, 1511, (-465), (-3141), (-3141), (-1266), (-3141), 1476, false);
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
      try { 
        checkClassifier0.makeTestDataset(106, 106, 106, 106, 106, 1200, 106, 1200, 36, 106, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attribute type '36' unknown!
         //
         verifyException("weka.core.TestInstances", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      // Undeclared exception!
      try { 
        checkClassifier0.declaresSerialVersionUID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, true, true, true, false, true, 5038);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '5038' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(true, true, true, true, false, true, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "being";
      checkClassifier0.setOptions(stringArray0);
      assertFalse(checkClassifier0.getDebug());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ZeroR zeroR0 = (ZeroR)checkClassifier0.getClassifier();
      assertEquals("If set to true, classifier may output additional info to the console.", zeroR0.debugTipText());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SerializedClassifier serializedClassifier0 = new SerializedClassifier();
      checkClassifier0.m_Classifier = (Classifier) serializedClassifier0;
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
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, false, false, false, false, false, 1, false, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, true, true, false, true, 100, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '100' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(false, false, false, false, false, true, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, true, true, true, (-450));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-450' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, false, true, false, false, false, 2);
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
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, true, false, false, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle relational class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(true, true, true, false, true, false, 0);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, false, false, true, false, true, 1);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, false, false, false, (-2852), true, true, (-2852));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2852' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.correctBuildInitialisation(false, false, true, false, false, false, 4);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, true, true, true, false, true, 1000, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1000' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      NaiveBayesMultinomialUpdateable naiveBayesMultinomialUpdateable0 = new NaiveBayesMultinomialUpdateable();
      checkClassifier0.m_Classifier = (Classifier) naiveBayesMultinomialUpdateable0;
      boolean[] booleanArray0 = checkClassifier0.updateableClassifier();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      boolean[] booleanArray0 = checkClassifier0.testToString();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      SMOreg sMOreg0 = new SMOreg();
      checkClassifier0.setClassifier(sMOreg0);
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
  public void test40()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(0, true, false, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      checkClassifier0.doTests();
      assertEquals(" ", checkClassifier0.getWordSeparators());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      AdaBoostM1 adaBoostM1_0 = new AdaBoostM1();
      checkClassifier0.setClassifier(adaBoostM1_0);
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(27, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "  protected final static double[] MAX = new double[]{";
      stringArray0[1] = "";
      stringArray0[2] = "D$tb7[9>";
      stringArray0[3] = "=== Train Dataset ===\n";
      stringArray0[4] = "\tNumber of folds for reduced error pruning (default 3).";
      CheckClassifier.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "W,;^{ZimOKnB1Li";
      stringArray0[1] = "";
      stringArray0[2] = "-W";
      stringArray0[3] = ":";
      stringArray0[4] = ":bo%i%ZLI";
      stringArray0[5] = "";
      stringArray0[6] = "hlak!hum`o/k9";
      stringArray0[7] = "c{d}2R";
      try { 
        checkClassifier0.setOptions(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Can't find class called ':' or 'weka.classifiers.:'!
         //
         verifyException("weka.core.Check", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String string0 = checkClassifier0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      FilteredClassifier filteredClassifier0 = new FilteredClassifier();
      checkClassifier0.setClassifier(filteredClassifier0);
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
  public void test48()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
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
  public void test49()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, true, false, false, false, true, 0, false, false);
      assertEquals(2, booleanArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(18, stringArray0.length);
  }
}
