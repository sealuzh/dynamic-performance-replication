/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:16:12 GMT 2019
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
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.lazy.KStar;
import weka.classifiers.meta.Vote;
import weka.classifiers.rules.ZeroR;
import weka.classifiers.trees.M5P;
import weka.classifiers.trees.REPTree;

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
      checkClassifier0.setClassifier((Classifier) null);
      Classifier classifier0 = checkClassifier0.getClassifier();
      assertNull(classifier0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.declaresSerialVersionUID();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(true, false, true, false, false, true, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType((-1134), false, true, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-1134' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, false, false, false, false, Integer.MIN_VALUE);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2147483648' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, true, true, false, true, (-844));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-844' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(true, false, true, true, false, false, 1, true, false);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canPredict(false, false, false, false, false, true, (-787));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-787' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canPredict(true, true, false, true, true, false, 2);
      assertTrue(Arrays.equals(new boolean[] {false, true}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, false, true, true, false, false, 17);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '17' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleZeroTraining(true, false, false, true, true, false, 2);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleOnlyClass(false, true, false, true, false, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(true, true, true, true, true, true, 42);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.canHandleClassAsNthAttribute(false, false, false, true, true, false, 1, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.updatingEquality(false, true, false, true, false, false, 4303);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '4303' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.datasetIntegrity(true, true, false, true, true, false, 200003, true, true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '200003' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.correctBuildInitialisation(false, false, false, false, false, false, (-2187));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '-2187' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleZeroTraining(false, true, false, false, false, false, 26);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '26' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleOnlyClass(true, true, true, false, true, 10);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '10' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleNClasses(false, false, false, false, true, true, (-397));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: null
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "R:X@$(sYD5jI2a1";
      checkClassifier0.setOptions(stringArray0);
      assertEquals(1, checkClassifier0.getNumString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      ZeroR zeroR0 = (ZeroR)checkClassifier0.getClassifier();
      assertFalse(zeroR0.getDebug());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(true, true, false, false, false, true, 2, false, false);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.datasetIntegrity(false, false, false, true, false, false, 2, false, true);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(false, false, false, false, false, false, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.instanceWeights(false, false, false, true, false, true, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(true, true, false, false, true, false, 873);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '873' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.instanceWeights(false, false, true, true, true, true, 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.doesntUseTestClassVal(false, false, false, false, false, false, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: weka.classifiers.rules.ZeroR: Cannot handle string class!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.doesntUseTestClassVal(false, false, false, true, false, true, 1);
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(true, false, false, true, false, false, 1);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.updatingEquality(false, true, false, false, false, false, 0);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleMissing(true, false, true, false, false, true, 608, true, true, 608);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '608' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      boolean[] booleanArray0 = checkClassifier0.correctBuildInitialisation(false, false, false, false, false, true, 2);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      // Undeclared exception!
      try { 
        checkClassifier0.canHandleClassAsNthAttribute(true, true, true, true, true, true, 868, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error setting up for tests: Attribute type '868' unknown!
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      KStar kStar0 = new KStar();
      checkClassifier0.m_Classifier = (Classifier) kStar0;
      boolean[] booleanArray0 = checkClassifier0.updateableClassifier();
      assertTrue(Arrays.equals(new boolean[] {true, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      boolean[] booleanArray0 = checkClassifier0.canTakeOptions();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      boolean[] booleanArray0 = checkClassifier0.testToString();
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      M5P m5P0 = new M5P();
      checkClassifier0.setClassifier(m5P0);
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
  public void test43()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      Vote vote0 = new Vote();
      checkClassifier0.m_Classifier = (Classifier) vote0;
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
  public void test44()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setNumInstances(0);
      checkClassifier0.testsPerClassType(0, true, false, true);
      assertEquals(" ", checkClassifier0.getWordSeparators());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      LinearRegression linearRegression0 = new LinearRegression();
      linearRegression0.turnChecksOff();
      checkClassifier0.setClassifier(linearRegression0);
      // Undeclared exception!
      try { 
        checkClassifier0.testsPerClassType(0, true, false, false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Problem determining ZeroR performance: Loop has been executed more times than the allowed 10000
         //
         verifyException("weka.classifiers.CheckClassifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      checkClassifier0.doTests();
      assertFalse(checkClassifier0.hasClasspathProblems());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      REPTree rEPTree0 = new REPTree();
      checkClassifier0.m_Classifier = (Classifier) rEPTree0;
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(34, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.m_Classifier = null;
      String[] stringArray0 = checkClassifier0.getOptions();
      assertEquals(16, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      checkClassifier0.setClassifier((Classifier) null);
      Enumeration enumeration0 = checkClassifier0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CheckClassifier.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CheckClassifier checkClassifier0 = new CheckClassifier();
      String string0 = checkClassifier0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
}
