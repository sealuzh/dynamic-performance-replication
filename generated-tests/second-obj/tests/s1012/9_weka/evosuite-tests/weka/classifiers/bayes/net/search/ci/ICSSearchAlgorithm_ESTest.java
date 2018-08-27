/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:06:44 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import weka.attributeSelection.PrincipalComponents;
import weka.attributeSelection.WrapperSubsetEval;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.functions.SGD;
import weka.classifiers.functions.SMO;
import weka.classifiers.functions.SMOreg;
import weka.classifiers.lazy.LWL;
import weka.classifiers.lazy.kstar.KStarConstants;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.neighboursearch.KDTree;
import weka.core.tokenizers.WordTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(23);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      FileSystemHandling.shouldAllThrowIOExceptions();
      iCSSearchAlgorithm_SeparationSet0.contains(0);
      PrincipalComponents principalComponents0 = new PrincipalComponents();
      Instances instances0 = iCSSearchAlgorithm0.m_instances;
      try { 
        principalComponents0.transformedData((Instances) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Principal components hasn't been built yet
         //
         verifyException("weka.attributeSelection.PrincipalComponents", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.globalInfo();
      iCSSearchAlgorithm0.setMaxCardinality((-1411));
      assertEquals((-1411), iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BayesNet bayesNet0 = new BayesNet();
      String[] stringArray0 = new String[10];
      ICSSearchAlgorithm.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-cardinality <num>";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm1.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(2688);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[2] = 1866;
      intArray0[3] = (-62);
      intArray0[5] = 2;
      intArray0[6] = (-3679);
      intArray0[7] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains((-3679));
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm0.setMaxCardinality((-3679));
      assertEquals((-3679), iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean[][] booleanArray0 = new boolean[9][1];
      boolean[] booleanArray1 = new boolean[3];
      booleanArray1[2] = false;
      booleanArray0[2] = booleanArray1;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      booleanArray0[3] = booleanArray1;
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      iCSSearchAlgorithm0.listOptions();
      int int0 = LWL.INVERSE;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", arrayList0, 3);
      arrayList0.add((Attribute) null);
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean[][] booleanArray0 = new boolean[5][1];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      
      int int0 = LinearRegression.SELECTION_NONE;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", arrayList0, 1);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      int int1 = iCSSearchAlgorithm0.next(1, 1, (-1), booleanArray0);
      assertEquals(2, int1);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean[][] booleanArray0 = new boolean[9][1];
      boolean[] booleanArray1 = new boolean[7];
      booleanArray0[0] = booleanArray1;
      FileSystemHandling.shouldAllThrowIOExceptions();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      
      int int0 = KStarConstants.ROOT_FINDER_MAX_ITER;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", arrayList0, 687);
      BayesNet bayesNet0 = new BayesNet();
      MockRandom mockRandom0 = new MockRandom();
      instances0.toSummaryString();
      mockRandom0.nextInt((-1));
      instances0.randomize(mockRandom0);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      iCSSearchAlgorithm0.existsSepSet(1, 1, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      int int0 = SGD.HINGE;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      Attribute attribute0 = new Attribute("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", 0);
      arrayList0.add(attribute0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      BayesNet bayesNet0 = new BayesNet();
      int int1 = SMO.FILTER_NORMALIZE;
      attribute0.setStringValue("string");
      Instances instances0 = new Instances("", arrayList0, 0);
      instances0.toArray();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.add(attribute0);
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
  public void test13()  throws Throwable  {
      int int0 = 0;
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      int int1 = SMOreg.FILTER_STANDARDIZE;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", arrayList0, 0);
      Attribute attribute0 = new Attribute("@data", instances0, 1);
      attribute0.setStringValue("@data");
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      arrayList0.add(attribute0);
      double double0 = KStarConstants.INITIAL_STEP;
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
      boolean[][] booleanArray0 = new boolean[5][1];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.toString();
      int int0 = KDTree.MIN;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("SearchAlgorithm\n", arrayList0, 1222);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ".arff");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute(".arff");
      String[] stringArray0 = new String[0];
      Attribute.main(stringArray0);
      SystemInUtil.addInputLine("@relation");
      attribute0.setWeight(0.0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.add(attribute0);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      Instances instances1 = inputMappedClassifier0.getModelHeader(instances0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      iCSSearchAlgorithm0.existsSepSet(1, 3, 2, booleanArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      instances0.toSummaryString();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      attribute0.addRelation(instances1);
      iCSSearchAlgorithm0.getRevision();
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
  public void test15()  throws Throwable  {
      boolean[][] booleanArray0 = new boolean[5][1];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.toString();
      int int0 = KDTree.MIN;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("SearchAlgorithm\n", arrayList0, 1222);
      BayesNet bayesNet0 = new BayesNet();
      SystemInUtil.addInputLine("@data");
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute0 = new Attribute("@data");
      SystemInUtil.addInputLine("@relation");
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Attribute attribute1 = new Attribute(".arff", arrayList1);
      attribute1.setWeight(0.0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.add(attribute1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Instances instances1 = new Instances(instances0, 0);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      FileSystemHandling.shouldAllThrowIOExceptions();
      inputMappedClassifier0.getModelHeader(instances0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      iCSSearchAlgorithm0.setMarkovBlanketClassifier(true);
      MockRandom mockRandom0 = new MockRandom();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      arrayList0.add(attribute0);
      BayesNet bayesNet1 = new BayesNet();
      boolean[][] booleanArray1 = new boolean[7][3];
      boolean[] booleanArray2 = new boolean[6];
      booleanArray2[0] = true;
      booleanArray2[1] = false;
      booleanArray2[2] = false;
      booleanArray2[3] = true;
      booleanArray2[4] = false;
      booleanArray2[5] = false;
      booleanArray1[0] = booleanArray2;
      boolean[] booleanArray3 = new boolean[7];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray3[2] = false;
      booleanArray3[3] = true;
      booleanArray3[4] = false;
      booleanArray3[5] = false;
      booleanArray3[6] = false;
      booleanArray1[1] = booleanArray3;
      boolean[] booleanArray4 = new boolean[4];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray4[3] = false;
      booleanArray1[2] = booleanArray4;
      boolean[] booleanArray5 = new boolean[6];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray5[2] = false;
      booleanArray5[3] = true;
      booleanArray5[4] = false;
      booleanArray5[5] = false;
      booleanArray1[3] = booleanArray5;
      boolean[] booleanArray6 = new boolean[2];
      booleanArray6[0] = true;
      booleanArray6[1] = false;
      booleanArray1[4] = booleanArray6;
      boolean[] booleanArray7 = new boolean[7];
      booleanArray7[0] = false;
      booleanArray7[1] = true;
      booleanArray7[2] = false;
      booleanArray7[3] = false;
      booleanArray7[4] = true;
      booleanArray7[5] = false;
      booleanArray7[6] = false;
      booleanArray1[5] = booleanArray7;
      boolean[] booleanArray8 = new boolean[5];
      booleanArray8[0] = false;
      booleanArray8[1] = true;
      booleanArray8[2] = false;
      booleanArray8[3] = false;
      booleanArray8[4] = true;
      booleanArray1[6] = booleanArray8;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      int int0 = LinearRegression.SELECTION_NONE;
      Attribute attribute0 = new Attribute("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      attribute0.addStringValue("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      Attribute.typeToString(0);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.setMaxCardinality((-202));
      Instances instances0 = new Instances("numeric", arrayList0, 4);
      MockRandom mockRandom0 = new MockRandom();
      BayesNet bayesNet0 = new BayesNet();
      arrayList0.add(attribute0);
      BayesNet bayesNet1 = new BayesNet();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
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
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      int int0 = LinearRegression.SELECTION_NONE;
      Attribute attribute0 = new Attribute("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      attribute0.addStringValue("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      Attribute.typeToString(0);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList1.add(attribute0);
      arrayList0.add("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      iCSSearchAlgorithm0.setMaxCardinality((-202));
      Instances instances0 = new Instances("numeric", arrayList1, 4);
      instances0.toArray();
      MockRandom mockRandom0 = new MockRandom();
      arrayList1.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      arrayList1.add(attribute0);
      WordTokenizer wordTokenizer0 = new WordTokenizer();
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
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      int int0 = WrapperSubsetEval.EVAL_ACCURACY;
      Attribute attribute0 = new Attribute("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      attribute0.addStringValue("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      arrayList0.clear();
      iCSSearchAlgorithm0.setMaxCardinality((-202));
      Instances instances0 = new Instances("numeric", arrayList0, 4);
      MockRandom mockRandom0 = new MockRandom();
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      FileSystemHandling.shouldAllThrowIOExceptions();
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      attribute0.indexOfValue("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.");
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }
}
