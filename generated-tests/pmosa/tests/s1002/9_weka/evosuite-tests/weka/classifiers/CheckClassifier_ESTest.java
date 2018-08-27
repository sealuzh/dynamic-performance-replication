/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 19:57:08 GMT 2018
 */

package weka.classifiers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.PrincipalComponents;
import weka.classifiers.CheckClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.CostMatrix;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.SGDText;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.CVParameterSelection;
import weka.classifiers.meta.MultiScheme;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.CheckScheme;
import weka.core.Instances;
import weka.core.TestInstances;
import weka.core.tokenizers.Tokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckClassifier_ESTest extends CheckClassifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      checkClassifier0.multiInstanceHandler();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(true, true, true, true, false, true, 350);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '350' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      CVParameterSelection cVParameterSelection0 = new CVParameterSelection();
      checkClassifier0.setClassifier(cVParameterSelection0);
      boolean[] booleanArray0 = checkClassifier0.canHandleOnlyClass(false, false, false, false, false, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleNClasses(false, false, false, true, true, false, 500);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
      
      checkClassifier0.getWords();
      checkClassifier0.weightedInstancesHandler();
      boolean[] booleanArray1 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      int int0 = (-935);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(false, false, true, true, false, false, (-935), (-935));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-935' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumInstancesRelational(0);
      checkClassifier0.getWords();
      checkClassifier0.updateableClassifier();
      checkClassifier0.getOptions();
      boolean[] booleanArray0 = checkClassifier0.canHandleMissing(true, false, false, true, true, false, 0, true, false, 0);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, false, false, false, 32);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '32' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canTakeOptions();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, false, false, false, 38, false, false, 38);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '38' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, false, false, true, 1855, true, true, 1855);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1855' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ersj";
      stringArray0[1] = "No pruning";
      stringArray0[2] = "#0~ng~[9";
      stringArray0[3] = "-Cd";
      stringArray0[4] = "\n=== Full report ===";
      stringArray0[5] = "6";
      stringArray0[6] = "=9:<aYhe?rCo, >";
      stringArray0[7] = "l=NhRdK~>";
      stringArray0[8] = "";
      checkClassifier0.setOptions(stringArray0);
      checkClassifier0.multiInstanceHandler();
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = true;
      boolean boolean2 = true;
      boolean boolean3 = false;
      int int0 = 1569;
      boolean boolean4 = false;
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, true, true, true, true, false, 1569, false, true, 1569);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1569' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.correctBuildInitialisation(true, true, true, true, false, false, 0);
      int int0 = 0;
      int int1 = (-744);
      boolean boolean1 = false;
      try { 
        checkClassifier0.makeTestDataset(0, 0, 0, 0, 0, 0, 0, 42, 0, (-744), false);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -744, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.instanceWeights(false, false, false, false, false, false, 0);
      checkClassifier0.getWords();
      checkClassifier0.setNumInstancesRelational(0);
      Classifier classifier0 = null;
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.makeTestDataset(480, 0, 4, 0, 4, 4, 4, 4, 0, false);
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
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, true, true, false, true, (-1), true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canHandleMissing(false, false, true, false, false, true, 3, true, false, (-495));
      checkClassifier0.canTakeOptions();
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
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 0);
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.canTakeOptions();
      checkClassifier0.doTests();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      int int0 = (-621);
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, false, false, (-621), false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-621' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      checkClassifier0.getOptions();
      CheckScheme.PostProcessor checkScheme_PostProcessor0 = new CheckScheme.PostProcessor();
      checkScheme_PostProcessor0.getRevision();
      checkClassifier0.setPostProcessor(checkScheme_PostProcessor0);
      int int0 = 1821;
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(true, false, true, false, true, false, 1821);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '1821' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setWordSeparators("(}V");
      checkClassifier0.datasetIntegrity(false, false, true, false, false, false, 0, false, false);
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = true;
      int int0 = (-1415);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(true, true, true, true, true, true, (-1415));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1415' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean boolean0 = false;
      boolean boolean1 = true;
      int int0 = 0;
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, false, true, true, 0);
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
      checkClassifier0.setWordSeparators("(}V");
      checkClassifier0.doesntUseTestClassVal(true, true, true, true, true, false, 0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      boolean[] booleanArray0 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      boolean boolean0 = true;
      boolean boolean1 = true;
      boolean boolean2 = true;
      boolean boolean3 = false;
      boolean boolean4 = false;
      int int0 = (-2610);
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(false, false, false, false, true, false, 546, true, false, (-2610));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '546' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      IBk iBk0 = new IBk();
      checkClassifier0.setClassifier(iBk0);
      checkClassifier0.setNumString(4);
      checkClassifier0.getOptions();
      checkClassifier0.declaresSerialVersionUID();
      checkClassifier0.getRevision();
      checkClassifier0.canHandleNClasses(false, true, false, false, false, true, 4);
      CheckClassifier checkClassifier1 = new CheckClassifier();
      checkClassifier1.correctBuildInitialisation(false, true, false, false, true, false, 4);
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setWordSeparators("(}V");
      checkClassifier0.datasetIntegrity(false, false, true, false, false, false, 0, false, false);
      checkClassifier0.canHandleOnlyClass(true, true, false, true, true, 0);
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(false, false, false, false, true, true, 0, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(true, false, false, false, true, false, 4, true, false);
      checkClassifier0.canTakeOptions();
      boolean[] booleanArray1 = checkClassifier0.declaresSerialVersionUID();
      assertFalse(booleanArray1.equals((Object)booleanArray0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Buffer is null!";
      stringArray0[1] = "RMQ-llp";
      stringArray0[2] = "JW}!@<";
      stringArray0[3] = "rw'>&|@aa";
      stringArray0[4] = "J91)$J>1cKDx6L X.";
      stringArray0[5] = "6VoQ^";
      stringArray0[6] = "";
      CheckClassifier.main(stringArray0);
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.canHandleZeroTraining(false, false, true, false, false, false, 4);
      checkClassifier0.datasetIntegrity(true, true, false, false, false, false, 4, true, false);
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, false, true, true, true, true, 24);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '24' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, true, true, true, false, false, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, true, true, true, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      CheckClassifier checkClassifier1 = new CheckClassifier();
      boolean boolean0 = true;
      boolean boolean1 = true;
      boolean boolean2 = false;
      int int0 = 3;
      boolean boolean3 = true;
      checkClassifier1.canHandleMissing(true, true, false, true, true, false, 3, true, true, 100);
      checkClassifier1.updateableClassifier();
      // Undeclared exception!
      try { 
        checkClassifier1.doesntUseTestClassVal(false, true, false, true, true, false, 100);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '100' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.getOptions();
      checkClassifier0.canHandleOnlyClass(false, false, true, true, true, 2);
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, false, true, false, true, 32);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '32' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      checkClassifier0.canTakeOptions();
      checkClassifier0.canTakeOptions();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "yCiraNut5uhuch!|";
      stringArray0[1] = ": ";
      stringArray0[2] = "'ra";
      stringArray0[3] = "bg";
      stringArray0[4] = "z";
      CheckClassifier.main(stringArray0);
      Classifier classifier0 = checkClassifier0.getClassifier();
      assertNull(classifier0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(false);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      checkClassifier0.setClassifier(inputMappedClassifier0);
      boolean boolean0 = true;
      boolean boolean1 = true;
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, true, true, false, true, true, (-2386));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2386' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setWordSeparators("(}V");
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, false, true, true, false, true, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setDebug(true);
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, true, true, false, false, false, 1);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.weightedInstancesHandler();
      checkClassifier0.setNumDate(229);
      checkClassifier0.setDebug(false);
      SGDText sGDText0 = new SGDText();
      Tokenizer tokenizer0 = sGDText0.getTokenizer();
      sGDText0.setTokenizer(tokenizer0);
      sGDText0.reset();
      checkClassifier0.setClassifier(sGDText0);
      checkClassifier0.setNumString(229);
      String[] stringArray0 = checkClassifier0.getOptions();
      checkClassifier0.declaresSerialVersionUID();
      checkClassifier0.getRevision();
      checkClassifier0.canHandleNClasses(false, false, false, false, false, false, 1);
      checkClassifier0.correctBuildInitialisation(false, false, false, false, false, true, 0);
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
  public void test36()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, false, false, false, false, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle relational class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }
}