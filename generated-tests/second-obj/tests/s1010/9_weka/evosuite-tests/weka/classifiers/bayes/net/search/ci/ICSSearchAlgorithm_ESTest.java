/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:37:30 GMT 2018
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.CostMatrix;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.functions.SMO;
import weka.classifiers.lazy.kstar.KStarConstants;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.tokenizers.AlphabeticTokenizer;
import weka.core.tokenizers.WordTokenizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      
      String string1 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string1);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.maxCardinalityTipText();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.maxn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "C:eclipseworkspacewekadatacontact-lenses.arff";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "-cardinality";
      stringArray0[2] = "p";
      stringArray0[3] = "weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm";
      stringArray0[4] = "";
      stringArray0[5] = "wzt sa ";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"p\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(2521);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.contains(0);
      iCSSearchAlgorithm0.listOptions();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("bTZa4_&7a5r?M+$) ", arrayList0, 1);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (-3495));
      arrayList1.add(attribute0);
      iCSSearchAlgorithm0.setMaxCardinality(0);
      BayesNet bayesNet1 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances("N", arrayList1, 22);
      BayesNet bayesNet0 = new BayesNet();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.m_instances = instances0;
      int int0 = iCSSearchAlgorithm1.next((-1), (-1969), 2080, (boolean[][]) null);
      assertEquals(0, int0);
      
      String string0 = iCSSearchAlgorithm1.getRevision();
      assertEquals("8034", string0);
      
      iCSSearchAlgorithm1.setMaxCardinality(2);
      assertEquals(2, iCSSearchAlgorithm1.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean[][] booleanArray0 = new boolean[1][7];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = LinearRegression.SELECTION_GREEDY;
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 2);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      boolean[][] booleanArrayArray0 = null;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-988), 2, (-988), (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/9_weka/C:\\eclipse\\workspace\\weka\\data\\contact-lenses.arff");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Locale.LanguageRange> arrayList2 = new ArrayList<Locale.LanguageRange>();
      arrayList1.addAll((Collection<? extends Locale.LanguageRange>) arrayList2);
      Locale locale0 = Locale.KOREAN;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      ArrayList<Attribute> arrayList3 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("2[o>", arrayList0, 2206);
      iCSSearchAlgorithm0.toString();
      BayesNet bayesNet0 = new BayesNet();
      arrayList0.listIterator();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      Attribute attribute0 = new Attribute(".arff", 3314);
      arrayList0.add(attribute0);
      arrayList3.add(attribute0);
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[0][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm0.new SeparationSet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      Locale locale0 = Locale.JAPAN;
      Attribute attribute0 = new Attribute("", "");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Instances instances0 = new Instances("numeric", arrayList0, 0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      double double0 = KStarConstants.FLOOR;
      iCSSearchAlgorithm0.setMaxCardinality((-1376));
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
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.initAsNaiveBayesTipText();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      int[] intArray0 = new int[28];
      intArray0[0] = 2052;
      intArray0[2] = 2052;
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      intArray0[7] = 2052;
      intArray0[8] = 2052;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances("When set to true (default), the initial network used for structure learning is a Naive Bayes Network, that is, a network with an arrow from the classifier node to each other node. When set to false, an empty network is used as initial network structure", arrayList0, 2052);
      arrayList0.add((Attribute) null);
      BayesNet bayesNet0 = new BayesNet();
      Attribute attribute0 = new Attribute("8034");
      boolean[][] booleanArray0 = new boolean[1][2];
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = LinearRegression.SELECTION_GREEDY;
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      iCSSearchAlgorithm0.listOptions();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("bTZa4_&7a5r?M+$) ", arrayList0, 12);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("@relation", 2);
      arrayList0.add(attribute0);
      BayesNet bayesNet1 = new BayesNet();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      BayesNet bayesNet2 = iCSSearchAlgorithm0.m_BayesNet;
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
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Enumeration enumeration0 = new AlphabeticTokenizer();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Object object0 = new Object();
      Locale locale0 = Locale.US;
      Attribute attribute0 = new Attribute("rq8A} wip':!D5I", 3315);
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      instances0.deleteAttributeType(3315);
      arrayList0.add(attribute0);
      System.setCurrentTimeMillis((-3083L));
      BayesNet bayesNet0 = iCSSearchAlgorithm0.m_BayesNet;
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[8];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSet0;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Object object0 = new Object();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ArrayList<Locale.LanguageRange> arrayList1 = new ArrayList<Locale.LanguageRange>();
      Locale locale0 = Locale.JAPAN;
      locale0.getUnicodeLocaleKeys();
      Attribute attribute0 = new Attribute("rtq8A} wip':!D5I");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.setMaxCardinality((-2887));
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
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.globalInfo();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Instances instances0 = new Instances("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", arrayList0, 2054);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      Attribute attribute0 = new Attribute(".bsi", instances0, 2054);
      String string0 = CostMatrix.FILE_EXTENSION;
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm1.setMaxCardinality(4);
      iCSSearchAlgorithm0.getRevision();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attribute attribute1 = attribute0.copy(".bsi");
      int int0 = SMO.FILTER_NONE;
      Attribute attribute2 = new Attribute("");
      arrayList0.add(attribute2);
      attribute2.addStringValue(attribute1, 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      arrayList0.add(attribute0);
      attribute2.addStringValue("integer");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/9_weka/C:\\eclipse\\workspace\\weka\\data\\contact-lenses.arff");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      ICSSearchAlgorithm.main((String[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      double double0 = KStarConstants.ROOT_FINDER_ACCURACY;
      ICSSearchAlgorithm iCSSearchAlgorithm2 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm2.getRevision();
      iCSSearchAlgorithm2.getOptions();
      BayesNet.main((String[]) null);
      boolean[][] booleanArray0 = new boolean[7][3];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[6];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = true;
      booleanArray2[3] = true;
      booleanArray2[4] = false;
      booleanArray2[5] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[4];
      booleanArray3[0] = true;
      booleanArray3[1] = false;
      booleanArray3[2] = true;
      booleanArray3[3] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[4];
      booleanArray4[0] = true;
      booleanArray4[1] = false;
      booleanArray4[2] = false;
      booleanArray4[3] = false;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[2];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[6];
      booleanArray6[0] = false;
      booleanArray6[1] = true;
      booleanArray6[2] = true;
      booleanArray6[3] = true;
      booleanArray6[4] = false;
      booleanArray6[5] = false;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[1];
      booleanArray7[0] = true;
      booleanArray0[6] = booleanArray7;
      boolean[][] booleanArray8 = new boolean[8][4];
      booleanArray8[0] = booleanArray3;
      booleanArray8[1] = booleanArray6;
      booleanArray8[2] = booleanArray7;
      booleanArray8[3] = booleanArray7;
      booleanArray8[4] = booleanArray2;
      booleanArray8[5] = booleanArray1;
      booleanArray8[6] = booleanArray5;
      booleanArray8[7] = booleanArray1;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][2];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray8, iCSSearchAlgorithm_SeparationSetArray0);
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
      boolean[][] booleanArray0 = new boolean[1][7];
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      Locale.getISOLanguages();
      int int0 = LinearRegression.SELECTION_GREEDY;
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<Attribute> arrayList1 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 2);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      int int1 = (-1357);
      iCSSearchAlgorithm0.existsSepSet(2, 2, 2, booleanArray0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-1460), 3292, 3292, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3292
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      iCSSearchAlgorithm0.initAsNaiveBayesTipText();
      Attribute attribute0 = new Attribute("When set to true (default), the initial network used for structure learning is a Naive Bayes Network, that is, a network with an arrow from the classifier node to each other node. When set to false, an empty network is used as initial network structure", 3349);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.setMaxCardinality((-2908));
      iCSSearchAlgorithm0.getRevision();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/9_weka/C:\\eclipse\\workspace\\weka\\data\\contact-lenses.arff");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.initAsNaiveBayesTipText();
      Attribute attribute0 = new Attribute("Fm{=%)+Yc.N", 1515);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("string", arrayList0, 2080);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
      WordTokenizer wordTokenizer0 = new WordTokenizer();
      iCSSearchAlgorithm0.setMaxCardinality((-2));
      iCSSearchAlgorithm0.getRevision();
      arrayList0.add(attribute0);
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
}