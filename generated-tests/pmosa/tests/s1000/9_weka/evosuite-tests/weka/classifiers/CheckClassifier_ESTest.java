/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 15:21:34 GMT 2018
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Evaluation;
import weka.classifiers.meta.Bagging;
import weka.classifiers.meta.ClassificationViaRegression;
import weka.classifiers.rules.JRip;
import weka.classifiers.trees.J48;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.GlobalInfoJavadoc;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.core.Utils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.declaresSerialVersionUID();
      checkClassifier0.canTakeOptions();
      String[] stringArray0 = new String[0];
      checkClassifier0.setOptions(stringArray0);
      assertEquals(20, checkClassifier0.getNumInstances());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testToString();
      checkClassifier0.getRevision();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(1134, true, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1134' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.declaresSerialVersionUID();
      checkClassifier0.getRevision();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(true, false, true, false, false, false, 1354);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1354' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getRevision();
      checkClassifier0.updateableClassifier();
      boolean boolean0 = false;
      boolean boolean1 = true;
      boolean boolean2 = false;
      boolean boolean3 = true;
      int int0 = 0;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, true, false, true, true, true, 0, true, false, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, true, false, false, 57, true, false, 57);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '57' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "=== Test Dataset ===\n";
      stringArray0[2] = "";
      stringArray0[3] = " (OK error message)";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      CheckClassifier.main(stringArray0);
      boolean boolean1 = false;
      boolean boolean2 = true;
      checkClassifier0.setWordSeparators("");
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(true, false, false, false, true, true, 3277);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '3277' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.listOptions();
      boolean[] booleanArray0 = checkClassifier0.weightedInstancesHandler();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, true, true, true, true, 30);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '30' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, true, false, true, true, 4004);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '4004' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(3910, false, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '3910' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
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
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, false, true, false, 23);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '23' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      checkClassifier0.setDebug(true);
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, true, false, true, 908);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '908' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
      
      boolean[] booleanArray1 = checkClassifier0.datasetIntegrity(false, false, false, false, false, true, 1, false, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(0, false, false, false);
      checkClassifier0.weightedInstancesHandler();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumNumeric(4553);
      Utils.SMALL = (double) 4553;
      checkClassifier0.canHandleNClasses(true, false, true, false, false, false, 2067);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, true, false, false, true, false, 4553, 4553);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '4553' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testToString();
      String string0 = GlobalInfoJavadoc.GLOBALINFO_METHOD;
      checkClassifier0.declaresSerialVersionUID();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, true, true, true, true, 1123, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1123' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.setNumDate(1024);
      boolean boolean1 = true;
      int int0 = 0;
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, true, true, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = false;
      int int0 = 0;
      checkClassifier0.instanceWeights(true, false, true, true, true, false, 0);
      checkClassifier0.doTests();
      boolean boolean3 = true;
      boolean boolean4 = false;
      boolean boolean5 = false;
      checkClassifier0.canHandleZeroTraining(boolean3, boolean1, boolean4, boolean2, boolean3, boolean5, int0);
      checkClassifier0.getOptions();
      checkClassifier0.getRevision();
      JRip jRip0 = new JRip();
      boolean boolean6 = true;
      jRip0.setUsePruning(boolean6);
      int int1 = 186;
      jRip0.setOptimizations(int1);
      jRip0.toString();
      jRip0.getRevision();
      checkClassifier0.setClassifier(jRip0);
      checkClassifier0.multiInstanceHandler();
      boolean boolean7 = false;
      boolean boolean8 = false;
      boolean boolean9 = false;
      boolean boolean10 = false;
      int int2 = 0;
      checkClassifier0.doesntUseTestClassVal(boolean7, boolean8, boolean3, boolean9, boolean1, boolean10, int2);
      boolean boolean11 = true;
      boolean boolean12 = true;
      int int3 = 0;
      checkClassifier0.updatingEquality(boolean0, boolean7, boolean11, boolean11, boolean4, boolean12, int3);
      boolean boolean13 = true;
      boolean boolean14 = false;
      boolean boolean15 = true;
      boolean boolean16 = false;
      boolean boolean17 = true;
      checkClassifier0.canHandleMissing(boolean13, boolean14, boolean15, boolean16, boolean12, boolean17, int1, boolean8, boolean12, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, false, false, true, true, 0, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.printAttributeSummary(true, true, true, true, true, true, (-2056));
      boolean boolean0 = false;
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, true, false, false, true, (-2056), true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2056' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ">rS(S^E8\"_";
      CheckClassifier.main(stringArray0);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, true, false, false, 299);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '299' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.testsPerClassType(2, true, false, false);
      assertFalse(checkClassifier0.getDebug());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.testsPerClassType(2, true, false, false);
      assertEquals(1, checkClassifier0.getNumString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testToString();
      checkClassifier0.getRevision();
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.correctBuildInitialisation(false, true, false, false, false, false, 0);
      checkClassifier1.multiInstanceHandler();
      // Undeclared exception!
      try { 
        checkClassifier1.correctBuildInitialisation(false, false, true, false, false, true, 0);
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
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.setOptions(stringArray0);
      assertEquals(2, checkClassifier0.getNumNominal());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, true, true, false, true, true, 3, false, true, 3);
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
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, false, false, false, true, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(false);
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, false, false, false, true, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.testsPerClassType(0, false, false, false);
      checkClassifier0.correctBuildInitialisation(false, false, false, false, false, false, 0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      Bagging bagging0 = new Bagging();
      checkClassifier0.setClassifier(bagging0);
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, true, true, 39, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '39' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }
}
