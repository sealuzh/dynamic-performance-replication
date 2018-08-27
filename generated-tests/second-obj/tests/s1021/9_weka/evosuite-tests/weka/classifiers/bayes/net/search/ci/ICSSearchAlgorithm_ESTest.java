/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:03:30 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import weka.classifiers.AbstractClassifier;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.lazy.kstar.KStarConstants;
import weka.classifiers.meta.RegressionByDiscretization;
import weka.classifiers.meta.Vote;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1302));
      iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals((-1302), iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.maxn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(762);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[2];
      intArray0[1] = (-802);
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      intArray0[1] = (-793);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains(762);
      int int0 = KDTreeNodeSplitter.MAX;
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      boolean[][] booleanArray0 = new boolean[3][4];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[2];
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("~1{", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      iCSSearchAlgorithm0.next(0, 0, 628, booleanArray0);
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure((BayesNet) null, instances0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/users/apanichella/wekafiles/props/Capabilities.props");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-2);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute((String) null, linkedList0, 1);
      Attribute.typeToString(4);
      arrayList0.add(0, attribute0);
      arrayList0.spliterator();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      regressionByDiscretization0.globalInfo();
      Attribute attribute1 = new Attribute(" ", " ");
      arrayList0.add(attribute1);
      attribute1.equalsMsg(",56)");
      boolean[][] booleanArray0 = new boolean[1][9];
      iCSSearchAlgorithm0.getOptions();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("gl#LY>.|Bk*", "");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("", arrayList0, 1);
      Attribute attribute1 = new Attribute("integer", "");
      iCSSearchAlgorithm0.setMaxCardinality((-9));
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.add(attribute1);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      SystemInUtil.addInputLine("");
      Instances instances0 = new Instances(", {", arrayList0, 0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      instances0.deleteAttributeType(1899);
      regressionByDiscretization0.setDeleteEmptyBins(true);
      String string0 = " ";
      arrayList0.add((Attribute) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      bayesNet0.countsForInstance(binarySparseInstance0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      iCSSearchAlgorithm0.setMaxCardinality(6);
      String[] stringArray0 = new String[4];
      stringArray0[1] = " ";
      stringArray0[3] = "";
      ICSSearchAlgorithm.main(stringArray0);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 0);
      instances0.deleteAttributeType(1);
      Attribute attribute0 = new Attribute(" ", "");
      arrayList0.add(attribute0);
      Consumer<Locale.LanguageRange> consumer0 = (Consumer<Locale.LanguageRange>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(", {", arrayList0, 0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      instances0.deleteAttributeType(1899);
      regressionByDiscretization0.setDeleteEmptyBins(true);
      Attribute attribute0 = new Attribute("", "");
      arrayList0.add(attribute0);
      instances0.add((Instance) binarySparseInstance0);
      bayesNet0.countsForInstance(binarySparseInstance0);
      arrayList0.add(attribute0);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      boolean[][] booleanArray0 = new boolean[3][4];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      regressionByDiscretization0.getCapabilities();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute(".bsi", linkedList0, 1);
      iCSSearchAlgorithm0.toString();
      arrayList0.add(0, attribute0);
      attribute0.setWeight(1);
      int int0 = KStarConstants.M_AVERAGE;
      regressionByDiscretization0.getCapabilities();
      SystemInUtil.addInputLine("The month in which the work was published or, for an unpublished work, in which it was written. You should use the standard three-letter abbreviation, as described in Appendix B.1.3 of lhe LaTeX book.");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute1 = new Attribute("numeric");
      arrayList0.add(attribute1);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      bayesNet0.getCapabilities();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute((String) null, linkedList0, 1);
      iCSSearchAlgorithm0.toString();
      arrayList0.add(0, attribute0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/users/apanichella/wekafiles/props/Capabilities.props");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      attribute0.setWeight(1);
      AbstractClassifier.makeCopies(bayesNet0, 138);
      Attribute attribute1 = new Attribute("", "");
      arrayList0.add(attribute1);
      bayesNet0.measureExtraArcs();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      attribute1.equalsMsg(",56)");
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      arrayList0.listIterator(1);
      iCSSearchAlgorithm0.listOptions();
      boolean[][] booleanArray1 = new boolean[1][2];
      booleanArray1[0] = booleanArray0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray1, booleanArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      bayesNet0.getCapabilities();
      double double0 = KStarConstants.EPSILON;
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      regressionByDiscretization0.globalInfo();
      Attribute attribute0 = new Attribute(" ", " ");
      arrayList0.add(attribute0);
      bayesNet0.measureExtraArcs();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/users/apanichella/wekafiles");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".arff";
      attribute0.getRevision();
      regressionByDiscretization0.setDebug(false);
      stringArray0[1] = "relational";
      stringArray0[2] = "A regression scheme that employs any classifier on a copy of the data that has the class attribute discretized. The predicted value is the expected value of the mean class value for each discretized interval (based on the predicted probabilities for each interval). This class now also supports conditional density estimation by building a univariate density estimator from the target values in the training data, weighted by the class probabilities. \n\nFor more information on this process, see\n\nEibe Frank, Remco R. Bouckaert: Conditional Density Estimation with Class Probability Estimators. In: First Asian Conference on Machine Learning, Berlin, 65-81, 2009.";
      attribute0.equalsMsg(",56)");
      stringArray0[3] = "A regression scheme that employs any classifier on a copy of the data that has the class attribute discretized. The predicted value is the expected value of the mean class value for each discretized interval (based on the predicted probabilities for each interval). This class now also supports conditional density estimation by building a univariate density estimator from the target values in the training data, weighted by the class probabilities. \n\nFor more information on this process, see\n\nEibe Frank, Remco R. Bouckaert: Conditional Density Estimation with Class Probability Estimators. In: First Asian Conference on Machine Learning, Berlin, 65-81, 2009.";
      boolean[][] booleanArray0 = new boolean[16][9];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      boolean[][] booleanArray2 = new boolean[3][5];
      booleanArray2[1] = booleanArray1;
      booleanArray2[2] = booleanArray1;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray2);
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm0.setMaxCardinality(0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      boolean[][] booleanArray0 = new boolean[3][4];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      bayesNet0.getCapabilities();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute((String) null, linkedList0, 1);
      Attribute.typeToString((-1850));
      arrayList0.add(0, attribute0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(1);
      Attribute attribute1 = new Attribute(" ", " ");
      arrayList0.add(attribute1);
      iCSSearchAlgorithm0.existsSepSet(1, 1, 2, booleanArray0);
      bayesNet0.measureExtraArcs();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".arff";
      stringArray0[1] = "relational";
      stringArray0[2] = ".arff";
      attribute1.equalsMsg(",56)");
      stringArray0[3] = "@attribute";
      boolean[][] booleanArray1 = new boolean[1][9];
      boolean[] booleanArray2 = new boolean[2];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray1[0] = booleanArray2;
      booleanArray0[1] = booleanArray2;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray1, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      boolean[][] booleanArray0 = new boolean[3][4];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      bayesNet0.getCapabilities();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute(".bsi", linkedList0, 1);
      arrayList0.add(0, attribute0);
      attribute0.setWeight(1);
      AbstractClassifier.makeCopies(bayesNet0, 2);
      linkedList0.add((String) null);
      linkedList0.add("integer");
      Attribute attribute1 = attribute0.copy(".arff");
      arrayList0.add(attribute1);
      iCSSearchAlgorithm0.name(0);
      boolean[] booleanArray1 = new boolean[2];
      regressionByDiscretization0.listOptions();
      booleanArray1[0] = true;
      arrayList0.listIterator(1);
      arrayList0.add(attribute0);
      booleanArray0[2] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegressionByDiscretization regressionByDiscretization0 = new RegressionByDiscretization();
      boolean[][] booleanArray0 = new boolean[3][4];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances(",56)", arrayList0, 0);
      iCSSearchAlgorithm0.buildStructure(bayesNet0, instances0);
      bayesNet0.getCapabilities();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute(".bsi", linkedList0, 1);
      arrayList0.add(0, attribute0);
      attribute0.setWeight(1);
      AbstractClassifier.makeCopies(bayesNet0, 142);
      linkedList0.add((String) null);
      linkedList0.add("integer");
      Attribute attribute1 = attribute0.copy(".arff");
      arrayList0.add(attribute1);
      iCSSearchAlgorithm0.name(0);
      boolean[] booleanArray1 = new boolean[2];
      regressionByDiscretization0.listOptions();
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      arrayList0.listIterator(1);
      arrayList0.add(attribute0);
      booleanArray0[2] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }
}